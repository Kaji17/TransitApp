package com.TransitApp.Modeles;
// Generated 7 févr. 2023, 23:03:37 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Ligneordremission generated by hbm2java
 */
@Entity
@Table(name = "ligneordremission", catalog = "transitbd")
public class Ligneordremission implements java.io.Serializable {

	private LigneordremissionId id;
	private Integer quantitelivrerclient;
	private Integer nombrearticle;
	private Float totalprixquantite;

	public Ligneordremission() {
	}

	public Ligneordremission(LigneordremissionId id) {
		this.id = id;
	}

	public Ligneordremission(LigneordremissionId id, Integer quantitelivrerclient, Integer nombrearticle,
			Float totalprixquantite) {
		this.id = id;
		this.quantitelivrerclient = quantitelivrerclient;
		this.nombrearticle = nombrearticle;
		this.totalprixquantite = totalprixquantite;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idordremission", column = @Column(name = "IDORDREMISSION", nullable = false)),
			@AttributeOverride(name = "idproduit", column = @Column(name = "IDPRODUIT", nullable = false)) })
	public LigneordremissionId getId() {
		return this.id;
	}

	public void setId(LigneordremissionId id) {
		this.id = id;
	}

	@Column(name = "QUANTITELIVRERCLIENT")
	public Integer getQuantitelivrerclient() {
		return this.quantitelivrerclient;
	}

	public void setQuantitelivrerclient(Integer quantitelivrerclient) {
		this.quantitelivrerclient = quantitelivrerclient;
	}

	@Column(name = "NOMBREARTICLE")
	public Integer getNombrearticle() {
		return this.nombrearticle;
	}

	public void setNombrearticle(Integer nombrearticle) {
		this.nombrearticle = nombrearticle;
	}

	@Column(name = "TOTALPRIXQUANTITE", precision = 8)
	public Float getTotalprixquantite() {
		return this.totalprixquantite;
	}

	public void setTotalprixquantite(Float totalprixquantite) {
		this.totalprixquantite = totalprixquantite;
	}

}
