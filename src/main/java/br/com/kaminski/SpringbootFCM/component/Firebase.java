package br.com.kaminski.SpringbootFCM.component;

import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;
import com.google.firebase.messaging.Notification;
import org.springframework.stereotype.Component;

@Component
public class Firebase {

    public void notificarUsuarioPorTopico(NotificacaoTopicoForm notificacaoTopicoForm){

        Message message = Message.builder()
                .setTopic(notificacaoTopicoForm.getTopico())
                .setNotification(new Notification(notificacaoTopicoForm.getTitulo(), String.format("Unidade de saúde %s necessita de doadores de sangue %s.", notificacaoTopicoForm.getSolicitante(), notificacaoTopicoForm.getTopico())))
                .putData("content", notificacaoTopicoForm.getTitulo())
                .putData("body", notificacaoTopicoForm.getCorpo())
                .build();

        try{

            FirebaseMessaging.getInstance().send(message);

        }catch (FirebaseMessagingException e){
            e.printStackTrace();
        }

        System.out.println("Response: " + message);

    }
}