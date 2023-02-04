package com.TransitApp.Modeles;
// Generated 4 févr. 2023, 18:30:13 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contenir generated by hbm2java
 */
@Entity
@Table(name = "contenir", catalog = "transitbd")
public class Contenir implements java.io.Serializable {

	private ContenirId id;
	private Date dateentree;
	private Date datesortie;

	public Contenir() {
	}

	public Contenir(ContenirId id) {
		this.id = id;
	}

	public Contenir(ContenirId id, Date dateentree, Date datesortie) {
		this.id = id;
		this.dateentree = dateentree;
		this.datesortie = datesortie;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idproduit", column = @Column(name = "IDPRODUIT", nullable = false)),
			@AttributeOverride(name = "identrepot", column = @Column(name = "IDENTREPOT", nullable = false)) })
	public ContenirId getId() {
		return this.id;
	}

	public void setId(ContenirId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEENTREE", length = 10)
	public Date getDateentree() {
		return this.dateentree;
	}

	public void setDateentree(Date dateentree) {
		this.dateentree = dateentree;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATESORTIE", length = 10)
	public Date getDatesortie() {
		return this.datesortie;
	}

	public void setDatesortie(Date datesortie) {
		this.datesortie = datesortie;
	}

}