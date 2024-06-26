/*
 * OBJETO SIMPLE CON SUS GETTERS, SETTERS, EQUAL Y HASHCODE...
 */
package modelo.javabeans;

public class Alumno extends AbstractPersona{
	private String curso;

	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public Alumno() {
		super();
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String hacerExamen() {
		//METODO PROPIO DE CLASE
		return "El alumno " + this.getNombre() + " va a hacer su examen.";
	}

	@Override
	public String trabajar() {
		//METODO HEREDADO QUE SE IMPLEMENTA AQUI
		// TODO Auto-generated method stub
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.getCurso() + ".";
	}

	@Override
	public String toString() {
		//SE SOBREESCRIBE EL METODO PARA AGREGAR ATRIBUTOS DE CLASE PROPIOS
		return "Alumno [curso=" + curso + ", nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
}
