package aula1;

import java.util.Scanner;

public class Vetorial {
	static int ve[] = new int[9];
	static void adicionar() {
		Scanner scan = new Scanner(System.in);
		int quan;
		System.out.print("adicione o numero de variaveis que deseja inserir:");
		quan = scan.nextInt();
		for(int i=0; i<quan;i++) {
			System.out.print("|adicione o numero:");
			ve[i] = scan.nextInt();	
			System.out.print("|o numero adicionado foi:  ");
			System.out.print(ve[i]);
			System.out.print("|na: ");
			System.out.print(i);
			if (i==9) {
				int total = 0;
				for(int k = 0; i<k; k++) {
					total = total + ve[k];
					 
				}
			System.out.print("o resultado total é:");
			System.out.print(total);
			}
		}
			
	}
	}


