package ejercicio11;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca nº horas trabajadas por semana: ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Salario semanal = " + (a * 12) + "euros.");
		sc.close();
	}

}
