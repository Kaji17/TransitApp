package com.TransitApp.Modeles;
// Generated 11 févr. 2023, 19:25:20 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name = "admin", catalog = "transitbd")
public class Admin implements java.io.Serializable {

	private Integer idadmin;
	private String login;
	private String password;
	private String role;

	public Admin() {
	}

	public Admin(String login, String password, String role) {
		this.login = login;
		this.password = password;
		this.role = role;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "IDADMIN", unique = true, nullable = false)
	public Integer getIdadmin() {
		return this.idadmin;
	}

	public void setIdadmin(Integer idadmin) {
		this.idadmin = idadmin;
	}

	@Column(name = "LOGIN", nullable = false, length = 30)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "PASSWORD", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "ROLE", nullable = false, length = 20)
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
