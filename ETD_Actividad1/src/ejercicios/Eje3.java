package ejercicios;

import java.lang.Math;

public class Eje3 {
	

	public static void main(String[] args) {
		//Llamo a la funcion para comprobar que hace lo que necesito
		System.out.println(calculo('a',10,4));
		System.out.println(calculo('v',10,4));
	}

	private static double calculo(char operacion, double altura, double radio) {
		double result = 0;
		if (operacion == 'a') {
			//FORMULA USADA=2πr(R+h)
			result = 2*Math.PI*radio*(radio+altura);
		}
		if (operacion == 'v') {
			//FORMULA USADA=πr²h
			result = Math.PI*Math.pow(radio,2)*altura;
		}
		return result;

	}
}