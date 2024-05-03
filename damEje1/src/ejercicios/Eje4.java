package ejercicios;

public class Eje4 {
	public static void main(String[] args) {
		int edades[] = { 10, 14, 17, 18, 33, 55, 62, 70, 81, 99 };
		int mayor = 0;
		int menor = 0;
		double suma = 0;
		for (int i : edades) {
			if (i < 18)
				menor++;
			if (i > 17)
				mayor++;
			suma += i;

		}
		System.out.println("Menores de edad= " + menor);
		System.out.println("Mayores de edad= " + mayor);
		System.out.println("Media de edades= " + suma / 10);
	}
}
