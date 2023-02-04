package com.TransitApp.Modeles;
// Generated 4 févr. 2023, 18:30:13 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Fournisseur generated by hbm2java
 */
@Entity
@Table(name = "fournisseur", catalog = "transitbd")
public class Fournisseur implements java.io.Serializable {

	private Integer idfournisseur;
	private String nomfournisseur;
	private String adressefournisseur;
	private String villefournisseur;
	private String cpfournisseur;
	private String emailfournisseur;
	private String telephonefournisseur;
	private String paysfournisseur;

	public Fournisseur() {
	}

	public Fournisseur(String nomfournisseur, String adressefournisseur, String villefournisseur, String cpfournisseur,
			String emailfournisseur, String telephonefournisseur, String paysfournisseur) {
		this.nomfournisseur = nomfournisseur;
		this.adressefournisseur = adressefournisseur;
		this.villefournisseur = villefournisseur;
		this.cpfournisseur = cpfournisseur;
		this.emailfournisseur = emailfournisseur;
		this.telephonefournisseur = telephonefournisseur;
		this.paysfournisseur = paysfournisseur;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDFOURNISSEUR", unique = true, nullable = false)
	public Integer getIdfournisseur() {
		return this.idfournisseur;
	}

	public void setIdfournisseur(Integer idfournisseur) {
		this.idfournisseur = idfournisseur;
	}

	@Column(name = "NOMFOURNISSEUR", length = 25)
	public String getNomfournisseur() {
		return this.nomfournisseur;
	}

	public void setNomfournisseur(String nomfournisseur) {
		this.nomfournisseur = nomfournisseur;
	}

	@Column(name = "ADRESSEFOURNISSEUR", length = 50)
	public String getAdressefournisseur() {
		return this.adressefournisseur;
	}

	public void setAdressefournisseur(String adressefournisseur) {
		this.adressefournisseur = adressefournisseur;
	}

	@Column(name = "VILLEFOURNISSEUR", length = 50)
	public String getVillefournisseur() {
		return this.villefournisseur;
	}

	public void setVillefournisseur(String villefournisseur) {
		this.villefournisseur = villefournisseur;
	}

	@Column(name = "CPFOURNISSEUR", length = 10)
	public String getCpfournisseur() {
		return this.cpfournisseur;
	}

	public void setCpfournisseur(String cpfournisseur) {
		this.cpfournisseur = cpfournisseur;
	}

	@Column(name = "EMAILFOURNISSEUR", length = 50)
	public String getEmailfournisseur() {
		return this.emailfournisseur;
	}

	public void setEmailfournisseur(String emailfournisseur) {
		this.emailfournisseur = emailfournisseur;
	}

	@Column(name = "TELEPHONEFOURNISSEUR", length = 15)
	public String getTelephonefournisseur() {
		return this.telephonefournisseur;
	}

	public void setTelephonefournisseur(String telephonefournisseur) {
		this.telephonefournisseur = telephonefournisseur;
	}

	@Column(name = "PAYSFOURNISSEUR", length = 30)
	public String getPaysfournisseur() {
		return this.paysfournisseur;
	}

	public void setPaysfournisseur(String paysfournisseur) {
		this.paysfournisseur = paysfournisseur;
	}

}