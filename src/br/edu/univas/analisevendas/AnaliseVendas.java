package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][] dadosVendas;
	
	public AnaliseVendas(int[][] dadosVendas) {
		this.dadosVendas = dadosVendas;
	}
	
	public int calcularTotalVendasProduto(int idProduto) {
		int total = 0;
		for(int i = 0; i < dadosVendas[idProduto].length;i++) {
			total += dadosVendas[idProduto][i]; 
		}
		return total;
	}
	
	public int identificarMesMenorVendas() {
		int menorValorVendas = Integer.MAX_VALUE;
		int mesMenorValor = 0;
		for(int i = 0; i < dadosVendas[0].length; i++) {
			int soma = 0;
			for(int j = 0; j < dadosVendas.length; j++) {
				soma += dadosVendas[j][i];
			}
			if(soma < menorValorVendas) {
				mesMenorValor = i+1;
				menorValorVendas = soma;
			}
		}
		return mesMenorValor;
	}
	
	public int identificarMesMaiorVendas() {
		int maiorValorVendas = Integer.MIN_VALUE;
		int mesMaiorValor = 0;
		for(int i = 0; i < dadosVendas[0].length; i++) {
			int soma = 0;
			for(int j = 0; j < dadosVendas.length; j++) {
				soma += dadosVendas[j][i];
			}
			if(soma > maiorValorVendas) {
				mesMaiorValor = i+1;
				maiorValorVendas = soma;
			}
		}
		return mesMaiorValor;
	}
	
	public double calcularMediaVendasMensais(int produto){
	    double soma = 0;
	    for (int i = 0; i < dadosVendas[produto].length; i++){
	        soma += dadosVendas[produto][i];
	    }
	    return soma / dadosVendas[produto].length;
	}

	public int identificarProdutoMaisVendido(){
	    int produtoMaiorValor = 0;
	    double maiorValor = Double.MIN_VALUE;
	    for (int i = 0; i < dadosVendas.length; i++){
	        int soma = 0;
	        for(int j = 0; j < dadosVendas[i].length; j++){
	            soma += dadosVendas[i][j];
	        }
	        if(soma > maiorValor){
	            maiorValor = soma;
	            produtoMaiorValor = i;
	        }
	    }
	    return produtoMaiorValor;
	}

}
