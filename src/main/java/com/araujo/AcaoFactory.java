package com.araujo;

public class AcaoFactory implements AtivoFactory {
    @Override
    public Ativo createAtivo(String ticker, String nome) {
        return new Acao(ticker, nome);
    }
}
