package eu.elraro.practica1rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repartidor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nombre;
	private String apellidos;
	private int edad;

	public Repartidor() {
	}

	public Repartidor(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
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

}
