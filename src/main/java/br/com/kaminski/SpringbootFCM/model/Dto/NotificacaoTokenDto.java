package br.com.kaminski.SpringbootFCM.model.Dto;

import br.com.kaminski.SpringbootFCM.model.Form.NotificacaoTokenForm;

public class NotificacaoTokenDto {

    private String fcmId;
    private String token;

    public NotificacaoTokenDto(NotificacaoTokenForm notificacaoTokenForm, String firebaseMessaging) {
        this.fcmId = firebaseMessaging;
        this.token = notificacaoTokenForm.getToken();
    }

    public String getFcmId() {
        return fcmId;
    }

    public String getToken() {
        return token;
    }

}
