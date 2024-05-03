package testing.dao;

import modelo.dao.*;
import modelo.javabeans.*;

public class Instituto {
	private static InstitutoDaoImplList institutoDao;
	private static Profesor p1, p2, p3;
	private static Alumno a1, a2, a3;
	private static Administrativo adm1, adm2, adm3;
	
	static {
		institutoDao = new InstitutoDaoImplList();
		p1 = new Profesor("2345769I", "Mauricio", "Ronda Relampago", "927664598", "Programación y Entornos de desarrollo");
		p2 = new Profesor("2345212369Y", "Patricio", "Calle cállese", "92767927457", "Lenguaje de Marcas");
		p3 = new Profesor("6732459U", "Rocinante", "Calle bocabajo", "927123835", "Nada de nada");
		a1 = new Alumno("28764891K", "David", "Calle del alcornoque", "66789203", "4º de DAM");
		a2 = new Alumno("28234570P", "Anastasio", "Calle la morralla", "65777322", "10º de DAW");
		a3 = new Alumno("2855598234W", "Gumersindo", "Calle callita", "66234566", "0º de ING");
		adm1 = new Administrativo("7712395T", "Hermenegildo", "Calle los mozos", "997123477", "Llamar a seguridad");
		adm2 = new Administrativo("2345760N", "Basilisa", "Ctra aleluya", "82354760J", "Colocar papeles");
		adm3 = new Administrativo("1234678932C", "Teodoro", "Rambla Viva Espanya", "12476872Q", "Calentar la silla");
	}
	public static void main(String[] args) {
		//alta();
		//buscar();
		//eliminar();
		//buscarTodas();
		tipo();
		}
	public static void alta() {
		institutoDao.altaPersona(new Profesor("23495876I", "Tomás", "Calle del Pez", "919191912", "Tutor"));
	}
	public static void eliminar() {
		System.out.println(institutoDao.eliminarPersona(a1));
		System.out.println(institutoDao.eliminarPersona(a2));
		System.out.println(institutoDao.eliminarPersona(a3));
		System.out.println(institutoDao.eliminarPersona(p1));
		System.out.println(institutoDao.eliminarPersona(p2));
		System.out.println(institutoDao.eliminarPersona(p3));
		System.out.println(institutoDao.eliminarPersona(adm1));
		System.out.println(institutoDao.eliminarPersona(adm2));
		System.out.println(institutoDao.eliminarPersona(adm3));
	}
	public static void buscarTodas() {
		int adm = 0;
		int pro = 0;
		int alu = 0;
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
		for(AbstractPersona p:institutoDao.BuscarPersonasPorTipo("Profeso")) 
			System.out.println(p);
	}
	public static void buscar() {
		System.out.println(institutoDao.buscarPersona("2345760N"));
	}
}
		
		
