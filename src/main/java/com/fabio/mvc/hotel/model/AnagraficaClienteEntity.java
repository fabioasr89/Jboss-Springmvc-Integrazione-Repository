package com.fabio.mvc.hotel.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="anag_clienti",schema="public")
public class AnagraficaClienteEntity {
	
	
	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="nome",nullable=false)
	private String nome;
	
	@Column(name="cognome",nullable=false)
	private String cognome;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_idprenotazione",nullable=false)
	private Set<PrenotazioneEntity> prenotazioni;
	
	@Column(name="email")
	private String email;
	
	@Column(name="indirizzo")
	private String indirizzo;
	
	@Column(name="telefono")
	private String telefono;
	
	public AnagraficaClienteEntity() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public Set<PrenotazioneEntity> getPrenotazioni() {
		return prenotazioni;
	}


	public void setPrenotazioni(Set<PrenotazioneEntity> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIndirizzo() {
		return indirizzo;
	}


	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
