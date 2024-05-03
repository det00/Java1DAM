package ejercicios;

import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		int suma = 0;
		int n1 = 0;
		int ceros = 0;
		System.out.println("Introduce un número:");
		n1 = read.nextInt();
		while (n1 >= 0) {
			if (n1 == 0) {
				ceros++;
			}
			if ((n1 % 2 == 0) && (n1 != 0)) {
				par++;
				suma += n1;
			}
			if (n1 % 2 != 0) {
				impar++;
			}
			System.out.println("Introduce un número:");
			n1 = read.nextInt();

		}
		// ESTADISTICAS
		System.out.println("La media de los numeros pares introducidos es: " + suma / par);
		System.out.println("La cantidad de ceros introducidos es: " + ceros);
		System.out.println("La cantidad de numeros impares introducidos es: " + impar);
		System.out.println("La cantidad de numeros impares introducidos es: " + impar);
		read.close();
	}

}
