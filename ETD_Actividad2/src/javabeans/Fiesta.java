package javabeans;

public class Fiesta {

	private String tipoFiesta;
	private String direccion;
	private int bocadillos;
	private int bebidas;
	private int invitados;
	private String fecha;
	private String hora;

	// CONSTRUCTOR CON TODOS LOS PARAMETROS
	public Fiesta(String tipoFiesta, String direccion, int bocadillos, int bebidas, int invitados, String fecha,
			String hora) {
		super();
		this.tipoFiesta = tipoFiesta;
		this.direccion = direccion;
		this.bocadillos = bocadillos;
		this.bebidas = bebidas;
		this.invitados = invitados;
		this.fecha = fecha;
		this.hora = hora;
	}

	// CONSTRUCTOR SIN PARAMETROS
	public Fiesta() {
		super();
	}

	// GETTERS AND SETTERS
	public String getTipoFiesta() {
		return tipoFiesta;
	}

	public void setTipoFiesta(String tipoFiesta) {
		this.tipoFiesta = tipoFiesta;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getBocadillos() {
		return bocadillos;
	}

	public void setBocadillos(int bocadillos) {
		this.bocadillos = bocadillos;
	}

	public int getBebidas() {
		return bebidas;
	}

	public void setBebidas(int bebidas) {
		this.bebidas = bebidas;
	}

	public int getInvitados() {
		return invitados;
	}

	public void setInvitados(int invitados) {
		this.invitados = invitados;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	// METODOS
	public void invitar() {
		invitados++;
	}

	public String toString() {
		return "La fiesta es de tipo " + tipoFiesta + " y se va a celebrar en " + direccion + ". Habrá un total de "
				+ bocadillos + " bocadillos y " + bebidas + " bebidas. Son " + invitados
				+ " invitados y se celebrará el día " + fecha + " a las " + hora + ". El precio asciende a "
				+ precioFiesta() + ".";
	}

	public void cancelarInvitacion() {
		invitados--;
	}

	public int precioFiesta() {
		int precio = (5 * invitados) + (2 * bebidas) + (3 * bocadillos);
		return precio;
	}
}
