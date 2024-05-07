package testing.javabeans;
import modelo.javabeans.*;
public class Principal {
	public static void main(String[] args) {
		
		//Objetos de tipo Profesor
		Profesor p1 = new Profesor("2345769I", "Mauricio", "Ronda Relampago", "927664598", "Programación y Entornos de desarrollo");
		Profesor p2 = new Profesor("2345212369Y", "Patricio", "Calle cállese", "92767927457", "Lenguaje de Marcas");
		Profesor p3 = new Profesor("6732459U", "Rocinante", "Calle bocabajo", "927123835", "Nada de nada");
		//Objetos de tipo Alumno
		Alumno a1 = new Alumno("28764891K", "David", "Calle del alcornoque", "66789203", "4º de DAM");
		Alumno a2 = new Alumno("28234570P", "Anastasio", "Calle la morralla", "65777322", "10º de DAW");
		Alumno a3 = new Alumno("2855598234W", "Gumersindo", "Calle callita", "66234566", "0º de ING");
		//Objetos de tipo Administrativo
		Administrativo  adm1 = new Administrativo("7712395T", "Hermenegildo", "Calle los mozos", "997123477", "Llamar a seguridad");
		Administrativo  adm2 = new Administrativo("2345760N", "Basilisa", "Ctra aleluya", "82354760J", "Colocar papeles");
		Administrativo  adm3 = new Administrativo("1234678932C", "Teodoro", "Rambla Viva Espanya", "12476872Q", "Calentar la silla");
		//toString() de cada uno de los objetos creados
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(adm1.toString());
		System.out.println(adm2.toString());
		System.out.println(adm3.toString());
		//trabajar() de cada uno de ellos
		System.out.println(p1.trabajar());
		System.out.println(p2.trabajar());
		System.out.println(p3.trabajar());
		System.out.println(a1.trabajar());
		System.out.println(a2.trabajar());
		System.out.println(a3.trabajar());
		System.out.println(adm1.trabajar());
		System.out.println(adm2.trabajar());
		System.out.println(adm3.trabajar());
		//Alumno llama a Profesor
		System.out.println(a1.llamar(p2));
		System.out.println(a2.llamar(p3));
		System.out.println(a3.llamar(p1));
		//Profesor ponerNotas()
		System.out.println(p1.ponerNotas());
		System.out.println(p2.ponerNotas());
		System.out.println(p3.ponerNotas());
		//Alumno hacerExamen()
		System.out.println(a1.hacerExamen());
		System.out.println(a2.hacerExamen());
		System.out.println(a3.hacerExamen());
		//Administrativo gestionarMatricula()
		System.out.println(adm1.gestionarMatricula());
		System.out.println(adm2.gestionarMatricula());
		System.out.println(adm3.gestionarMatricula());
	}
	
	
}