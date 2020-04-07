package br.com.kaminski.SpringbootFCM.service;

import br.com.kaminski.SpringbootFCM.component.Firebase;
import br.com.kaminski.SpringbootFCM.model.Dto.NotificacaoTokenDto;
import br.com.kaminski.SpringbootFCM.model.Dto.NotificacaoTopicoDto;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTokenForm;
import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificacaoService {

    @Autowired
    Firebase firebase;

    public NotificacaoTopicoDto enviarNotificacaoPorTopico(NotificacaoTopicoForm notificacaoTopicoForm){
        return firebase.notificarUsuarioPorTopico(notificacaoTopicoForm);
    }

    public NotificacaoTokenDto enviarNotificacaoPorToken(NotificacaoTokenForm notificacaoTokenForm){
        return firebase.notificarUsuarioPorToken(notificacaoTokenForm);
    }

}