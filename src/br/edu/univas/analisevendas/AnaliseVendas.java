package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] minhaMatriz) {
		dadosVendas = minhaMatriz;
	}

	
	public int calcularTotalVendasProduto(int produto) {
		int[] vetorDoProduto = dadosVendas[produto];
		int total = 0;
		for (int i = 0; i < vetorDoProduto.length;i++) {
			total = total + vetorDoProduto[i];
		}
		return total;
	}

	public int identificarMesMaiorVendas() {
		//i 0 A 11
		//j 0 A 3
		int maiorValorVendas =Integer.MIN_VALUE; //MAIOR SOMA
		int MesMaiorValor = 0; //MAIOR VALOR
		
		for(int i = 0;i < dadosVendas[0].length;i++) {
			int somadomesI = 0;
			
			for(int j = 0;j < dadosVendas.length;j++) {
				somadomesI = somadomesI + dadosVendas[j][i];
			}
			if(somadomesI > maiorValorVendas) {
				//i+1 = porque o mes começa 1 janeiro
				MesMaiorValor = i+1;
				maiorValorVendas = somadomesI;
			}
		}
		return MesMaiorValor;
	}


	public double calcularMediaVendasMensais(int produto) {
		double soma = 0;
		for (int i = 0;i < dadosVendas[produto].length;i++) {
			soma = soma + dadosVendas[produto][i]; 
		}
		double media = soma / dadosVendas[produto].length;
		return media;
	}


	public int identificarProdutoMaisVendido() {
		//produto maior valor variavel para o produto
		int produtoMaiorValor = 0;
		double maiorValor = Double.MIN_VALUE;
		for (int i = 0;i < dadosVendas.length;i++) {
			int soma = 0;
			for(int j = 0; j < dadosVendas[i].length;j++) {
				soma = soma + dadosVendas[i][j];
			}
				if(soma > maiorValor) {
					maiorValor = soma;
					produtoMaiorValor = i;
				}
		}
		return produtoMaiorValor;
	}


	public int identificarMesMenorVendas() {
		int menorValorVendas =Integer.MAX_VALUE; //MAIOR SOMA
		int MesMenorValor = 0; //MAIOR VALOR
		
		for(int i = 0;i < dadosVendas[0].length;i++) {
			int somadomesI = 0;
			
			for(int j = 0;j < dadosVendas.length;j++) {
				somadomesI = somadomesI + dadosVendas[j][i];
			}
			if(somadomesI < menorValorVendas) {
				//i+1 = porque o mes começa 1 janeiro
				MesMenorValor = i+1;
				menorValorVendas = somadomesI;
			}
		}
		return MesMenorValor;
	}
}