package ejercicio18;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Longitud A: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Longitud B: ");
		double b = Double.parseDouble(sc.nextLine());
		System.out.println("Longitud C: ");
		double c = Double.parseDouble(sc.nextLine());

		double aTri = ((a - c) * b) / 2;
		double aTotal = aTri + (c * b);
		System.out.println("Nota final es: " + aTotal);
		sc.close();
	}

}
