package modelo.dao;

import java.util.List;

import modelo.javabeans.Libro;

public interface IntBibliotecaDao {
	boolean altaLibro();
	boolean prestarLibro();
	boolean devolverLibro();
	List<Libro> mostrarTodos();
}
