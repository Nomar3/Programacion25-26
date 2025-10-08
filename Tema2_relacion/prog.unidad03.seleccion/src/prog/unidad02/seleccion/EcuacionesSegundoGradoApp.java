package prog.unidad02.seleccion;

import java.util.Scanner;
import java.lang.Math;

public class EcuacionesSegundoGradoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Introduce el coeficiente c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado (a no puede ser 0).");
        } else {
            // Calcular el discriminante
            double discriminante = (b * b) - (4 * a * c);
            System.out.println("\nDiscriminante: " + discriminante);

            if (discriminante > 0) {
                // Dos raíces reales y diferentes
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos raíces reales y distintas:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                // Una raíz real doble
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una raíz real doble:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuación no tiene raíces reales.");
            }
        }
		sc.close();
		
		
	}

}
