package com.fabio.mvc.hotel.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="ruolo",schema="public")
public class RuoloEntity {
	
	@Id
	@Column(name="id_ruolo")
	private String id;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "ass_ruolo_funzione",
				joinColumns = {@JoinColumn(name="fk_ruolo")},
				inverseJoinColumns = {
						@JoinColumn(name="fk_funzione")
				}
	)
	private Set<AutorizzazioneEntity> autorizzazioni;
	
	@OneToMany(fetch = FetchType.LAZY)
	private Set<UtenteEntity> utenti;
	
	public RuoloEntity() {}

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

	public Set<AutorizzazioneEntity> getAutorizzazioni() {
		return autorizzazioni;
	}

	public void setAutorizzazioni(Set<AutorizzazioneEntity> autorizzazioni) {
		this.autorizzazioni = autorizzazioni;
	}

	public Set<UtenteEntity> getUtenti() {
		return utenti;
	}

	public void setUtenti(Set<UtenteEntity> utenti) {
		this.utenti = utenti;
	}
	
	
	
}
