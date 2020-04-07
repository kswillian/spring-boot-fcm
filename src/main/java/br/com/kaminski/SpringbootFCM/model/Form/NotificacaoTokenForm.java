package br.com.kaminski.SpringbootFCM.model.Form;

public class NotificacaoTokenForm {

    private String titulo;
    private String corpo;
    private String solicitante;
    private String token;

    public NotificacaoTokenForm() {

    }

    public NotificacaoTokenForm(String titulo, String corpo, String solicitante, String token) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.solicitante = solicitante;
        this.token = token;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
