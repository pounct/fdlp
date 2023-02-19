
package m7;

import java.util.Scanner;

public class M72 {

	public static void m72E1() {
		/*
		 * Fes un programa que mostri el següent per pantalla:
		 *
		 * 
		 * 
		 * *
		 * 
		 * * *
		 * 
		 * * * *
		 * 
		 * * * * *
		 * 
		 * * * * * *
		 * 
		 * El nombre de línies formades per “*” vindrà donat per un número que
		 * l’usuari/ària introduirà per consola.
		 * 
		 * Condició: En tot el codi del programa només hi pot haver un *
		 * 
		 * 
		 * També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la
		 * classe String.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el nombre de línies :");
		int numero = entrada.nextInt();
		if (numero >= 1) {
			for (int i = 1; i <= numero; i++) {
				String linea = "";
				for (int j = 1; j <= i; j++) {
					linea += "* ";
				}
				System.out.println(linea);
			}
		} else {
			System.out.println("El nombre de línies no es correcto!");
		}

	}

	public static void m72E2() {
		/*
		 * Fes un programa que mostri el següent per pantalla:
		 * 
		 * * * * * *
		 * 
		 * * * * *
		 * 
		 * * * *
		 * 
		 * * *
		 * 
		 * *
		 *
		 * 
		 * 
		 * El nombre de línies formades per “*” vindrà donat per un número que
		 * l’usuari/ària introduirà per consola.
		 * 
		 * Condició: En tot el codi del programa només hi pot haver un *
		 * 
		 * També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la
		 * classe String
		 */
		final char ASTERICO = '*';
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduir el nombre de línies :");
		int numero = entrada.nextInt();

		if (numero >= 1) {

			for (int i = numero; i >= 1; i--) {

				String linea = "";
				for (int j = i; j >= 1; j--) {

					linea += ASTERICO;
				}

				System.out.println(linea);
			}

		} else {
			System.out.println("El nombre de línies no es correcto!");
		}
		entrada.close();

	}

	public static void m72E3() {
		/*
		 * Fes un programa que mostri el següent per pantalla:
		 *
		 * 
		 * 
		 * *
		 * 
		 * * *
		 * 
		 * * * *
		 * 
		 * * * * *
		 * 
		 * * * * * *
		 * 
		 * * * * *
		 * 
		 * * * *
		 * 
		 * * *
		 * 
		 * *
		 *
		 * 
		 * 
		 * La línia amb més “*” vindrà donada per un número que l’usuari/ària introduirà
		 * per consola.
		 * 
		 * Condició: En tot el codi del programa només hi pot haver-hi dos *
		 * 
		 * També, a poder ser, no utilitzis cap mètode com repeat() o substring() de la
		 * classe String.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el nombre maximum :");
		int numero = entrada.nextInt();
		if (numero >= 1) {
			for (int i = 1; i <= numero; i++) {
				String linea = "";
				for (int j = 1; j <= i; j++) {
					linea += "*";
				}
				System.out.println(linea);
			}
			for (int i = numero - 1; i >= 1; i--) {
				String linea = "";
				for (int j = i; j >= 1; j--) {
					linea += "*";
				}
				System.out.println(linea);
			}
		} else {
			System.out.println("El nombre de línies no es correcto!");
		}
		entrada.close();

	}

	public static void m72E4() {
		/*
		 * Realitzar un programa on l’usuari/ària introdueix un número i el programa
		 * crida a un mètode que retorna el factorial del número introduït.
		 * 
		 * El factorial d'un nombre n (enter, no negatiu) és el producte de tots els
		 * nombres enters positius inferiors o iguals a n.
		 */
		Scanner entrada = new Scanner(System.in);
		int numero;
		do {
			System.out.println("introdueix un número (enter, no negatiu) :");
			numero = entrada.nextInt();
		} while (numero < 0);

		System.out.println("El factorial del nombre " + numero + " es : " + factorial(numero));

	}

	private static int factorial(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}

	}

	public static void m72E5() {
		/*
		 * L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode
		 * que indiqui si el número és primer o no.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el numero :");
		int numero = entrada.nextInt();
		if (esPrimer(numero)) {
			System.out.println("El numero es primer");
		} else {
			System.out.println("El numero no es primer");
		}

	}

	static boolean esDivisor(int a, int b) {
		return a % b == 0;
	}

	/*
	 * static boolean esPrimer(int m) { for (int i = 2; i < m; i++) { if
	 * (esDivisor(m, i)) { return false; } } return true; }
	 */

	public static void m72E6() {

		/*
		 * L’usuari/ària ha d’introduir números fins que introdueixi un nombre primer.
		 * 
		 * En el moment que l’usuari/ària introdueixi un nombre primer, el programa ha
		 * de treure per pantalla el següent missatge:
		 * "Exacte, el número “x” és primer!"
		 * 
		 * Nota
		 * 
		 * Utilitzar el mètode creat a l'exercici: (M7.2.) Exercici 5.
		 */

		Scanner entrada = new Scanner(System.in);
		int numero;

		do {

			System.out.println("Introduir un nombre primer :");
			numero = entrada.nextInt();

		} while (numero <= 1 || !esPrimer(numero));
		System.out.println("Exacte, el número " + numero + " és primer!");
	}

	// static boolean esDivisor(int a, int b) {
	// return a % b == 0;
	// }

	static boolean esPrimer(int m) {
		// int i = 2;
		boolean esprimer = true;
		/*
		 * while (i < m && esprimer) { if (esDivisor(m, i)) { esprimer = false; } i++; }
		 */

		for (int i = 2; i < m && esprimer; i++) {
			// se puede cambiar esDivisor(m, i) por (m % i == 0)
			if (esDivisor(m, i)) {
				esprimer = false;
				// return false;
			}
		}
		return esprimer;
		// return true;
	}

	public static void m72E7() {
		/*
		 * L’usuari/ària introdueix un any a per teclat i el programa crida a un mètode
		 * que indiqui si l’any és de traspàs o no.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir un any :");
		int numero = entrada.nextInt();
		if (numero % 400 == 0) {
			System.out.println("el any és de traspàs");
		} else if (numero % 4 == 0 && numero % 100 != 0) {
			System.out.println("el any és de traspàs");
		} else {
			System.out.println("el any no és de traspàs");
		}

	}

	public static void m72E8() {
		/*
		 * L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode
		 * que ha de mostrar la successió de Fibonacci.
		 * 
		 * Exemple:
		 * 
		 * Si l’usuari/ària introdueix el 10, el resultat ha de ser:
		 * 
		 * 0,1,1,2,3,5,8,13,21,34
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir un nombre :");
		int numero = entrada.nextInt();
		System.out.println(fibonacci(numero));

	}

	static int fibonacci(int num) {
		if (num == 0) {
			return 0;
		} else if (num == 1) {
			return 1;
		} else {
			return fibonacci(num - 2) + fibonacci(num - 1);
		}
	}

	public static void main(String[] args) {

		M72 m72 = new M72();
		m72.m72E1();
		m72.m72E2();
		m72.m72E3();
		m72.m72E4();
		m72.m72E5();
		m72.m72E6();
		m72.m72E7();
		m72.m72E8();

	}

}
