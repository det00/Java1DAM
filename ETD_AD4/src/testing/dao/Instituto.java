package testing.dao;

import java.util.List;

import modelo.dao.*;
import modelo.javabeans.*;

public class Instituto {
	private static InstitutoDaoImplList institutoDao;
	private static Profesor p1, p2, p3;
	private static Alumno a1, a2, a3;
	private static Administrativo adm1, adm2, adm3;
	
	static {
		//Agrupo aqui todo lo estático que solo será visible desde esta clase.
		institutoDao = new InstitutoDaoImplList();
		p1 = new Profesor("2345769I", "Mauricio", "Ronda Relampago", "927664598", "Programación y Entornos de desarrollo");
		p2 = new Profesor("2345212369Y", "Patricio", "Calle cállese", "92767927457", "Lenguaje de Marcas");
		p3 = new Profesor("6732459U", "Rocinante", "Calle bocabajo", "927123835", "Nada de nada");
		//a1 = new Alumno("28764891K", "David", "Calle del alcornoque", "66789203", "4º de DAM");
		a2 = new Alumno("28234570P", "Anastasio", "Calle la morralla", "65777322", "10º de DAW");
		a3 = new Alumno("2855598234W", "Gumersindo", "Calle callita", "66234566", "0º de ING");
		adm1 = new Administrativo("7712395T", "Hermenegildo", "Calle los mozos", "997123477", "Llamar a seguridad");
		adm2 = new Administrativo("2345760N", "Basilisa", "Ctra aleluya", "82354760J", "Colocar papeles");
		adm3 = new Administrativo("1234678932C", "Teodoro", "Rambla Viva Espanya", "12476872Q", "Calentar la silla");
	}
	public static void main(String[] args) {
		alta();
		//buscar();
		//eliminar();
		//buscarTodas();
		//tipo();
		}
	public static void alta() {
		//Añade nuevo objeto a la lista de objetos.
		AbstractPersona tomas = new Profesor("23495876I", "Tomás", "Calle del Pez", "919191912", "Tutor");
		System.out.println(institutoDao.altaPersona(tomas));
	}
	public static void eliminar() {
		System.out.println(institutoDao.eliminarPersona(a2));
	}
	public static void buscarTodas() {
		//Creo los contadores de los tipos de personas y los inicializo a 0
		int adm = 0;
		int pro = 0;
		int alu = 0;
		//Recorro la lista y se van sumando a los contadores.
		for (AbstractPersona p:institutoDao.buscarTodas()) {
			if (p instanceof Profesor)
				pro ++;
			else if (p instanceof Alumno)
				alu ++;
			else if (p instanceof Administrativo)
				adm ++;
			System.out.println(p);
			}
		System.out.println("Hay un total de " + alu + " alumnos, " + pro + " profesores y " + adm + " administrativos.");
		}
	
	public static void tipo() {
		
		/* Creo una variable String con el tipo buscado,
		 * creo una lista de personas y se van añadiento las buscadas,
		 * si al finalizar el metodo la lista sigue vacía, avisa al usuario,
		 * en caso contratio, muestra la lista con las personas encontradas.*/
		
		String tipoBuscado = "pRofesor";
		List<AbstractPersona> listaTipos = institutoDao.BuscarPersonasPorTipo(tipoBuscado);
		if (listaTipos.isEmpty())
			System.out.println("No hay personas del tipo que buscas.");
		else System.out.println(listaTipos);
	}
	
	
	public static void buscar() {
		
		/* Creo una variable String con el NIF,
		 * creo un objeto persona con el NIF buscado,
		 * si el metodo buscar devuelve null, avisa al usuario*/
		
		String nifBuscado = "2345212369Y"; 
		AbstractPersona personaBuscada = institutoDao.buscarPersona(nifBuscado);
		if (personaBuscada!=null)
			System.out.println(personaBuscada);
		else System.out.println("La persona que buscas no existe.");
	}
}
		
		
