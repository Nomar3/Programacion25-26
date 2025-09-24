package ejercicio15;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca salario base: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca precio 1: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca precio 2: ");
		double c = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca precio 3: ");
		double d = Double.parseDouble(sc.nextLine());
		System.out.println("El pago final sera: " + (a + (b * 0.1) + (c * 0.1) + (d * 0.1)));
		sc.close();
	}

}
