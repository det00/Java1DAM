package ejerc;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		String [] familia = new String [10];
		
		for (int i = 0; i<familia.length; i++) {
			System.out.println("Introduce el nombre del familiar número " + (i+1) + ":");
			familia[i] = read.next();
		}
		
		for (String elemento:familia) {
			System.out.println(elemento);
		}
		read.close();

	}
}