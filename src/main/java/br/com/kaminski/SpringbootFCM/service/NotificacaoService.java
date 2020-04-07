package br.com.kaminski.SpringbootFCM.service;

import br.com.kaminski.SpringbootFCM.component.Firebase;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    @Autowired
    Firebase firebase;

    public void enviarNotificacaoPorTopico(NotificacaoTopicoForm notificacaoTopicoForm){
        firebase.notificarUsuarioPorTopico(notificacaoTopicoForm);
    }

}