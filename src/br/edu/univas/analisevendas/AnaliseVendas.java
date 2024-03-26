package br.edu.univas.analisevendas;

public class AnaliseVendas {
	
	int[][]dadosVendas;
	
		
		public AnaliseVendas(int[][] minhaMatriz) {
			dadosVendas = minhaMatriz;
		}
		
		public int calcularTotalVendasPRoduto(int produto) {
			
			int[] vetorDoProduto = dadosVendas[produto];
			int total = 0;
			for (int i = 0; i < vetorDoProduto.length; i++) {
				total = total + vetorDoProduto[i];
			}
			return total;
}

 public int identificarProdutoMaisVendido() {
	 int produtoMaiorValor = 0;
	 double maiorValor = Double.MIN_VALUE;
	 for(int i = 0;i<dadosVendas.length;i++) {
		 int soma = 0;
		 for(int j=0;j<dadosVendas[i].length;j++) {
			 soma +=dadosVendas[i][j];
			 
			 
	}
	if(soma > maiorValor) {
		maiorValor = soma;
		produtoMaiorValor = i;
	}
 
}
	 
	return produtoMaiorValor;
	
 
 }
 
 

   

  public int identificarMesMaiorVendas() {
	int maiorValorVendas = Integer.MIN_VALUE;
	int mesMaiorValor = 0;
	
	
	for(int i = 0;i< dadosVendas[0].length; i++) {
		int somaDoMesI = 0;
		
		for(int j = 0;j< dadosVendas.length; j++) {
			somaDoMesI += dadosVendas[j][i];	
		}
		
		if(somaDoMesI > maiorValorVendas) {
			mesMaiorValor = i;
			maiorValorVendas = somaDoMesI;
		}
	}
	
	
	return mesMaiorValor;
}
}
