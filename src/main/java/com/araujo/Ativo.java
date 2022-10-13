package com.araujo;

public abstract class Ativo {

    private String ticker;
    private String nome;

    public Ativo(String ticker, String nome) {
        this.ticker = ticker;
        this.nome = nome;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
