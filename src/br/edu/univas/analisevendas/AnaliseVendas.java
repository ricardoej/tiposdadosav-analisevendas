package br.edu.univas.analisevendas;

public class AnaliseVendas {
	public int [][]matriz_vendas;
	
	public AnaliseVendas(int[][]matriz_vendas) {
		this.matriz_vendas = matriz_vendas;
	}

	public int calcularTotalVendasProduto(int id) {
		int soma_produto = 0;
		
		for(int i = 0; i < matriz_vendas[id].length; i++) {
				soma_produto +=  matriz_vendas[id][i];
		}
		return soma_produto;
	}
	
	public int identificarMesMaiorVendas() {
		int somaMes = 0;
		int maior_valor_venda = Integer.MIN_VALUE;
		int mesMaiorValor = 0;
		
		for(int i = 0; i < matriz_vendas[0].length; i++) {
			somaMes = 0;
			for(int j = 0; j < matriz_vendas.length; j++) {
				somaMes += matriz_vendas[j][i];
				if(somaMes > mesMaiorValor) {
					mesMaiorValor = i + 1;
					maior_valor_venda = somaMes;
				}
				}
			}
		return mesMaiorValor;
		}
	
	public int identificarMesMenorVendas() {
		int somaMes = 0;
		int menorMes = 0;
		int menorVenda = Integer.MAX_VALUE;
		
		for(int i = 0; i < matriz_vendas[0].length; i++) {
			somaMes = 0;
			for(int j = 0; j < matriz_vendas.length; j++) {
				somaMes += matriz_vendas[j][i];
				if(somaMes < menorVenda) {
					menorMes = j + 1;
					menorVenda = somaMes;
				}
				}
			}
		return menorMes;
	}

	public double calcularMediaVendasMensais(int id) {
		double soma_produto = 0;
		double divisor = 0;
		for(int i = 0; i < matriz_vendas[id].length; i++) {
				soma_produto +=  matriz_vendas[id][i];
				divisor = matriz_vendas[id].length;
		}
		double media = soma_produto / divisor;
		return media;
	}

	public int identificarProdutoMaisVendido() {
		int soma_produto = 0;
		int produto_mais_vendido = 0;
		double maior = Double.MIN_VALUE;
		for(int i = 0; i < matriz_vendas.length; i++) {
			soma_produto = 0;
			for(int j = 0; j < matriz_vendas[i].length; j++) {
				soma_produto +=  matriz_vendas[i][j];
				if(soma_produto > maior ) {
					maior = soma_produto;
					produto_mais_vendido = i;
				}
			}
		}
		return produto_mais_vendido;
	}

}
