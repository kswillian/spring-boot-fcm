package br.com.kaminski.SpringbootFCM.configure;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;

import java.io.FileInputStream;
import java.io.IOException;

public class FirebaseConfig {

    private static String firebaseConf = "/static/tipo-sanguineo-firebase-adminsdk-mxmyi-84ff5423c8.json";

    public static void inicializarConfiguracaoFirebase(){

        FileInputStream serviceAccount = null;
        FirebaseApp firebaseApp;

        try{

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(new ClassPathResource(firebaseConf).getInputStream())).build();

            if (FirebaseApp.getApps().isEmpty()) {
                firebaseApp = FirebaseApp.initializeApp(options);
            } else {
                firebaseApp = FirebaseApp.getInstance();
            }

            System.out.println("Firebase get started...");

        }catch (IOException e){
            System.out.println("Firebase failed..");
            e.printStackTrace();
        }

    }

}
