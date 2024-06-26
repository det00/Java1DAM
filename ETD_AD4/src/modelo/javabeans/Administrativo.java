/*
 * OBJETO SIMPLE CON SUS GETTERS, SETTERS, EQUAL Y HASHCODE...
 */
package modelo.javabeans;

public class Administrativo extends AbstractPersona{
	private String tareas;

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public Administrativo() {
		super();
	}

	public String getTareas() {
		return tareas;
	}

	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	public String gestionarMatricula() {
		//METODO PROPIO DE CLASE
		return "El administrativo " + this.getNombre() + " va a gestionar una matrícula.";
	}

	@Override
	public String trabajar() {
		//METODO HEREDADO QUE SE IMPLEMENTA AQUI
		// TODO Auto-generated method stub
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas: " + this.getTareas() + ".";
	}

	@Override
	public String toString() {
		//SE SOBREESCRIBE EL METODO PARA AGREGAR ATRIBUTOS DE CLASE PROPIOS
		return "Administrativo [tareas=" + tareas + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
}
