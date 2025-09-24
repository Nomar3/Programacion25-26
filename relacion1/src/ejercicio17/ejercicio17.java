package ejercicio17;

import java.util.Scanner;

public class ejercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca presupuesto anual del hospital: ");
		double a = Double.parseDouble(sc.nextLine());

		System.out.println("El presupuesto de Ginecologia es " + ((a * 40) / 100));
		System.out.println("El presupuesto de Traumatologia es " + ((a * 35) / 100));
		System.out.println("El presupuesto de Pediatria es " + ((a * 25) / 100));

		sc.close();
	}

}
