package modelo.dao;

import java.util.List;

import modelo.javabeans.AbstractPersona;

public interface IntInstitutoDao {
	boolean altaPersona(AbstractPersona persona);
	AbstractPersona buscarPersona(String nif);
	List<AbstractPersona> buscarTodas();
	boolean eliminarPersona(AbstractPersona persona);
	List<AbstractPersona> BuscarPersonasPorTipo(String tipoPersona);
}
