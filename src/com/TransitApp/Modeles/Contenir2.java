package com.TransitApp.Modeles;
// Generated 7 févr. 2023, 23:03:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Contenir2 generated by hbm2java
 */
@Entity
@Table(name = "contenir2", catalog = "transitbd")
public class Contenir2 implements java.io.Serializable {

	private Contenir2Id id;
	private Integer quantitearticle;
	private String idlignecommande;
	private Float cout;

	public Contenir2() {
	}

	public Contenir2(Contenir2Id id, String idlignecommande) {
		this.id = id;
		this.idlignecommande = idlignecommande;
	}

	public Contenir2(Contenir2Id id, Integer quantitearticle, String idlignecommande, Float cout) {
		this.id = id;
		this.quantitearticle = quantitearticle;
		this.idlignecommande = idlignecommande;
		this.cout = cout;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idproduit", column = @Column(name = "IDPRODUIT", nullable = false)),
			@AttributeOverride(name = "idcommandeclient", column = @Column(name = "IDCOMMANDECLIENT", nullable = false, length = 40)) })
	public Contenir2Id getId() {
		return this.id;
	}

	public void setId(Contenir2Id id) {
		this.id = id;
	}

	@Column(name = "QUANTITEARTICLE")
	public Integer getQuantitearticle() {
		return this.quantitearticle;
	}

	public void setQuantitearticle(Integer quantitearticle) {
		this.quantitearticle = quantitearticle;
	}

	@Column(name = "IDLIGNECOMMANDE", nullable = false, length = 20)
	public String getIdlignecommande() {
		return this.idlignecommande;
	}

	public void setIdlignecommande(String idlignecommande) {
		this.idlignecommande = idlignecommande;
	}

	@Column(name = "COUT", precision = 8)
	public Float getCout() {
		return this.cout;
	}

	public void setCout(Float cout) {
		this.cout = cout;
	}

}
