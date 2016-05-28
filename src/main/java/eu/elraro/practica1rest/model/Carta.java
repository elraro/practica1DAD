package eu.elraro.practica1rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Carta {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String remitente;
	private String destinatario;
	private String mensaje;

	public Carta() {
	}

	public Carta(String remitente, String destinatario, String mensaje) {
		this.remitente = remitente;
		this.destinatario = destinatario;
		this.mensaje = mensaje;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
