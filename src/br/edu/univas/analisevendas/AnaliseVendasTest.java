package br.edu.univas.analisevendas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnaliseVendasTest {

    @Test
    public void calcularTotalVendasProduto() {
        int[][] dadosVendas = {
            {100, 120, 150, 130, 140, 160, 180, 170, 190, 200, 220, 210},
            {80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160}
        };
        AnaliseVendas analise = new AnaliseVendas(dadosVendas);

        assertEquals(1970, analise.calcularTotalVendasProduto(0));
        assertEquals(1620, analise.calcularTotalVendasProduto(1));
        assertEquals(1260, analise.calcularTotalVendasProduto(2));
    }

    @Test
    public void identificarMesMaiorVendas() {
        int[][] dadosVendas = {
            {100, 120, 150, 130, 140, 160, 180, 170, 190, 200, 220, 210},
            {80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160}
        };
        AnaliseVendas analise = new AnaliseVendas(dadosVendas);

        assertEquals(12, analise.identificarMesMaiorVendas());
    }

    @Test
    public void identificarMesMenorVendas() {
        int[][] dadosVendas = {
            {100, 120, 150, 130, 140, 160, 180, 170, 190, 200, 220, 210},
            {80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160}
        };
        AnaliseVendas analise = new AnaliseVendas(dadosVendas);

        assertEquals(1, analise.identificarMesMenorVendas());
    }

    @Test
    public void calcularMediaVendasMensais() {
        int[][] dadosVendas = {
            {100, 120, 150, 130, 140, 160, 180, 170, 190, 200, 220, 210},
            {80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160}
        };
        AnaliseVendas analise = new AnaliseVendas(dadosVendas);

        assertEquals(164.16, analise.calcularMediaVendasMensais(0), 0.009);
        assertEquals(135.0, analise.calcularMediaVendasMensais(1), 0.009);
        assertEquals(105.0, analise.calcularMediaVendasMensais(2), 0.009);
    }

    @Test
    public void identificarProdutoMaisVendido() {
        int[][] dadosVendas = {
            {100, 120, 150, 130, 140, 160, 180, 170, 190, 200, 220, 210},
            {80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190},
            {50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160}
        };
        AnaliseVendas analise = new AnaliseVendas(dadosVendas);

        assertEquals(0, analise.identificarProdutoMaisVendido());
    }
}

