package ejercicio6;

import java.util.Scanner;

public class ejercicio6 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca pesetas: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Euros = " + (a / 166.386));
		sc.close();
	}

}
