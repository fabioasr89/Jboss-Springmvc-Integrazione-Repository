package com.fabio.mvc.hotel.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="prenotazione",schema="public")
public class PrenotazioneEntity {
	
	@Id
	@Column(name="id_prenotazione")
	private String idPrenotazione;
	
	
	@Column(name="data_prenotazione")
	private Date dataPrenotazione;
	
	@OneToMany(fetch=FetchType.EAGER)
	private Set<StanzaEntity> stanze;
	
	@Column(name="prezzo")
	private BigDecimal prezzo;
	
	@Column(name="annullata")
	private boolean annullata;
	
	@Column(name="data_annullamento")
	private Date dataAnnullamento;
	
	public PrenotazioneEntity() {}

	public String getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(String idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Set<StanzaEntity> getStanze() {
		return stanze;
	}

	public void setStanze(Set<StanzaEntity> stanze) {
		this.stanze = stanze;
	}

	public BigDecimal getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}

	public boolean isAnnullata() {
		return annullata;
	}

	public void setAnnullata(boolean annullata) {
		this.annullata = annullata;
	}

	public Date getDataAnnullamento() {
		return dataAnnullamento;
	}

	public void setDataAnnullamento(Date dataAnnullamento) {
		this.dataAnnullamento = dataAnnullamento;
	}
	
	
	
}
