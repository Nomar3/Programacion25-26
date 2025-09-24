package ejercicio14;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nota primer examen: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca nota final deseada: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Necesitas  " + ((b * 2) - a) + " puntos");
		sc.close();
	}

}
