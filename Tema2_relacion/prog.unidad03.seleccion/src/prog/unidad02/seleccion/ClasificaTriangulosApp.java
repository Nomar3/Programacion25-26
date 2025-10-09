package prog.unidad02.seleccion;

import java.util.Scanner;

public class ClasificaTriangulosApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa de Clasificación de Triángulos");
		System.out.println("Introduzca la longitud del primer lado: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca la longitud del primer lado: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca la longitud del primer lado: ");
		double c = Double.parseDouble(sc.nextLine());
		
		if (a == b && b == c)
			System.out.println("Este triangulo es equilatero");
		else if (a != b && a != c && c != b)
			System.out.println("Este triangulo es escaleno");
		else
			System.out.println("Este triangulo es isosceles");
		
		sc.close();
	}

}
