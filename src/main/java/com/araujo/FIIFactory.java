package com.araujo;

public class FIIFactory implements AtivoFactory {
    @Override
    public Ativo createAtivo(String ticker, String nome) {
        return new FII(ticker, nome);
    }
}
