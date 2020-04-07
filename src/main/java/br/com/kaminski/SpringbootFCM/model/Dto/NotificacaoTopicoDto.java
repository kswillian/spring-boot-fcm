package br.com.kaminski.SpringbootFCM.model.Dto;

import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTopicoForm;

public class NotificacaoTopicoDto {

    private String fcmId;
    private String topico;

    public NotificacaoTopicoDto(NotificacaoTopicoForm notificacaoTopicoForm, String firebaseMessaging) {
        this.fcmId = firebaseMessaging;
        this.topico = notificacaoTopicoForm.getTopico();
    }

    public String getFcmId() {
        return fcmId;
    }

    public String getTopico() {
        return topico;
    }

}
