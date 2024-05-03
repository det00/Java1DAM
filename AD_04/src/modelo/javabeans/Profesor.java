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
	public String toString() {
		return "Profesor [competencias=" + competencias + ", nif=" + nif + ", nombre=" + nombre + ", direccion="
				+ direccion + ", telefono=" + telefono + "]";
	}

	@Override
	public String trabajar() {
		// TODO Auto-generated method stub
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}
	
	public String ponerNotas() {
		return "El profesor " + this.getNombre() + " va a corregir los examenes.";
	}
	
}

