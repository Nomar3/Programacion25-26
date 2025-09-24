package ejercicio9;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca base: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca altura: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Area del triangulo = " + ((a * b) / 2));
		sc.close();

	}

}
