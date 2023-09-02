package aula1;

public class Fibonacci {

static int calculafibonacci(int numero) {
	if(numero <=0 ) {
		return 0;
	}
	else if (numero == 1) {
		return 1;
	}
	else {
		return calculafibonacci(numero-1)+calculafibonacci(numero-2);
	}
}
}
