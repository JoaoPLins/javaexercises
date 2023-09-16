package Aula3;

import java.util.Random;



public class Main {

	static long timestart;
	static long timeend;
	
	public static void exibeVetor(int Vetor[]) {
		for (int a = 0; a < Vetor.length - 1; ++a) {
			System.out.print(Vetor[a]+ " ");
		}
	}
	
	public static int[] vetorAleatorio() {
		
		int[] novovetor = new int[1000];
		Random rd = new Random();
		for (int i=0;i < novovetor.length;i++) {
			novovetor[i] = rd.nextInt(1000);
		}
		//exibeVetor(novovetor);
		return novovetor;
	}

	public static void relogiostart() {
		timestart = System.currentTimeMillis();
				
	}
	
	public static void mostrarTempo() {
		timeend = System.currentTimeMillis();
		long timedisplayed = timeend - timestart;
		System.out.println(timedisplayed);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relogiostart();
		int vetor[] = vetorAleatorio();
		int vetora[] = vetor;
		
		for (int i = 0; i < vetora.length - 1; ++i) {
			int min = i;
			for (int j = i+1;j<vetora.length ; ++j) {
				if (vetora[j]<vetora[min]) {
					min = j;
				}
			}
		if ( min!=i ) {
			int aux = vetora[i];
			vetora[i] = vetora[min];
			vetora[min] = aux;
			}
		}
		
		exibeVetor(vetora);
		System.out.println();
		mostrarTempo();
		relogiostart();
		
	for (int i = 1; i < vetor.length; i++) {
		int aux = vetor [i];
		int j = i;
		while (( j>0 ) && (vetor[j-1] > aux)){
			vetor[j] =  vetor[j-1];
			j -= 1;
		}
		vetor[j] = aux;
		
		}
	exibeVetor(vetor);
	System.out.println();
	mostrarTempo();
	}
	
}	
	
	
	
