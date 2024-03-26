package br.edu.univas.analisevendas;

public class AnaliseVendas {

	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] dadosVendas) {
		this.dadosVendas = dadosVendas;
	}

	public int calcularTotalVendasProduto(int produtoIndex) {
        int totalVendas = 0;
        for (int mes = 0; mes < 12; mes++) {
            totalVendas += dadosVendas[produtoIndex][mes];
        }
        return totalVendas;
    }

	 public int identificarMesMaiorVendas() {
	        int mesMaiorVendas = 1;
	        int maiorVendas = calcularTotalVendasMes(0);

	        for (int mes = 1; mes < 12; mes++) {
	            int totalVendasMes = calcularTotalVendasMes(mes);
	            if (totalVendasMes > maiorVendas) {
	                maiorVendas = totalVendasMes;
	                mesMaiorVendas = mes + 1; 
	            }
	        }

	        return mesMaiorVendas;
	    }

	 public int identificarMesMenorVendas() {
	        int mesMenorVendas = 1;
	        int menorVendas = calcularTotalVendasMes(0);

	        for (int mes = 1; mes < 12; mes++) {
	            int totalVendasMes = calcularTotalVendasMes(mes);
	            if (totalVendasMes < menorVendas) {
	                menorVendas = totalVendasMes;
	                mesMenorVendas = mes + 1; 	
	            }
	        }

	        return mesMenorVendas;
	    }

	 public double calcularMediaVendasMensais(int produtoIndex) {
	        int totalVendasProduto = calcularTotalVendasProduto(produtoIndex);
	        return totalVendasProduto / 12.0; 
	    }

	 public int identificarProdutoMaisVendido() {
	        int produtoMaisVendido = 0;
	        int maiorVendas = calcularTotalVendasProduto(0);

	        for (int produto = 1; produto < dadosVendas.length; produto++) {
	            int totalVendasProduto = calcularTotalVendasProduto(produto);
	            if (totalVendasProduto > maiorVendas) {
	                maiorVendas = totalVendasProduto;
	                produtoMaisVendido = produto;
	            }
	        }

	        return produtoMaisVendido;
	    }
	 
	 private int calcularTotalVendasMes(int mes) {
	        int totalVendasMes = 0;
	        for (int produto = 0; produto < dadosVendas.length; produto++) {
	            totalVendasMes += dadosVendas[produto][mes];
	        }
	        return totalVendasMes;
	    }

}
