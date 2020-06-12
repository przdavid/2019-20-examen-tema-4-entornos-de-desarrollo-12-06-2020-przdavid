package refactorizacion;

/**
 * @author David Pérez Ruiz.
 */

public class Persona {

	protected String nombre;
	protected String apellidos;
	protected String nif;

	public Persona() {
		super();
	}

	/**
	 * @return nombre de una persona.
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param asigna nombre a una persona.
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return apellidos de una persona.
	 */
	protected String getApellidos() {
		return apellidos;
	}

	/**
	 * @param asigna apellidos a una persona.
	 */
	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return NIF de una persona.
	 */
	protected String getNif() {
		return nif;
	}

	/**
	 * @param asigna NIF a una persona.
	 */
	protected void setNif(String nif) {
		this.nif = nif;
	}

}