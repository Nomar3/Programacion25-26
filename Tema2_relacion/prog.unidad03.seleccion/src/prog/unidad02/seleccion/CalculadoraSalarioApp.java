package prog.unidad02.seleccion;

import java.util.Scanner;

public class CalculadoraSalarioApp {

	public static final double NORMAL = 16;
	public static final double EXTRA = 20;
	public static final double HORASBASE = 40;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Cálculo de Nómina: ");
		System.out.println("Introduzca horas totales de la semana ");
		double horasTotal = Double.parseDouble(sc.nextLine());

		if (horasTotal <= HORASBASE)
			System.out.println("Salario por trabajar " + horasTotal + " normales y 0 extras es de: " + (horasTotal * NORMAL));
		else {
			double horasExtra = horasTotal - HORASBASE;
			double dineroExtra = horasExtra * EXTRA;
			double salarioBase = HORASBASE * NORMAL;
			System.out.println("Salario por trabajar " + HORASBASE + " normales y " + horasExtra + " extras es de: " + (salarioBase + dineroExtra));
		}
		sc.close();
	}

}
