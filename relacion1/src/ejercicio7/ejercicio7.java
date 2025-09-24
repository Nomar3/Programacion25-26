package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca euros: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Pesetas = " + (a * 166.386));
		sc.close();
	}

}
