package ejerc;

public class Bidimensionales {
	public static void main(String[] args) {
//DECLARACION DE ARRAY BIDIMENSIONAL TRADICIONAL
		int bidim[][] = new int[3][2];

		bidim[0][0] = 23;
		bidim[0][1] = 34;

		bidim[1][0] = 2;
		bidim[1][1] = 3;

		bidim[2][0] = 2234;
		bidim[2][1] = 33;
//RECORRER ARRAY BIDIMENSIONAL CON FOR NORMAL
		for (int a = 0; a < 3; a++) {
			System.out.println();
			for (int b = 0; b < 2; b++) {
				System.out.print(bidim[a][b] + " ");
			}
		}
		
		System.out.println();
//DECLARACION DE ARRAY BIDIMENSIONAL SIMPLE
		int bidim2[][] = { { 14, 33, 44, 55 }, 
				{ 4, 15, 3, 99 }, 
				{ 1, 2, 5, 86 }, 
				{ 88, 67, 22, 90 }, 
				};
//RECORRER ARRAY BIDIMENSIONAL CON FOR EACH
		for (int[] fila : bidim2) {
			System.out.println();
			for (int z : fila) {
				System.out.print(z + " ");
			}

		}

	}

}
