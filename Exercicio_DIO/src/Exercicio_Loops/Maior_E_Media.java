package Exercicio_Loops;

import java.util.Scanner;

public class Maior_E_Media {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int contador =0;
		int maior =0;
		int soma=0;
		do{
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if(numero > maior) maior = numero;
			
			contador ++;
			//System.out.println("Maior: " + maior);
		}while(contador <5);
		System.out.println("Maior: " + maior);
		System.out.println("maior: " + (soma/5));
		
		
		
	}

}
