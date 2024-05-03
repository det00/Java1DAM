package modelo.dao;

import java.util.ArrayList;

import modelo.javabeans.Empleado;

public interface IntGestionEmpresa {
	boolean alta(Empleado empleado);
	boolean eliminarUno(Empleado empleado);
	boolean modificarUno(Empleado empleado);
	ArrayList<Empleado> buscarPorSexo(char sexo);
	Empleado buscarUno(int idEmpleado);
	ArrayList<Empleado> buscarTodos();
	double masaSalarial();
	ArrayList<Empleado> buscarPorDepartamento(int idDepartamento);
	ArrayList<Empleado> buscarPorTrabajo(String idTrabajo);
	ArrayList<Empleado> buscarPorPais(String pais);
}
