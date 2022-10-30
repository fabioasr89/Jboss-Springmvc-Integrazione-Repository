package com.fabio.mvc.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="utente",schema="public")
public class UtenteEntity {
	
	@Id
	@Column(name="id_utente")
	private String id;
	
	@Column(name="username",unique=true)
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="attivo")
	private boolean attivo;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="fk_ruolo",referencedColumnName = "id_ruolo")
	private RuoloEntity ruolo;
	
	
	
	
	
	public UtenteEntity() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isAttivo() {
		return attivo;
	}


	public void setAttivo(boolean attivo) {
		this.attivo = attivo;
	}


	public RuoloEntity getRuolo() {
		return ruolo;
	}


	public void setRuolo(RuoloEntity ruolo) {
		this.ruolo = ruolo;
	}
	
	
	
}
