package com.TransitApp.Modeles;
// Generated 12 févr. 2023, 10:07:19 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * LigneordremissionId generated by hbm2java
 */
@Embeddable
public class LigneordremissionId implements java.io.Serializable {

	private int idordremission;
	private int idproduit;

	public LigneordremissionId() {
	}

	public LigneordremissionId(int idordremission, int idproduit) {
		this.idordremission = idordremission;
		this.idproduit = idproduit;
	}

	@Column(name = "IDORDREMISSION", nullable = false)
	public int getIdordremission() {
		return this.idordremission;
	}

	public void setIdordremission(int idordremission) {
		this.idordremission = idordremission;
	}

	@Column(name = "IDPRODUIT", nullable = false)
	public int getIdproduit() {
		return this.idproduit;
	}

	public void setIdproduit(int idproduit) {
		this.idproduit = idproduit;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LigneordremissionId))
			return false;
		LigneordremissionId castOther = (LigneordremissionId) other;

		return (this.getIdordremission() == castOther.getIdordremission())
				&& (this.getIdproduit() == castOther.getIdproduit());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdordremission();
		result = 37 * result + this.getIdproduit();
		return result;
	}

}
