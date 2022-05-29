package Exercicio_Arrays;

public class Ordem_inversa {
	
	public static void main(String[] args) {
		
		int[] vetor = {-5, -6, 15, 50, 8, 4};
		
		//System.out.println(vetor);
		
		//System.out.println(vetor.length);
		System.out.print("Vetor: ");
		int contador =0;
		while(contador < (vetor.length)){
			System.out.print(vetor[contador] + " ");
			contador++;
		}
		System.out.print("\nVetor: ");
		for(int i =(vetor.length-1); i >= 0; i -- ){
			System.out.print(vetor[i] + " ");
		}
	}

}
