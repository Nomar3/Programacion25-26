package examenTema1_RamonMarinJimenez;

import java.util.Scanner; //incluimos la libreria de Scanner para usar sus clases

public class calculoSalario {

	//Declaramos como constantes los sueldos fijos de cada puesto
	public static final double SSDEV = 1245.36;//sueldo fijo del senior developer
	public static final double SJDEV = 918.54;//sueldo fijo del junior developer
	public static final double SIADEV = 1170.62;//sueldo fijo del IA developer
	public static final double STESTER= 842.55;//sueldo fijo del QA tester

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("EXAMEN TEMA 1 Ramón Marín Jiménez. CALCULO DE SALARIO");
		
		//lo primero, iniciamos el scanner
		Scanner sc = new Scanner(System.in);
		//vamos a ir pidiendo los datos y haciendo los calculos por orden de los puestos
		System.out.println("Cálculo del Senior Developer: ");
		System.out.println("Introduzca horas extra: ");
		int horasSDev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca antigüedad: ");
		int antSDev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca objetivos(en porcentaje): ");
		int objSDev = Integer.parseInt(sc.nextLine());

		//primero calculamos lo que ganara con las horas extras multiplicandolas por su valor
		double hExSDev = (double)horasSDev * 25.43;
		//ahora, para saber el plus de antiguedad dividimos los años por trienios y multiplicamos por la cantidad
		int plusAntSDev = (antSDev / 3) * 25;
		//calculamos lo que gana con los objetivos, dividiendo salario base a la mitad porque es 50% por el porcentaje
		double plusObjSDev = (SSDEV / 2) * ((double)objSDev / 100);
		//como ultimo calculo, sumamos las partes anteriores y le reducimos el IRPF del 5%
		double finalSDev = (SSDEV + hExSDev + (double)plusAntSDev + plusObjSDev) * 0.95;
		
		//apartir de aqui, repetimos esta estructura para el resto de puestos, sin volver a iniciar el scanner:
		//segundo el Junior Developer
		System.out.println("Cálculo del Junior Developer: ");
		System.out.println("Introduzca horas extra: ");
		int horasJDev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca antigüedad: ");
		int antJDev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca objetivos(en porcentaje): ");
		int objJDev = Integer.parseInt(sc.nextLine());

		double hExJDev = (double)horasJDev * 16.81;
		int plusAntJDev = (antJDev / 3) * 18;
		double plusObjJDev = (SJDEV / 2) * ((double)objJDev / 100);
		double finalJDev = (SJDEV + hExJDev + (double)plusAntJDev + plusObjJDev) * 0.95;
		
		//tercero el IA Developer
		System.out.println("Cálculo del IA Developer: ");
		System.out.println("Introduzca horas extra: ");
		int horasIADev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca antigüedad: ");
		int antIADev = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca objetivos(en porcentaje): ");
		int objIADev = Integer.parseInt(sc.nextLine());

		double hExIADev = (double)horasIADev * 19.78;
		int plusAntIADev = (antIADev / 3) * 20;
		double plusObjIADev = (SIADEV / 2) * ((double)objIADev / 100);
		double finalIADev = (SIADEV + hExIADev + (double)plusAntIADev + plusObjIADev) * 0.95;
		
		//cuarto el QA tester
		System.out.println("Cálculo del QA Tester: ");
		System.out.println("Introduzca horas extra: ");
		int horasTest = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca antigüedad: ");
		int antTest = Integer.parseInt(sc.nextLine());
		System.out.println("Introduzca objetivos(en porcentaje): ");
		int objTest = Integer.parseInt(sc.nextLine());

		double hExTest = (double)horasTest * 14.49;
		int plusAntTest = (antTest / 3) * 16;
		double plusObjTest = (STESTER / 2) * ((double)objTest / 100);
		double finalTest = (STESTER + hExTest + (double)plusAntTest + plusObjTest) * 0.95;

		//aqui imprimimos por pantalla los resultados finales
		System.out.println("La nómina del Senior Developer es: " + finalSDev);
		System.out.println("La nómina del Junior Developer es: " + finalJDev);
		System.out.println("La nómina del IA Developer es: " + finalIADev);
		System.out.println("La nómina del QA Tester es: " + finalTest);
		sc.close();//en esta linea cerramos el scanner
	}

}
