package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] vendas) {
		dadosVendas = vendas;
		
	}
	public int calcularTotalVendasProduto(int matriz) {
		int[] vetorDoProduto = dadosVendas[matriz];
		int total=0;
		for ( int i = 0; i < vetorDoProduto.length; i++) {
			total = total + vetorDoProduto[i];
		}
		return total;
	}

	public int identificarMesMaiorVendas() {
		int maiorValorVendas = Integer.MIN_VALUE;
		int mesMaiorValor = 0;
		
		for(int i = 0; i < dadosVendas[0].length; i++) {
			int somaDoMesI = 0;
			
			for (int j = 0; j < dadosVendas.length; j++) {
				somaDoMesI += dadosVendas[j][i];
			}
			if(somaDoMesI > maiorValorVendas) {
				mesMaiorValor = i+1;
				maiorValorVendas = somaDoMesI;
			}
		}
		return mesMaiorValor;
	}
	
	public int identificarMesMenorVendas() {
		int menorValorVendas = Integer.MAX_VALUE;
		int mesMenorValor = 0;
		
		for(int i = 0; i < dadosVendas[0].length; i++) {
			int somaDoMesI = 0;
			
			for (int j = 0; j < dadosVendas.length; j++) {
				somaDoMesI += dadosVendas[j][i];
			}
			if(somaDoMesI < menorValorVendas) {
				mesMenorValor = i+1;
				menorValorVendas = somaDoMesI;
			}
		}
		return mesMenorValor;
	}
	
	public double calcularMediaVendasMensais(int produto) {
		double soma = 0;
		for ( int i = 0; i < dadosVendas[produto].length; i++) {
			soma += dadosVendas[produto][i];
			
		}
		double media = soma/dadosVendas[produto].length;
		return media;
	}

	public int identificarProdutoMaisVendido() {
		int produtoMaiorValor = 0;
		double maiorValor = Double.MIN_VALUE;
		for (int i = 0; i < dadosVendas.length; i++) {
			int soma = 0;
			for(int j = 0; j < dadosVendas[i].length; j++) {
				soma += dadosVendas[i][j];	
			}
			if(soma > maiorValor) {
				maiorValor = soma;
				produtoMaiorValor = i;
			}
		}
		
		return produtoMaiorValor;
	}
}