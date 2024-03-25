package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] minhaMatriz) {
		dadosVendas = minhaMatriz;
	}

	public int calcularTotalVendasProduto(int produto) {
		int[]vetorDoProduto = dadosVendas[produto];
		int totalVendas = 0;
		for(int mes = 0; mes < vetorDoProduto.length; mes++)
		{
			totalVendas = totalVendas + vetorDoProduto[mes];
		}
		
		return totalVendas;
	}

	public int identificarMesMaiorVendas() {
		
		int maiorVendas = Integer.MIN_VALUE;
		int mesMaiorVendas = -1;
		
		for (int mes = 0; mes < dadosVendas[0].length; mes++)
		{
			int totalVendasMes = 0;
			
			for (int produto = 0; produto < dadosVendas.length; produto++)
			{
				totalVendasMes += dadosVendas[produto][mes];
			}
			
			if (totalVendasMes > maiorVendas)
			{
				maiorVendas = totalVendasMes;
				mesMaiorVendas = mes + 1;
			}
		}
		
		return mesMaiorVendas;
	}
	
	public int identificarMesMenorVendas() {
		
		int menorVendas = Integer.MAX_VALUE;
		int mesMenorVendas = -1;
		
		for (int mes = 0; mes < dadosVendas[0].length; mes++)
		{
			int totalVendasMes = 0;
			
			for (int produto = 0; produto < dadosVendas.length; produto++)
			{
				totalVendasMes += dadosVendas[produto][mes];
			}
			
			if (totalVendasMes < menorVendas)
			{
				menorVendas = totalVendasMes;
				mesMenorVendas = mes + 1;
			}
		}
		
		return mesMenorVendas;
	}
	
	public int identificarProdutoMaisVendido() {
		int maisVendido = 0;
		int totalMaisVendido = calcularTotalVendasProduto(0);
		
		for (int produto = 1; produto < dadosVendas.length; produto++)
		{
			int totalVendasProduto = calcularTotalVendasProduto(produto);
			if(totalVendasProduto > totalMaisVendido) {
				maisVendido = produto;
				totalMaisVendido = totalVendasProduto;
			}
		}
		
		return maisVendido;
	}
	
	public double calcularMediaVendasMensais(int produto) {
        int totalVendas = calcularTotalVendasProduto(produto);
        return (double) totalVendas / dadosVendas[produto].length;
	}
}
