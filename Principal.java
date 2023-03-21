package View;

import Controller.Quick;

public class Principal {

	public static void main(String[] args) {
		
		Quick quick = new Quick();
		
       int vetor [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1} ;
       int inicio  = 0 ;
       int fim = vetor.length- 1 ;
       
      quick.Quicksort(vetor, 0, fim);
       
		for (int valor : vetor ) {
			
			System.out.println(valor);
			
		}
		
	}

}
