package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][]dadosVendas;
	
	public AnaliseVendas(int[][] minhaMatriz) {
		dadosVendas = minhaMatriz;
	}
	
	public int calcularTotalVendasProduto(int Produto) {
		int[] vetorDoProduto = dadosVendas[Produto];
		int total = 0;
		for (int i = 0; i < vetorDoProduto.length ; i ++) {
			total = total + vetorDoProduto[i];
		
	}
		return total;
		
	}

	public int identificarMesMenorVendas() {
		int menorValorVendas= Integer.MAX_VALUE;
		int mesMenorValor = 0;
		for (int i = 0; i < dadosVendas[0].length;i ++) {
			int somaDoMesI = 0;
			for(int j=0; i < dadosVendas[i].length;j++) {
				somaDoMesI += dadosVendas[i][j];
				
			}
			if(somaDoMesI < mesMenorValor) {
				mesMenorValor = i+1;
				menorValorVendas = somaDoMesI;
			}
		}
		return mesMenorValor;
	}
	
	
	public double calcularMediaVendasMensais(int Produto) {
		double soma = 0;
		for (int i = 0; i < dadosVendas[Produto].length; i++) {
			soma += dadosVendas[Produto][i];
		}
		double media = soma / dadosVendas[Produto].length;
		return media;
	}

	public Object identificarMesMaiorVendas() {
		int maiorValorVendas = 0;
		int mesMaiorValor = Integer.MIN_VALUE;
		for(int i = 0; i <dadosVendas[0].length; i++) {
			int somaDoMesI = 0;
			for(int j = 0; j < dadosVendas.length; j++) {
				somaDoMesI += dadosVendas[i][j];
			}
			if (somaDoMesI > maiorValorVendas) {
				mesMaiorValor = i;
				maiorValorVendas = somaDoMesI;
			}
		}
		return mesMaiorValor;
	}

	public Object identificarProdutoMaisVendido() {
		int produtoMaiorValor = 0;
		double maiorValor = Double.MIN_VALUE;
		for(int i = 0; i< dadosVendas.length; i++) {
			int soma = 0;
			for(int j = 0; i < dadosVendas[i].length; j++) {
				soma += dadosVendas[i][j];
			}
			if (soma > maiorValor){
				maiorValor = soma;
				produtoMaiorValor = i;
			}
		}return produtoMaiorValor;

	}
}			
