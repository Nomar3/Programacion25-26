package ejercicio4;

public class ejercicio4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//checkeo del numero
		int numero = 5;
		boolean bol = false;
		
		if (numero % 2 == 1)
			bol = false;
		else
			bol = true;
		
		//impresion por pantalla
		if (bol == true)
			System.out.println("el numero " + numero + " es par" );
		else
			System.out.println("el numero " + numero + " es impar" );
	}

}
