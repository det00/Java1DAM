package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.*;

public class InstitutoDaoImplList implements IntInstitutoDao {
	private List<AbstractPersona> personas;

	public InstitutoDaoImplList() {
		super();
		personas = new ArrayList<AbstractPersona>();
		cargarDatos();
	}

	// Objetos de tipo Profesor
	Profesor p1 = new Profesor("2345769I", "Mauricio", "Ronda Relampago", "927664598",
			"Programación y Entornos de desarrollo");
	Profesor p2 = new Profesor("2345212369Y", "Patricio", "Calle cállese", "92767927457", "Lenguaje de Marcas");
	Profesor p3 = new Profesor("6732459U", "Rocinante", "Calle bocabajo", "927123835", "Nada de nada");
	// Objetos de tipo Alumno
	Alumno a1 = new Alumno("28764891K", "David", "Calle del alcornoque", "66789203", "4º de DAM");
	Alumno a2 = new Alumno("28234570P", "Anastasio", "Calle la morralla", "65777322", "10º de DAW");
	Alumno a3 = new Alumno("2855598234W", "Gumersindo", "Calle callita", "66234566", "0º de ING");
	// Objetos de tipo Administrativo
	Administrativo adm1 = new Administrativo("7712395T", "Hermenegildo", "Calle los mozos", "997123477",
			"Llamar a seguridad");
	Administrativo adm2 = new Administrativo("2345760N", "Basilisa", "Ctra aleluya", "82354760J", "Colocar papeles");
	Administrativo adm3 = new Administrativo("1234678932C", "Teodoro", "Rambla Viva Espanya", "12476872Q",
			"Calentar la silla");

	private void cargarDatos() {
		personas.add(a1);
		personas.add(a2);
		personas.add(a3);
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(adm1);
		personas.add(adm2);
		personas.add(adm3);
	}

	@Override
	public boolean altaPersona(AbstractPersona persona) {
		if (personas.contains(persona)) {
			return false;
		} else
			return personas.add(persona);
	}

	@Override
	public AbstractPersona buscarPersona(String nif) {
		for (AbstractPersona p : personas) {
			if (p.getNif().equalsIgnoreCase(nif))
				return p;
		}
		return null;
	}

	@Override
	public List<AbstractPersona> buscarTodas() {
		return personas;
	}

	@Override
	public boolean eliminarPersona(AbstractPersona persona) {
		if (persona != null) {
			for (AbstractPersona p : personas) {
				if (p.getNif().equals(persona.getNif())) {
					personas.remove(persona);
					return true;
				}
			}
		}
		return false;

	}

	@Override
	public List<AbstractPersona> BuscarPersonasPorTipo(String tipoPersona) {
		List<AbstractPersona> listaTipos = new ArrayList<>();
		for (AbstractPersona p : personas) {
			switch (tipoPersona.toLowerCase()) {
			case "profesor":
				if (p instanceof Profesor)
					listaTipos.add(p);
				break;
			case "alumno":
				if (p instanceof Alumno)
					listaTipos.add(p);
				break;
			case "administrativo":
				if (p instanceof Administrativo)
					listaTipos.add(p);
				break;

			default:
				break;
			}
		}
		return listaTipos;
	}
}
