package ejercicios;

import javabeans.Fiesta;

public class Eje1 {
	public static void main(String[] args) {
			//PRUEBA DE FIESTA CUMPLEAÑOS
		Fiesta cumple = new Fiesta("cumpleaños", "calle el perro muerto", 4, 20, 2, "08/01", "20:30");
		System.out.println(cumple.toString());
		cumple.invitar();
		cumple.invitar();
		cumple.invitar();
		System.out.println(cumple.toString());
		cumple.cancelarInvitacion();
		System.out.println(cumple.toString());
			//PRUEBA DE FIESTA BODA
		Fiesta boda = new Fiesta();
		boda.setTipoFiesta("boda");
		boda.setInvitados(100);
		boda.setBebidas(120);
		boda.setBocadillos(110);
		boda.setDireccion("Carretera de la alpargata, número 98");
		boda.setFecha("14/07/2024");
		boda.setHora("10:30");
		System.out.println(boda.toString());
		boda.cancelarInvitacion();
		System.out.println(boda.toString());
			//PRUEBA DE SYSOS ALEATORIOS CON GETS
		System.out.println("Direccion de boda " + boda.getDireccion());
		System.out.println(cumple.getHora());
		System.out.println(cumple.getTipoFiesta());
		System.out.println(boda.getTipoFiesta());
		System.out.println(boda.getBocadillos());
		System.out.println(cumple.getInvitados());
	}

}
