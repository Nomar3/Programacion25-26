package ejercicio13;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca cantidad MB: ");
		double a = Double.parseDouble(sc.nextLine());
		System.out.println("Son " + (a * 1024) + " KB");
		sc.close();
	}

}
