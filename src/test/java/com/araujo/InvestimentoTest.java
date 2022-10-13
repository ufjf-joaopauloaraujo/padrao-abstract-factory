package com.araujo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InvestimentoTest {

    public static final String MSFT = "MSFT";
    public static final String MSFT_NOME = "Microsoft";
    public static final String XPLG11 = "XPLG11";
    public static final String XPLG11_NOME = "XP Log FII";
    public static final int QTD = 100;

    @Test
    void validaAtivoFactoryNulo() {
        try {
            Investimento inv = new Investimento(null, MSFT, MSFT_NOME, QTD);
            fail();
        } catch (NullPointerException e) {
            assertEquals("AtivoFactory nulo!", e.getMessage());
        }
    }

    @Test
    void validaAtivoFactoryAcao() {
        AtivoFactory af = new AcaoFactory();
        Investimento inv = new Investimento(af, MSFT, MSFT_NOME, QTD);
        assertEquals(Acao.class, inv.getAtivo().getClass());
        assertEquals(MSFT, inv.getAtivo().getTicker());
        assertEquals(MSFT_NOME, inv.getAtivo().getNome());
        assertEquals(QTD, inv.getQtd());
    }

    @Test
    void validaAtivoFactoryFII() {
        AtivoFactory af = new FIIFactory();
        Investimento inv = new Investimento(af, XPLG11, XPLG11_NOME, QTD);
        assertEquals(FII.class, inv.getAtivo().getClass());
        assertEquals(XPLG11, inv.getAtivo().getTicker());
        assertEquals(XPLG11_NOME, inv.getAtivo().getNome());
        assertEquals(QTD, inv.getQtd());
    }
}
