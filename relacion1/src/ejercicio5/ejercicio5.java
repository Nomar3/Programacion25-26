package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {

	public static final int CONSTANTE = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca primer numero: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca segundo numero: ");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("Su suma es: " + (a + b));
		System.out.println("Su resta es: " + (a - b));
		System.out.println("Su producto es: " + (a * b));
		System.out.println("Su division es: " + (a / b));
		System.out.println("Su modulo es: " + (a % b));
		
		sc.close();
	}

}
