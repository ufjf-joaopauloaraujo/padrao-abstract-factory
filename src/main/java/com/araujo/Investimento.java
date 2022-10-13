package com.araujo;

public class Investimento {

    private AtivoFactory ativoFactory;
    private Ativo ativo;
    private Integer qtd;

    public Investimento(AtivoFactory ativoFactory, String ticker, String nome, Integer qtd) {
        if (ativoFactory == null) {
            throw new NullPointerException("AtivoFactory nulo!");
        }

        this.ativoFactory = ativoFactory;
        ativo = ativoFactory.createAtivo(ticker, nome);
        this.qtd = qtd;
    }

    public Ativo getAtivo() {
        return ativo;
    }

    public void setAtivo(Ativo ativo) {
        this.ativo = ativo;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }
}
