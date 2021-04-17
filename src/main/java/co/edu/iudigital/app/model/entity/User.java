package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;

@Entity
@Table(name = "user")

public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int user_Id;
	private String name;
	private String email;
	private String password;
	@Column(name = "create_at")
	private LocalDateTime create_At;
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profile_id;

	/**
	 * @return the user_Id
	 */
	public int getUser_Id() {
		return user_Id;
	}

	/**
	 * @param user_Id the user_Id to set
	 */
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the create_At
	 */
	public LocalDateTime getCreate_At() {
		return create_At;
	}

	/**
	 * @param create_At the create_At to set
	 */
	public void setCreate_At(LocalDateTime create_At) {
		this.create_At = create_At;
	}

	/**
	 * @return the profile_id
	 */
	public Profile getProfile_id() {
		return profile_id;
	}

	/**
	 * @param profile_id the profile_id to set
	 */
	public void setProfile_id(Profile profile_id) {
		this.profile_id = profile_id;
	}

}