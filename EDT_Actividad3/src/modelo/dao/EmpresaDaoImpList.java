package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Departamento;
import modelo.javabeans.Empleado;
import modelo.javabeans.Localidad;
import modelo.javabeans.Trabajo;

public class EmpresaDaoImpList implements IntGestionEmpresa {
	private String nombre;
	private ArrayList<Empleado> plantilla;

	public EmpresaDaoImpList(String nombreEmpresa) {
		nombre = nombreEmpresa;
		plantilla = new ArrayList<Empleado>();
		cargarDatos();
	}

	private void cargarDatos() {
		Trabajo job1 = new Trabajo("29", "Piloto F1", 100000, 20000000);
		Trabajo job2 = new Trabajo("2", "Team Principal", 300000, 1000000);
		Trabajo job3 = new Trabajo("23", "Piloto F1 Academy", 100000, 20000000);
		Localidad loc1 = new Localidad(1, "Fiorano", "Maranello", "Italy");
		Localidad loc2 = new Localidad(2, "Towncester", "Silverstone", "England");
		Localidad loc3 = new Localidad(3, "Barckley", "Silverstone", "England");
		Departamento dep1 = new Departamento(1, "Maranello", loc1);
		Departamento dep2 = new Departamento(2, "Aston Martin Factory", loc2);
		Departamento dep3 = new Departamento(3, "Mercedes", loc3);
		plantilla.add(new Empleado(55, "Carlos", "Sainz Vazquez de Castro", "H", Empleado.obtenerEmail("Carlos", "Sainz Vazquez de Castro"), 2000000, 2, job1, dep1));
		plantilla.add(new Empleado(14, "Fernando", "Alonso Díaz", "H", Empleado.obtenerEmail("Fernando", "Alonso Díaz"), 1350000, 10, job1, dep2));
		plantilla.add(new Empleado(44, "Lewis", "Hamilton", "H", Empleado.obtenerEmail("Lewis", "Hamilton"), 4000000, 8, job1, dep3));
		plantilla.add(new Empleado(63, "George", "Russel", "H", Empleado.obtenerEmail("George", "Russel"), 3000000, 8, job1, dep3));
		plantilla.add(new Empleado(1, "Mike", "Krack", "H", Empleado.obtenerEmail("Mike", "Krack"), 3000000, 8, job2, dep2));
		plantilla.add(new Empleado(90, "Nerea", "Martí", "M", Empleado.obtenerEmail("Nerea", "Martí"), 380000, 2, job3, dep1));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean alta(Empleado empleado) {
		if (plantilla.contains(empleado)) {
			return false;
		}
		return plantilla.add(empleado);
	}

	@Override
	public boolean eliminarUno(Empleado empleado) {
		return plantilla.remove(empleado);
	}

	@Override
	public boolean modificarUno(Empleado empleado) {
		Empleado emp = new Empleado();
		int pos = plantilla.indexOf(empleado);
		if (pos != -1) {
			plantilla.set(pos, emp);
			return true;
		} else
			return false;
	}

	@Override
	public ArrayList<Empleado> buscarPorSexo(char sexo) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		String s = String.valueOf(sexo);
		for (Empleado empleado : plantilla) {
			if (empleado.getGenero().equalsIgnoreCase(s)) {
				aux.add(empleado);
			}
		}
		return aux;
	}

	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp = new Empleado();
		emp.setIdEmpleado(idEmpleado);
		int pos = plantilla.indexOf(emp);
		if (pos != -1) {
			return plantilla.get(pos);
		} else
			return null;
	}

	@Override
	public ArrayList<Empleado> buscarTodos() {
		return plantilla;
	}

	@Override
	public double masaSalarial() {
			double total = 0;
			for (Empleado empleado:plantilla) {
				total += empleado.salarioBruto();
		}
			return total;
	}

	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepartamento) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		for (Empleado empleado : plantilla) {
			if (empleado.getDepartamento().getIdDepartamento() == idDepartamento) {
				aux.add(empleado);
			}
		}
		return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorTrabajo(String idTrabajo) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		for (Empleado empleado:plantilla) {
			if (idTrabajo == empleado.getTrabajo().getIdTrabajo()) {
				aux.add(empleado);
			}
		}
		return aux;
	}

	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		for (Empleado empleado:plantilla) {
			if (pais.equalsIgnoreCase(empleado.getDepartamento().getLocalidad().getPais())) {
				aux.add(empleado);
			}
		}
		return aux;
	}

}
