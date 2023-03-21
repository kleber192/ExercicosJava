package Controller;

public class Quick {

	public Quick() {
	super();
	}
	
	
	public int [] Quicksort (int [] vetor ,int inicio ,int fim ) {
		
		  if (fim > inicio ) {
			  
			  int pivoFixo = dividir (vetor,inicio,fim );
			  Quicksort (vetor ,pivoFixo - 1,inicio); 
			  Quicksort (vetor ,pivoFixo + 1,fim );
			  
		  }
		
		return vetor ;
		
		
	}


	public int dividir(int[] vetor, int inicio, int fim) {
		
		int pivo =  vetor [inicio ];
		int direita = fim ;
		int esquerda = inicio + 1 ;
		
		while (esquerda <= direita ) {
			
			while (esquerda <= direita &&  vetor [esquerda] <= pivo ) {
				
				esquerda ++;
				
			}
			
			while (direita >= esquerda && vetor [direita] > pivo ) {
				
				direita -- ;
				
			}
			  if ( esquerda < direita ) {
				  
				  troca(vetor,esquerda,direita);
				  esquerda ++;
				  direita -- ;
				  
			  }
			  
		}
		
		troca(vetor,inicio,direita);
		return direita;
	}


	private void troca(int[] vetor, int i, int j) {
		
		int aux = vetor [j];
		vetor [j] = vetor [i];
		vetor [i] = aux ;
		
		
	}
	
	
}
	