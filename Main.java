package aula1;


public class Main {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		ContagemRegressiva a = new ContagemRegressiva();
		//a.contagem(10);
		//a.ola();
		Fatorial b = new Fatorial();
		b.contagemfatorial(3);
		int d = 3 ; 
		int c = 1;
		
		while (d > 0) {
			c = c*d;
			d--;
		}
		System.out.println(c);
		Fibonacci f = new Fibonacci();
		int res = f.calculafibonacci(4);
		Vetorial k = new Vetorial();
		//k.adicionar();
		Amatrix g = new Amatrix();
		g.matriz();
	}
}
