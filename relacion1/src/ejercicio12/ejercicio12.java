package ejercicio12;

import java.util.Scanner;

public class ejercicio12 {

	public static final double PI = 3.141516;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca radio de la base: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca altura: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Volumen del cono = " + ((PI * b * (a * a)) / 3));
		sc.close();
	}

}
