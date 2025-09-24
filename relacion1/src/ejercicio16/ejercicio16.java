package ejercicio16;

import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Inversion 1: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Inversion 2: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Inversion 3: ");
		double c = Double.parseDouble(sc.nextLine());
		double total = a + b + c;
		System.out.println("Inversion total es: " + total);
		System.out.println("La primera inversion representa " + ((a / total) * 100) + "%");
		System.out.println("La segunda inversion representa " + ((b / total) * 100) + "%");
		System.out.println("La tercera inversion representa " + ((c / total) * 100) + "%");

		sc.close();
	}

}
