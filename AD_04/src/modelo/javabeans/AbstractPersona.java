/*
 * OBJETO ABSTRACTO CON SUS GETTERS, SETTERS, EQUAL Y HASHCODE...
 */
package modelo.javabeans;

import java.util.Objects;

public abstract class AbstractPersona {
	protected String nif;
	protected String nombre;
	protected String direccion;
	protected String telefono;

	public AbstractPersona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public AbstractPersona() {
		super();
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AbstractPersona other = (AbstractPersona) obj;
		return Objects.equals(nif, other.nif);
	}

	
	
	public String llamar(AbstractPersona p) {
		//METODO PUBLICO YA IMPLEMENTADO, SE HEREDA TAL CUAL.
		return this.nombre + " llamando a " + p.nombre + ".";
	}

	public abstract String trabajar();
	
	/* METODO ABSTRACTO SIN IMPLEMENTAR, SE HACE LUEGO EN CADA UNO DE LOS OBJETOS
	 * QUE LO HEREDAN.
	 */
	
	@Override
	public String toString() {
		//toString comun, aunque luego se reescribe para cada una de las clases.
		return "AbstractPersona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + "]";
	}

}
