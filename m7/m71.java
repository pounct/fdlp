
package m7;

import java.util.Scanner;

public class M71 {

	public static void m71E1() {
		// Crea un programa on l’usuari/ària introdueix tres notes

		Scanner entrada = new Scanner(System.in); // Create a Scanner object

		System.out.println("Entrar 1era Nota");
		int num1 = entrada.nextInt();

		System.out.println("Entrar 2da Nota");
		int num2 = entrada.nextInt();

		System.out.println("Entrar 3era Nota");
		int num3 = entrada.nextInt();

		// i el programa calcula la mitja.
		float mitja = ((float) num1 + num2 + num3) / 3;

		// Si la mitja és inferior a 5 ha
		if (mitja < 5.0) {
			System.out.println("No has superat el curs. Has de recuperar");
		}

		// Si la mitja és superior a 7 ha
		else if (mitja > 7.0) {
			System.out.println("Enhorabona! Has superat el curs! Passa ja al següent nivell!");
		}

		// Si la mitja està entre 5 i 7 ha de mostrar
		else {
			System.out.println("Enhorabona! Has aprovat, però hauries de continuar practicant");
		}
		entrada.close();

	}

	public static void m71E2() {

		Scanner entrada = new Scanner(System.in); // Create a Scanner object
		// nombre de notes que vol introduir
		System.out.println("nombre de notes que vol introduir");
		int numNotes = entrada.nextInt();
		float sumaNotes = 0;
		float minNotes = 10;
		float maxNotes = 0;

		if (numNotes > 0) {
			for (int i = 1; i <= numNotes; i++) {
				boolean notaCorrecta = false;
				float notaCorrect = 0;
				while (!notaCorrecta) {
					System.out.println("Entrar Nota (debe ser entre 0 y 10) N*" + i);
					float nota = entrada.nextFloat();
					notaCorrecta = (nota <= 10 && nota > 0);
					notaCorrect = nota;
				}
				sumaNotes += notaCorrect;
				if (notaCorrect > maxNotes) {
					maxNotes = notaCorrect;
				}
				if (notaCorrect < minNotes) {
					minNotes = notaCorrect;
				}
			}
		}

		// la nota mitjana
		float mitja = (float) sumaNotes / numNotes;

		// Si la mitja és inferior a 5 ha
		if (mitja < 5.0) {
			System.out.println(
					"La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més");
		}

		// Si la mitja és superior a 7 ha
		else if (mitja > 7.0) {
			System.out.println("Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat");
		}

		// Si la mitja està entre 5 i 7 ha de mostrar
		else {
			System.out.println(
					"La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal");
		}
		System.out.println("La nota mitjana " + mitja + " y Max " + maxNotes + "min " + minNotes);

	}

	public static void m71E3() {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el número :");
		int numero = entrada.nextInt();
		if (numero % 2 == 0) {
			System.out.println("el número és parell");
		} else {
			System.out.println("el número és imparell");
		}
		entrada.close();

	}

	public static void m71E4() {
		// L’usuari/ària ha d’introduir dos números,
		// el programa retornarà “Un dels dos números és negatiu”, només si un dels dos
		// números és negatiu.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduir el 1r número :");
		int numero1 = entrada.nextInt();

		System.out.println("Introduir el 2d número :");
		int numero2 = entrada.nextInt();

		// Sol 1
		System.out.println("solucion 1");
		if (numero1 < 0 && numero2 >= 0) {
			System.out.println("el  número dels dos números que és negatiu : " + numero1);
		} else if (numero1 >= 0 && numero2 < 0) {
			System.out.println("el  número dels dos números que és negatiu : " + numero2);
		} else {
			System.out.println("Condicio no satisfecha");
		}

		// Sol 2
		System.out.println("solucion 2");
		if (numero1 >= 0 && numero2 >= 0) {
			System.out.println("Condicio no satisfecha");
		} else if (numero1 < 0 && numero2 < 0) {
			System.out.println("Condicio no satisfecha");
		} else {
			if (numero1 < 0) {
				System.out.println("el  número dels dos números que és negatiu : " + numero1);
			} else {
				System.out.println("el  número dels dos números que és negatiu : " + numero2);
			}
		}

		// Sol 3
		/*
		 * System.out.println("solucion 3"); if (numero1 < 0 || numero2 < 0) { if
		 * (numero1 < 0 && numero2 >= 0) {
		 * System.out.println("el  número dels dos números que és negatiu : " +
		 * numero1); } else {
		 * System.out.println("el  número dels dos números que és negatiu : " +
		 * numero2); } } else { System.out.println("Condicio no satisfecha"); }
		 */

	}

	public static void m71E5() {
		/*
		 * Mostra per pantalla els nombres parells compresos entre el 100 i el 0 en
		 * ordre descendent.
		 */
		/*
		 * for (int i = 100; i >= 0; i--) { if (i % 2 == 0) { System.out.println(i); } }
		 */

		Scanner entrada = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduzca un numero :");
			numero = entrada.nextInt();
		} while ((numero % 2) != 0);

		System.out.println("el Ultimo numero es par :" + numero);
	}

	public static void m71E6() {
		/*
		 * Taula de multiplicar.
		 * 
		 * L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant
		 * un bucle, el programa li mostrarà la taula de multiplicar d’aquell número.
		 * 
		 * Exemple:
		 * 
		 * 2 x 1 = 2
		 * 
		 * 2 x 2 = 4
		 * 
		 * 2 x 3 = 6
		 * 
		 * ...
		 * 
		 * 2 x 10 = 20
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el número :");
		int numero = entrada.nextInt();
		tabla(numero);

	}

	public static void tabla(int numero) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}

	}

	public static void m71E7() {
		/*
		 * Fer un programa on l’usuari/ària introdueix per pantalla un caràcter i un
		 * número. El programa imprimeix per pantalla un quadrat amb la mida i el
		 * caràcter introduïts per l’usuari/ària.
		 * 
		 * Exemple:
		 * 
		 * % % % % %
		 * 
		 * % % % % %
		 * 
		 * % % % % %
		 * 
		 * % % % % %
		 * 
		 * % % % % %
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir el caracter :");
		char caracter = entrada.nextLine().charAt(0);
		System.out.println("Introduir el numero :");
		int numero = entrada.nextInt();

		while (numero < 1) {
			System.out.println("Introduir un numero  superior o egual que 1:");
			numero = entrada.nextInt();
		}
		imprimirLineas(numero, caracter);

	}

	public static void imprimirLineas(int numero, char caracter) {
		String linea = PrepararLinea(numero, caracter);
		for (int i = 1; i <= numero; i++) {
			// System.out.println();
			System.out.println(linea);
		}
	}

	public static String PrepararLinea(int numero, char caracter) {
		String linea = "";
		for (int j = 1; j <= numero; j++) {
			linea += caracter + " ";
		}
		return linea;
	}

	public static void m71E8() {
		/*
		 * Crea un programa on l’usuari/ària introdueixi una temperatura en °C i es
		 * mostri per pantalla la conversió en ºFahrenheit
		 * 
		 * K = 32;
		 * 
		 * Fórmula (0 °C × 9 / 5) + K = 32 °F
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduir una temperatura en °C :");
		int celsus = entrada.nextInt();
		float fahrenheit = ((float) celsus * 9 / 5) + 32;
		System.out.println("La temperatura Celsus " + celsus + "°C en Fahrenheit es " + fahrenheit + "°F.");

	}

	public static void main(String[] args) {
		M71 m71 = new M71();
		m71.m71E1();
		m71.m71E2();
		m71.m71E3();
		m71.m71E4();
		m71.m71E5();
		m71.m71E6();
		m71.m71E7();
		m71.m71E8();

	}

}
