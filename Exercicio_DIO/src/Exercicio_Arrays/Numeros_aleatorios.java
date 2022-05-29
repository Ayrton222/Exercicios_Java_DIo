package Exercicio_Arrays;

import java.util.Random;

public class Numeros_aleatorios {
	
	public static void main(String[] args) {
		//Gerar numeros aleatorios
		Random random = new Random();
		
		int[] numerosAleatorios = new int [20];
		
		for(int i=0; i < numerosAleatorios.length; i++){
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("Numeros Aleatorios: ");
		for(int numero : numerosAleatorios ){
			System.out.print(numero + " ");
		}
		
		System.out.print("\nAntecessor dos Nunmeros Aleatorios: ");
		for(int numero : numerosAleatorios ){
			System.out.print((numero-1) + " ");
		}
		
		System.out.print("\nSucessores dos Nunmeros Aleatorios: ");
		for(int numero : numerosAleatorios ){
			System.out.print((numero+1) + " ");
		}
	}

}
