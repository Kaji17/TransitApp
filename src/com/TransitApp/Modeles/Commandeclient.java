package com.TransitApp.Modeles;
// Generated 12 févr. 2023, 10:07:19 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commandeclient generated by hbm2java
 */
@Entity
@Table(name = "commandeclient", catalog = "transitbd")
public class Commandeclient implements java.io.Serializable {

	private String idcommandeclient;
	private String numerocommande;
	private Date datecreationcmd;
	private Date datelivraison;
	private Boolean delivrer;
	private String device;
	private String moyenpaiement;

	public Commandeclient() {
	}

	public Commandeclient(String idcommandeclient) {
		this.idcommandeclient = idcommandeclient;
	}

	public Commandeclient(String idcommandeclient, String numerocommande, Date datecreationcmd, Date datelivraison,
			Boolean delivrer, String device, String moyenpaiement) {
		this.idcommandeclient = idcommandeclient;
		this.numerocommande = numerocommande;
		this.datecreationcmd = datecreationcmd;
		this.datelivraison = datelivraison;
		this.delivrer = delivrer;
		this.device = device;
		this.moyenpaiement = moyenpaiement;
	}

	@Id

	@Column(name = "IDCOMMANDECLIENT", unique = true, nullable = false, length = 40)
	public String getIdcommandeclient() {
		return this.idcommandeclient;
	}

	public void setIdcommandeclient(String idcommandeclient) {
		this.idcommandeclient = idcommandeclient;
	}

	@Column(name = "NUMEROCOMMANDE", length = 50)
	public String getNumerocommande() {
		return this.numerocommande;
	}

	public void setNumerocommande(String numerocommande) {
		this.numerocommande = numerocommande;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATECREATIONCMD", length = 10)
	public Date getDatecreationcmd() {
		return this.datecreationcmd;
	}

	public void setDatecreationcmd(Date datecreationcmd) {
		this.datecreationcmd = datecreationcmd;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATELIVRAISON", length = 10)
	public Date getDatelivraison() {
		return this.datelivraison;
	}

	public void setDatelivraison(Date datelivraison) {
		this.datelivraison = datelivraison;
	}

	@Column(name = "DELIVRER")
	public Boolean getDelivrer() {
		return this.delivrer;
	}

	public void setDelivrer(Boolean delivrer) {
		this.delivrer = delivrer;
	}

	@Column(name = "DEVICE", length = 7)
	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	@Column(name = "MOYENPAIEMENT", length = 20)
	public String getMoyenpaiement() {
		return this.moyenpaiement;
	}

	public void setMoyenpaiement(String moyenpaiement) {
		this.moyenpaiement = moyenpaiement;
	}

}
