package br.com.kaminski.SpringbootFCM.component;

import br.com.kaminski.SpringbootFCM.configure.NotificacaoParametro;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTokenForm;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import com.google.firebase.messaging.*;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public class Firebase {

    public void notificarUsuarioPorTopico(NotificacaoTopicoForm notificacaoTopicoForm){

        Message message = Message.builder()
                .setTopic(notificacaoTopicoForm.getTopico())
                .setNotification(new Notification(notificacaoTopicoForm.getTitulo(), String.format("Unidade de saúde %s necessita de doadores de sangue %s.", notificacaoTopicoForm.getSolicitante(), notificacaoTopicoForm.getTopico())))
                .putData("content", notificacaoTopicoForm.getTitulo())
                .putData("body", notificacaoTopicoForm.getCorpo())
                .setAndroidConfig(AndroidConfig.builder()
                        .setTtl(Duration.ofMinutes(2).toMillis())
                        .setPriority(AndroidConfig.Priority.HIGH)
                        .setNotification(
                                AndroidNotification.builder()
                                        .setSound(NotificacaoParametro.SOM.getValor())
                                        .setColor(NotificacaoParametro.COR.getValor()).build())
                        .build())
                .build();

        try{

            FirebaseMessaging.getInstance().send(message);

        }catch (FirebaseMessagingException e){
            e.printStackTrace();
        }

        System.out.println("Response: " + message);

    }

    public void notificarUsuarioPorToken(NotificacaoTokenForm notificacaoTokenForm){

        Message message = Message.builder()
                .setToken(notificacaoTokenForm.getToken())
                .setNotification(new Notification(notificacaoTokenForm.getTitulo(), String.format("Unidade de saúde %s necessita de doadores de sangue.", notificacaoTokenForm.getSolicitante())))
                .putData("content", notificacaoTokenForm.getTitulo())
                .putData("body", notificacaoTokenForm.getCorpo())
                .setAndroidConfig(AndroidConfig.builder()
                        .setTtl(Duration.ofMinutes(2).toMillis())
                        .setPriority(AndroidConfig.Priority.HIGH)
                        .setNotification(
                                AndroidNotification.builder()
                                        .setSound(NotificacaoParametro.SOM.getValor())
                                        .setColor(NotificacaoParametro.COR.getValor()).build())
                        .build())
                .build();

        try{

            FirebaseMessaging.getInstance().send(message);

        }catch (FirebaseMessagingException e){
            e.printStackTrace();
        }

        System.out.println("Response: " + message);

    }

}