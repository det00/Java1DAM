/*
 * OBJETO SIMPLE CON SUS GETTERS, SETTERS, EQUAL Y HASHCODE...
 */
package modelo.javabeans;

public class Profesor extends AbstractPersona{
	private String competencias;

	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	public Profesor() {
		super();
	}

	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}

	@Override
	//SE SOBREESCRIBE EL METODO PARA AGREGAR ATRIBUTOS DE CLASE PROPIOS
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	@Override
	public String trabajar() {
		//METODO HEREDADO QUE SE IMPLEMENTA AQUI
		// TODO Auto-generated method stub
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}
	
	public String ponerNotas() {
		//METODO PROPIO DE CLASE
		return "El profesor " + this.getNombre() + " va a corregir los examenes.";
	}
	
}

