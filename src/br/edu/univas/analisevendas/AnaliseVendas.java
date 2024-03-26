package br.edu.univas.analisevendas;

public class AnaliseVendas {
    private int[][] dadosVendas;

    public AnaliseVendas(int[][] dadosVendas) {
        this.dadosVendas = dadosVendas;
    }

    public int calcularTotalVendasProduto(int produto) {
        int total = 0;
        for (int mes = 0; mes < dadosVendas[produto].length; mes++) {
            total += dadosVendas[produto][mes];
        }
        return total;
    }

    public int identificarMesMaiorVendas() {
        int mesMaiorVendas = 0;
        int maiorVendas = 0;
        for (int mes = 0; mes < dadosVendas[0].length; mes++) {
            int totalMes = 0;
            for (int produto = 0; produto < dadosVendas.length; produto++) {
                totalMes += dadosVendas[produto][mes];
            }
            if (totalMes > maiorVendas) {
                maiorVendas = totalMes;
                mesMaiorVendas = mes + 1;
            }
        }
        return mesMaiorVendas;
    }

    public int identificarMesMenorVendas() {
        int mesMenorVendas = 0;
        int menorVendas = Integer.MAX_VALUE;
        for (int mes = 0; mes < dadosVendas[0].length; mes++) {
            int totalMes = 0;
            for (int produto = 0; produto < dadosVendas.length; produto++) {
                totalMes += dadosVendas[produto][mes];
            }
            if (totalMes < menorVendas) {
                menorVendas = totalMes;
                mesMenorVendas = mes + 1;
            }
        }
        return mesMenorVendas;
    }

    public double calcularMediaVendasMensais(int produto) {
        double total = 0;
        for (int mes = 0; mes < dadosVendas[produto].length; mes++) {
            total += dadosVendas[produto][mes];
        }
        return total / dadosVendas[produto].length;
    }

    public int identificarProdutoMaisVendido() {
        int produtoMaisVendido = 0;
        int totalMaisVendido = 0;
        for (int produto = 0; produto < dadosVendas.length; produto++) {
            int totalProduto = 0;
            for (int mes = 0; mes < dadosVendas[produto].length; mes++) {
                totalProduto += dadosVendas[produto][mes];
            }
            if (totalProduto > totalMaisVendido) {
                totalMaisVendido = totalProduto;
                produtoMaisVendido = produto;
            }
        }
        return produtoMaisVendido;
    }
}