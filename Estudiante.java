package refactorizacion;
/**
 * @author Jaime Rabasco Ronda
 */
/*Refactorizacion
Extrae una superclase con los campos
	nombre
	apellidos
	nif
y los metodos
	getNombre(), setNombre()
	getApellidos(), setApellidos()
	getNif(), setNif()*/
	

enum Curso {
	PRIMARIA, ESO, BACHILLERATO, UNIVERSIDAD
};

public class Estudiante extends Persona{
	Curso curso;
	/**
	 * @param nombre: nombre del estudiante. (String).
	 * @param apellidos: apellido del estudiante. (String).
	 * @param nif: nif del estudiante. (String).
	 * @param curso: curso del estudiante. (String).
	 */
	protected Estudiante(String nombre, String apellidos, String nif,
			Curso curso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.curso = curso;
	}

	/**
	 * @return curso del estudiante
	 */
	protected Curso getCurso() {
		return curso;
	}

	/**
	 * @param asigna curso a un estudiante.
	 */
	protected void setCurso(Curso curso) {
		this.curso = curso;
	}

	
}