package com.fabio.mvc.hotel.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autorizzazione",schema="public")
public class AutorizzazioneEntity {
	
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="codice",unique=true)
	private String codice;
	
	@Column(name="descrizione")
	private String descrizione;
	
	public AutorizzazioneEntity() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
}
