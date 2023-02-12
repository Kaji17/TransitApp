package com.TransitApp.Modeles;
// Generated 12 févr. 2023, 10:07:19 by Hibernate Tools 4.3.6.Final

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
 * Transporteur generated by hbm2java
 */
@Entity
@Table(name = "transporteur", catalog = "transitbd")
public class Transporteur implements java.io.Serializable {

	private Integer idtransporteur;
	private int idadmin;
	private String nomtransporteur;
	private String prenomtrnsporteur;
	private String civilite;
	private Date datedebutembauche;
	private Date datefinembauche;
	private Float salaire;
	private String fonction;

	public Transporteur() {
	}

	public Transporteur(int idadmin) {
		this.idadmin = idadmin;
	}

	public Transporteur(int idadmin, String nomtransporteur, String prenomtrnsporteur, String civilite,
			Date datedebutembauche, Date datefinembauche, Float salaire, String fonction) {
		this.idadmin = idadmin;
		this.nomtransporteur = nomtransporteur;
		this.prenomtrnsporteur = prenomtrnsporteur;
		this.civilite = civilite;
		this.datedebutembauche = datedebutembauche;
		this.datefinembauche = datefinembauche;
		this.salaire = salaire;
		this.fonction = fonction;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDTRANSPORTEUR", unique = true, nullable = false)
	public Integer getIdtransporteur() {
		return this.idtransporteur;
	}

	public void setIdtransporteur(Integer idtransporteur) {
		this.idtransporteur = idtransporteur;
	}

	@Column(name = "IDADMIN", nullable = false)
	public int getIdadmin() {
		return this.idadmin;
	}

	public void setIdadmin(int idadmin) {
		this.idadmin = idadmin;
	}

	@Column(name = "NOMTRANSPORTEUR", length = 25)
	public String getNomtransporteur() {
		return this.nomtransporteur;
	}

	public void setNomtransporteur(String nomtransporteur) {
		this.nomtransporteur = nomtransporteur;
	}

	@Column(name = "PRENOMTRNSPORTEUR", length = 40)
	public String getPrenomtrnsporteur() {
		return this.prenomtrnsporteur;
	}

	public void setPrenomtrnsporteur(String prenomtrnsporteur) {
		this.prenomtrnsporteur = prenomtrnsporteur;
	}

	@Column(name = "CIVILITE", length = 10)
	public String getCivilite() {
		return this.civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEDEBUTEMBAUCHE", length = 10)
	public Date getDatedebutembauche() {
		return this.datedebutembauche;
	}

	public void setDatedebutembauche(Date datedebutembauche) {
		this.datedebutembauche = datedebutembauche;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEFINEMBAUCHE", length = 10)
	public Date getDatefinembauche() {
		return this.datefinembauche;
	}

	public void setDatefinembauche(Date datefinembauche) {
		this.datefinembauche = datefinembauche;
	}

	@Column(name = "SALAIRE", precision = 12, scale = 0)
	public Float getSalaire() {
		return this.salaire;
	}

	public void setSalaire(Float salaire) {
		this.salaire = salaire;
	}

	@Column(name = "FONCTION", length = 30)
	public String getFonction() {
		return this.fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

}
