package models;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	
	/**
	 * Constructor donde le pasamos todos los parametros. 
	 * 
	 * @param nombre	String donde indicamos el nombre de la persona
	 * @param apellidos	String donde indicamos los apellidos de la persona
	 * @param edad		Int donde indicamos la edad de la persona, esta debe estar entre 0 y 130
	 * @throws IllegalArgumentException	Excepcion lanzada si la edad no esta entre los parametros indicados
	 */
	public Persona(String nombre, String apellidos, int edad) {
		if(edad<0 || edad>130) {
			throw new IllegalArgumentException("La edad deba estar entre 0 y 130");
		}
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Devuelve si la persona es mayor de edad, menor de edad o jubilado
	 * 
	 * @return	String que dice si es mayor de edad, menor o jubilado
	 */
	public String mostrarEdad() {
		String frase="";
		if(this.edad<18) {
			frase= "Menor de edad";
		}
		else if(this.edad>=18 && this.edad<=65) {
			frase= "Mayor de edad";
		}
		else {
			frase= "Jubilado";
		}
		
		return frase;
	}
	
	

}
