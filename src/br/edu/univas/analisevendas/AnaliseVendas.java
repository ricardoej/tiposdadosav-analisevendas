package br.edu.univas.analisevendas;

public class AnaliseVendas{
	private int[][] _vendas;
	
	public AnaliseVendas(int vendas[][]) {
		_vendas = vendas;
	}
	
	public int calcularTotalVendasProduto(int produto) {
		int[] vendasProduto = _vendas[produto];
		int totalVendas = 0;
		
		for(int i = 0; i < vendasProduto.length; i++) {
			totalVendas += vendasProduto[i];
		}		
		return totalVendas;
	}
	
	public int identificarMesMaiorVendas() {
		int maiorVendasMes = -1;
		int mes = 0;
		
		for(int i = 0; i < _vendas[0].length; i++) {
			int vendasMes = 0;
			
			for(int j = 0; j < _vendas.length; j++) {
				vendasMes += _vendas[j][i];
			}
						
			if(vendasMes > maiorVendasMes) {
				maiorVendasMes = vendasMes;
				mes = i + 1;
			}
		}		
		return mes;
	}
	
	public int identificarMesMenorVendas() {
		int menorVendasMes = -1;
		int mes = 0;
		
		for(int i = 0; i < _vendas[0].length; i++) {
			int vendasMes = 0;
			
			for(int j = 0; j < _vendas.length; j++) {
				vendasMes += _vendas[j][i];
			}
			
			if(menorVendasMes == -1) {
				menorVendasMes = vendasMes;
				mes = i + 1;
				continue;
			}
			
			if(vendasMes < menorVendasMes) {
				menorVendasMes = vendasMes;
				mes = i + 1;
			}
		}		
		return mes;
	}
	
	public double calcularMediaVendasMensais(int produto) {
		int[] vendasProduto = _vendas[produto];
		int totalVendas = 0;
		
		for(int i = 0; i < vendasProduto.length; i++) {
			totalVendas += vendasProduto[i];
		}		
		return (double)totalVendas / vendasProduto.length;
	}
	
	public int identificarProdutoMaisVendido() {
		int maiorNumeroVendas = 0;
		int produto = 0;
		
		for(int i = 0; i < _vendas.length; i++) {
			int numeroVendas = 0;
			
			for(int j = 0; j < _vendas[i].length; j++) {
				numeroVendas += _vendas[i][j];
			}
						
			if(numeroVendas > maiorNumeroVendas) {
				maiorNumeroVendas = numeroVendas;
				produto = i;
			}
		}
		return produto;
	}
}