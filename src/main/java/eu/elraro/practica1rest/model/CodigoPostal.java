package eu.elraro.practica1rest.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CodigoPostal {

	@Id
	private long codigoPostal;
	private String ciudad;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Carta> cartas;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Repartidor> repartidores;

	public CodigoPostal() {
	}

	public CodigoPostal(long codigoPostal, String ciudad, List<Carta> cartas, List<Repartidor> repartidores) {
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		this.cartas = cartas;
		this.repartidores = repartidores;
	}

	public long getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(long codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}

	public List<Repartidor> getRepartidores() {
		return repartidores;
	}

	public void setRepartidores(List<Repartidor> repartidores) {
		this.repartidores = repartidores;
	}

}
