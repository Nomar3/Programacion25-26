package ejercicio8;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca longitud 1: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca longitud 2: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Area del rectangulo = " + (a * b));
		sc.close();

	}

}
