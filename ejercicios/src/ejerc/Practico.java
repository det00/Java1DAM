package ejerc;

public class Practico {

	public static void main(String[] args) {

		double acumulado;
		double intereses = 0.10;

		double[][] tabla = new double[6][5];

		for (int i = 0; i < 6; i++) {

			tabla[i][0] = 10000;
			acumulado = 10000;

			for (int j = 1; j < 5; j++) {
				acumulado = acumulado + (acumulado * intereses);
				tabla[i][j] = acumulado;
			}
			intereses = intereses + 0.01;
		}

		for (double z[] : tabla) {
			System.out.println();
			for (double h : z) {
				System.out.printf("%1.2f", h);
				System.out.print(" ");
			}
		}
	}
}
