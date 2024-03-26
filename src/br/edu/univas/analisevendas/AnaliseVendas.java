package br.edu.univas.analisevendas;

public class AnaliseVendas {
	public int [][]matriz_vendas;
	
	public AnaliseVendas (int[][]matriz_vendas) {
		this.matriz_vendas = matriz_vendas;
	}

	public int calcularTotalVendasProduto(int id) {
		int soma_produto = 0;
		
		for (int i = 0; i < matriz_vendas[id].length; i++) {
			soma_produto += matriz_vendas[id][i];
		}
		return soma_produto;
		
	}

	public double calcularMediaVendasMensais(int produto) {
		double soma = 0;
		for (int i = 0; i < matriz_vendas[produto].length; i++) {
			soma += matriz_vendas[produto][i];
			
		}
		return soma / 12;
	}

	public Object identificarMesMenorVendas() {
		int menorValorVendas = Integer.MAX_VALUE;
		int mesMenorValor = 0;
		for (int i = 0; i < matriz_vendas[0].length; i++) {
			int somaDoMesI = 0;
			for (int j = 0; j < matriz_vendas.length; j++) {
				somaDoMesI += matriz_vendas[j][i];
				
			}
			if (somaDoMesI < menorValorVendas) {
				mesMenorValor = i+1                                                                               ;
				menorValorVendas = somaDoMesI;
			}
		}
		return mesMenorValor;
		
	}

	public int identificarProdutoMaisVendido() {
		int produtoMaiorValor = 0;
		double maiorValor = Double.MIN_VALUE;
		for (int i = 0; i < matriz_vendas.length; i++) {
			int soma = 0;
			for (int j = 0; j < matriz_vendas[i].length; j++) {
				soma += matriz_vendas[i][j];
			}
			if (soma > maiorValor) {
				maiorValor = soma;
				produtoMaiorValor = i;
			}
			
		}
	return produtoMaiorValor;
		
	}

	public int identificarMesMaiorVendas() {
		int maiorValorVendas = 0;
		int mesMaiorValor = Integer.MAX_VALUE;
		for (int i = 0; i < matriz_vendas[0].length; i++) {
			int somaDoMesI = 0;
			for (int j = 0; j < matriz_vendas.length; j++) {
				somaDoMesI += matriz_vendas[j][i];
				
			}
			if (somaDoMesI > maiorValorVendas) {
				mesMaiorValor = i+1                                                                               ;
				maiorValorVendas = somaDoMesI;
			}
		}
		return mesMaiorValor;
	}
}


