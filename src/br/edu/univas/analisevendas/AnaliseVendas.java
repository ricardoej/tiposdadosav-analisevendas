package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] minhaMatriz) {
		dadosVendas = minhaMatriz;
	}
	

	public AnaliseVendas(int[][] dadosVendas) {
		// TODO Auto-generated constructor stub
	}

	public Object calcularTotalVendasProduto(int produto) {
		
		return null;
	}

	public int identificarMesMaiorVendas() {
		int maiorValorVendas = 0;
		int mesMaiorValor = Integer.MIN_VALUE;
		for(int i=0; i < dadosVendas[0].length; i++) {
			int somaDoMesI = 0;
			for(int j = 0; j < dadosVendas.length; j++) {
				somaDoMesI += dadosVendas[j][i];
			}
			if(somaDoMesI > maiorValorVendas) {
				mesMaiorValor = i;
				maiorValorVendas = somaDoMesI;
			}
		}
		return mesMaiorValor;
	}

	public Object identificarMesMenorVendas() {
		// TODO Auto-generated method stub
		return null;
	}

	public double calcularMediaVendasMensais(int produto) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object identificarProdutoMaisVendido() {
		int produtoMaiorValor = 0;
		double maiorValor = Double.MIN_VALUE;
		for(int i = 0; i < dadosVendas[i].length; i++) {
			int soma = 0;
			for(int j = 0; j < dadosVendas[i].lenght; j++) {
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
