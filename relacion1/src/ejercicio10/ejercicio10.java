package ejercicio10;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca base imponible: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca IVA: ");
		double b = Double.parseDouble(sc.nextLine());
		double c = a * (b/100);
		c = a + c;
		System.out.println("Precio con IVA = " + c);
		sc.close();
	}

}
