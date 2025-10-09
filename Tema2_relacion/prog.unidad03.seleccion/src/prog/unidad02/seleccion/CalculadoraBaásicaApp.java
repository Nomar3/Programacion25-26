package prog.unidad02.seleccion;

import java.util.Scanner;

public class CalculadoraBaásicaApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa de Cálculadora Básica");
		System.out.println("Introduzca operacion a realizar: ");
		System.out.println("(S para suma, R para rresta, P para producto y D para division) ");

		char operacion = sc.nextLine().charAt(0);
		if (operacion == 'S' || operacion == 'R' || operacion == 'P' || operacion == 'D') {
			System.out.println("Introduzca primer numero: ");
			double n1 = Double.parseDouble(sc.nextLine());
			System.out.println("Introduzca segundo numero: ");
			double n2 = Double.parseDouble(sc.nextLine());
			switch(operacion) {
				case 'S':
					System.out.println("El resultado de sumar " + n1 + " y " + n2 + " es " + (n1 + n2));
					break;
				case 'R': 
					System.out.println("El resultado de restar " + n1 + " y " + n2 + " es " + (n1 - n2));
					break;
				case 'P': 
					System.out.println("El resultado de multiplicar " + n1 + " y " + n2 + " es " + (n1 * n2));
					break;
				case 'D': 
					System.out.println("El resultado de dividir " + n1 + " y " + n2 + " es " + (n1 / n2));
					break;
				default: 
					System.out.println("Fallo inesperado");
					break;
			}
		}
		else
			System.out.println("Esa orden no es correcta, letra minuscula o equivocada");
		sc.close();
	}

}
