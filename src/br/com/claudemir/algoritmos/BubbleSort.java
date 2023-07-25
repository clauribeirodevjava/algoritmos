package br.com.claudemir.algoritmos;

public class BubbleSort {
	public static void main(String[] args) {
		int[] elementos = {8,4,7,2,5};
		int i = elementos.length; //tamanho
		
		while(true) {
			if(i == 1) {
				break;
			}
			int j = 0;
			while(true) {
				if(j > i - 2) {
					i = i -1;
					break;
				}
				if( !(elementos[j] < elementos[j+1]) ) {
					
					int aux = elementos[j];
					 elementos[j] =  elementos[j+1];
					 elementos[j+1] = aux;
				}
				j = j + 1;
			}
		}
		for (int q : elementos) {
			System.out.println(q +" ");
			
		}
	}
	
}
