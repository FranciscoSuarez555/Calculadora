package ar.com.fran;

public class Principal {

	public static void main (String[] args) {
		Calculadora calculadora = new Calculadora();
		System.out.println("La suma entre los dos numeros es : " + calculadora.suma(2,4) );
		System.out.println("La resta de los dos numeros es : " + calculadora.resta(4, 2) );
		System.out.println("La multiplicacion entre los dos numeros es : " + calculadora.multiplicacion(2, 3));
		System.out.println("La division entre los dos numeros es : " + calculadora.division(2, 2) );
	
	}
}
