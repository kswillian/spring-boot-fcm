package br.com.kaminski.SpringbootFCM.configure;

public enum NotificacaoParametro {

    SOM("default"),
    COR("#ff1e00");

    private String valor;

    NotificacaoParametro(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
