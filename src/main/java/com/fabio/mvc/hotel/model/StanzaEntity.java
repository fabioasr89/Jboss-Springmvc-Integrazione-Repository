package com.fabio.mvc.hotel.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="stanza",schema="public")
public class StanzaEntity {
	
	@Id
	@Column(name="id_stanza")
	private String id;
	
	@Column(name="numero")
	private Integer numeroStanza;
	
	@Column(name="prezzo")
	private BigDecimal prezzo;
	
	@Column(name="mq")
	private Double mq;
	
	@Column(name="codice",unique=true)
	private String codice;
	
	
	public StanzaEntity() {}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Integer getNumeroStanza() {
		return numeroStanza;
	}


	public void setNumeroStanza(Integer numeroStanza) {
		this.numeroStanza = numeroStanza;
	}


	public BigDecimal getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(BigDecimal prezzo) {
		this.prezzo = prezzo;
	}


	public Double getMq() {
		return mq;
	}


	public void setMq(Double mq) {
		this.mq = mq;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}
	
	
	
}
