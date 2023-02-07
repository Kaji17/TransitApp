package com.TransitApp.Modeles;
// Generated 7 févr. 2023, 23:03:37 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commandefournisseur generated by hbm2java
 */
@Entity
@Table(name = "commandefournisseur", catalog = "transitbd")
public class Commandefournisseur implements java.io.Serializable {

	private Integer idcommandefourn;
	private String device;
	private Date datecreationcmd;
	private Date datelivraison;
	private Boolean delivrer;
	private int idfournisseur;
	private int idresporeapro;
	private String numerocommande;

	public Commandefournisseur() {
	}

	public Commandefournisseur(String device, Date datecreationcmd, int idfournisseur, int idresporeapro,
			String numerocommande) {
		this.device = device;
		this.datecreationcmd = datecreationcmd;
		this.idfournisseur = idfournisseur;
		this.idresporeapro = idresporeapro;
		this.numerocommande = numerocommande;
	}

	public Commandefournisseur(String device, Date datecreationcmd, Date datelivraison, Boolean delivrer,
			int idfournisseur, int idresporeapro, String numerocommande) {
		this.device = device;
		this.datecreationcmd = datecreationcmd;
		this.datelivraison = datelivraison;
		this.delivrer = delivrer;
		this.idfournisseur = idfournisseur;
		this.idresporeapro = idresporeapro;
		this.numerocommande = numerocommande;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDCOMMANDEFOURN", unique = true, nullable = false)
	public Integer getIdcommandefourn() {
		return this.idcommandefourn;
	}

	public void setIdcommandefourn(Integer idcommandefourn) {
		this.idcommandefourn = idcommandefourn;
	}

	@Column(name = "DEVICE", nullable = false, length = 7)
	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATECREATIONCMD", nullable = false, length = 10)
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

	@Column(name = "IDFOURNISSEUR", nullable = false)
	public int getIdfournisseur() {
		return this.idfournisseur;
	}

	public void setIdfournisseur(int idfournisseur) {
		this.idfournisseur = idfournisseur;
	}

	@Column(name = "IDRESPOREAPRO", nullable = false)
	public int getIdresporeapro() {
		return this.idresporeapro;
	}

	public void setIdresporeapro(int idresporeapro) {
		this.idresporeapro = idresporeapro;
	}

	@Column(name = "NUMEROCOMMANDE", nullable = false, length = 50)
	public String getNumerocommande() {
		return this.numerocommande;
	}

	public void setNumerocommande(String numerocommande) {
		this.numerocommande = numerocommande;
	}

}
