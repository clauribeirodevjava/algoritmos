package br.com.claudemir.algoritmos;

import java.util.Scanner;

public class SelecitonSort {
	public static void main(String[] args) {
		int vetor[] = null;
		int valor;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		
		int tv = scan.nextInt();
		vetor = new int[tv];
		
		for(int i = tv; i > 0; i--) {
			System.out.println("Digite o elemento "+(tv + 1 - i)+": ");
			valor = scan.nextInt();
			vetor[i-1] = valor;
		}
	
		scan.close();
		int menor;
		
		for(int i = 0; i < vetor.length - 1; i++) {
			menor = i;
			for(int j = i+1; j < vetor.length; j++) {
				if(vetor[j] < vetor[menor]) {
					menor = j;
				}
			}
			if(i!=menor) {
				int aux = vetor[i];
				vetor[i] = vetor[menor];
				vetor[menor] = aux;
			}
		}
		for(int i : vetor) {
			System.out.println("["+i+"]");
		}
		
	}
}

