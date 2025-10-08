package prog.unidad02.seleccion;

import java.util.Scanner;

public class CalculaIMCApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Programa de Cálculo de IMC");
		System.out.println("Introduzca su peso (kg): ");
		double peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduzca su altura (m): ");
		double altura = Double.parseDouble(sc.nextLine());

		double imc = peso / (altura * altura);
		System.out.print("Su imc es de " + imc + ", con un diagnostico de: ");
		if(imc >= 40)
			System.out.println("Obesidad mórbida (obesidad de grado IV)");
		else if(imc >=35 && imc <40)
			System.out.println("Obesidad premórbida (obesidad de grado III)");
		else if(imc >= 30 && imc <35)
			System.out.println("Sobrepeso crónico (obesidad de grado II)");
		else if(imc >= 25 && imc <30)
			System.out.println("Sobrepeso (obesidad de grado I)");
		else if(imc >= 18 && imc <25)
			System.out.println("Peso normal (saludable)");
		else if(imc >= 17 && imc <18)
			System.out.println("Bajo peso");
		else if(imc >= 16 && imc <17)
			System.out.println("Infrapeso");
		else
			System.out.println("Ingreso en el hospital por infrapeso");
		sc.close();
		}
	}


