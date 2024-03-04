package testing.dao;

import modelo.dao.EmpresaDaoImpList;
import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class TestingEmpresa {
	private static EmpresaDaoImpList empresaDao;
	private static Departamento dep1, dep2, dep3;
	private static Trabajo job1, job2, job3;
	private static Localidad loc1, loc2, loc3;

	static {
		// HE METIDO AQUI LOS TRABAJOS, DEPARTAMENOS Y LOCALIDADES POR QUE SI NO ALGUNOS
		// METODOS NO FUNCIONABAN.
		empresaDao = new EmpresaDaoImpList("F1");
		job1 = new Trabajo("29", "Piloto F1", 100000, 20000000);
		job2 = new Trabajo("2", "Team Principal", 300000, 1000000);
		job3 = new Trabajo("23", "Piloto F1 Academy", 100000, 20000000);
		loc1 = new Localidad(1, "Fiorano", "Maranello", "Italy");
		loc2 = new Localidad(2, "Towncester", "Silverstone", "England");
		loc3 = new Localidad(3, "Barckley", "Silverstone", "England");
		dep1 = new Departamento(1, "Maranello", loc1);
		dep2 = new Departamento(2, "Aston Martin Factory", loc2);
		dep3 = new Departamento(3, "Mercedes", loc3);
	}

	public static void main(String[] args) {
		// TRAIGO AQUI TODOS LOS METODOS PARA PROBARLOS
		//- alta();
		//- eliminarUno();
		//- modificarUno();
		//- buscarPorSexo();
		//- buscarUno();
		//- buscarTodos();
		//- masaSalarial();
		//- buscarPorDepartamento();
		//- buscarPorTrabajo();
		//- buscarPorPais();
	}
	
	public static void masaSalarial() {
			System.out.println(empresaDao.masaSalarial());
		}
	
	
	public static void buscarPorPais() {
		for (Empleado empleado:empresaDao.buscarPorPais("italy")) {
			System.out.println(empleado);
		}
	}
	
	public static void buscarPorTrabajo() {
		for (Empleado empleado:empresaDao.buscarPorTrabajo("23")) {
			System.out.println(empleado);
		}
	}
	
	public static void buscarPorDepartamento() {
		for (Empleado empleado:empresaDao.buscarPorDepartamento(3)){
			System.out.println(empleado);
		}
	}
	
	public static void buscarPorSexo() {
		for (Empleado empleado:empresaDao.buscarPorSexo('ñ')){
			System.out.println(empleado);
		}
	}

	public static void buscarUno() {
		System.out.println(empresaDao.buscarUno(14));
	}

	public static void modificarUno() {
		Empleado empleado = empresaDao.buscarUno(44);
		if (empleado != null) {
			empleado.setDepartamento(dep1);
		}
		else
			System.out.println("Empleado no existe.");
		buscarTodos();

	}

	public static void eliminarUno() {
		System.out.println(empresaDao.eliminarUno(new Empleado(90, "Nerea", "Martí", "M",
				Empleado.obtenerEmail("Nerea", "Martí"), 380000, 2, job3, dep1)));
		buscarTodos();
	}
		// FUNCIONA CORRECTAMENTE, INCLUYENDO LOS TRABAJOS Y DEPARTAMENTOS
	public static void alta() {
		System.out.println(empresaDao.alta(new Empleado(90, "Nerea", "Martí", "M",
				Empleado.obtenerEmail("Nerea", "Martí"), 380000, 2, job3, dep1)));
		System.out.println(empresaDao.alta(
				new Empleado(89, "Toto", "Wolf", "H", Empleado.obtenerEmail("Toto", "Wolf"), 1200000, 2, job2, dep3)));
		buscarTodos();

	}
			// EL METODO MAS SIMPLE, FUNCIONA
	public static void buscarTodos() {
		for (Empleado empleado : empresaDao.buscarTodos()) {
			System.out.println(empleado);

		}
	}
}
