package br.com.kaminski.SpringbootFCM.model.Form;

public class NotificacaoTopicoForm {

    private String titulo;
    private String corpo;
    private String solicitante;
    private String topico;

    public NotificacaoTopicoForm() {

    }

    public NotificacaoTopicoForm(String titulo, String corpo, String solicitante, String topico) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.solicitante = solicitante;
        this.topico = topico;
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

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }
}
