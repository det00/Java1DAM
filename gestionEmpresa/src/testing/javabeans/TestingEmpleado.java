package testing.javabeans;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class TestingEmpleado {
	public static void main(String[] args) {
		Localidad loc2 = new Localidad(2, "Towncester", "Silverstone", "England");
		Departamento dep3 = new Departamento(33, "Aston Martin Factory", loc2);
		Trabajo job1 = new Trabajo("29", "Piloto F1", 300000, 20000000);
		Empleado emp14 = new Empleado(14, "Fernando", "Alonso Díaz", "H", Empleado.obtenerEmail("Fernando", "Alonso Díaz"), 1350000, 10, job1, dep3);
		
		
		System.out.println("Nombre: " + emp14.getNombre());
		System.out.println("Apellidos: " + emp14.getApellidos());
		System.out.println("Género: " + emp14.getGenero());
		System.out.println("Literal Sexo: " + emp14.literalSexo());
		System.out.println("Email: " + emp14.getEmail());
		System.out.println(Empleado.obtenerEmail(emp14.getNombre(), emp14.getApellidos()));
		System.out.println("Departamento: " + emp14.getDepartamento().getDescripcion());
		System.out.println("Trabajo: " + emp14.getTrabajo().getDescripcion());
		System.out.println("Dirección: " + emp14.getDepartamento().getLocalidad().getDireccion());
		System.out.println("Ciudad: " + emp14.getDepartamento().getLocalidad().getCiudad());
		System.out.println("País: " + emp14.getDepartamento().getLocalidad().getPais());
		
		Trabajo trabajo14 = emp14.getTrabajo();
		Departamento depart14 = emp14.getDepartamento();
		
		System.out.println(trabajo14);
		System.out.println(depart14);
	}

}
