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
 * Ordremission generated by hbm2java
 */
@Entity
@Table(name = "ordremission", catalog = "transitbd")
public class Ordremission implements java.io.Serializable {

	private Integer idordremission;
	private int idtransporteur;
	private String idcommandeclient;
	private String numeroordremission;
	private Date datedebut;
	private Date datefin;
	private String statue;
	private String rapport;

	public Ordremission() {
	}

	public Ordremission(int idtransporteur, String idcommandeclient) {
		this.idtransporteur = idtransporteur;
		this.idcommandeclient = idcommandeclient;
	}

	public Ordremission(int idordremission,int idtransporteur, String idcommandeclient, String numeroordremission, Date datedebut,
			Date datefin, String statue, String rapport) {
		this.idordremission = idordremission;
		this.idtransporteur = idtransporteur;
		this.idcommandeclient = idcommandeclient;
		this.numeroordremission = numeroordremission;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.statue = statue;
		this.rapport = rapport;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDORDREMISSION", unique = true, nullable = false)
	public Integer getIdordremission() {
		return this.idordremission;
	}

	public void setIdordremission(Integer idordremission) {
		this.idordremission = idordremission;
	}

	@Column(name = "IDTRANSPORTEUR", nullable = false)
	public int getIdtransporteur() {
		return this.idtransporteur;
	}

	public void setIdtransporteur(int idtransporteur) {
		this.idtransporteur = idtransporteur;
	}

	@Column(name = "IDCOMMANDECLIENT", nullable = false, length = 40)
	public String getIdcommandeclient() {
		return this.idcommandeclient;
	}

	public void setIdcommandeclient(String idcommandeclient) {
		this.idcommandeclient = idcommandeclient;
	}

	@Column(name = "NUMEROORDREMISSION", length = 20)
	public String getNumeroordremission() {
		return this.numeroordremission;
	}

	public void setNumeroordremission(String numeroordremission) {
		this.numeroordremission = numeroordremission;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEDEBUT", length = 10)
	public Date getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATEFIN", length = 10)
	public Date getDatefin() {
		return this.datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}

	@Column(name = "STATUE", length = 20)
	public String getStatue() {
		return this.statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	@Column(name = "RAPPORT", length = 100)
	public String getRapport() {
		return this.rapport;
	}

	public void setRapport(String rapport) {
		this.rapport = rapport;
	}

}
