package com.TransitApp.Modeles;
// Generated 12 févr. 2023, 10:07:19 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Effectuer generated by hbm2java
 */
@Entity
@Table(name = "effectuer", catalog = "transitbd")
public class Effectuer implements java.io.Serializable {

	private EffectuerId id;

	public Effectuer() {
	}

	public Effectuer(EffectuerId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idcommandeclient", column = @Column(name = "IDCOMMANDECLIENT", nullable = false, length = 40)),
			@AttributeOverride(name = "idclient", column = @Column(name = "IDCLIENT", nullable = false)) })
	public EffectuerId getId() {
		return this.id;
	}

	public void setId(EffectuerId id) {
		this.id = id;
	}

}
