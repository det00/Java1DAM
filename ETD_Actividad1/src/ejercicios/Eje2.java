package ejercicios;

import java.util.Scanner;

public class Eje2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String user = "";
		String pass = "";
		String correctUser = "Sara";
		String correctPass = "sarita";
		System.out.println("Introduce nombre de usuario:");
		user = read.next();

		if (user.contentEquals(correctUser) == true) {
			System.out.println("Introduce la contraseña:");
			pass = read.next();
			if (pass.equals(correctPass)) {
				System.out.println("Usuario y contraseña correctos. Bienvenido a la aplicación :)");
			}
			if (pass.equals(correctPass) == false) {
				System.out.println("Contraseña incorrecta.");
			}
		} else {
			System.out.println("Usuario incorrecto");
		}

		read.close();
	}
}