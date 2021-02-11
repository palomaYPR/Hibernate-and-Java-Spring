/**
 * 
 */
package com.example.demo.model;

import lombok.Data;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Table Client
 * @author paloma
 *
 */

@Data
@Entity
@Table(name = "client")
@NamedQuery(name = "Client.findByIdentification", query = "SELECT c FROM Client c WHERE c.identificationClient = ?1")
public class Client {
	
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idClient;
	
	private String nameClient;
	private String lastNameClient;
	private String identificationClient;
	private String addressClient;
	private String telephoneNumberClient;
	private String emailClient;
	
	//Relation
	@OneToMany(mappedBy = "client")
	private Set<Reservations> reservations;
	
	public Client() {
		
	}

	public String getIdClient() {
		return idClient;
	}

	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getLastNameClient() {
		return lastNameClient;
	}

	public void setLastNameClient(String lastNameClient) {
		this.lastNameClient = lastNameClient;
	}

	public String getIdentificationClient() {
		return identificationClient;
	}

	public void setIdentificationClient(String identificationClient) {
		this.identificationClient = identificationClient;
	}

	public String getAddressClient() {
		return addressClient;
	}

	public void setAddressClient(String addressClient) {
		this.addressClient = addressClient;
	}

	public String getTelephoneNumberClient() {
		return telephoneNumberClient;
	}

	public void setTelephoneNumberClient(String telephoneNumberClient) {
		this.telephoneNumberClient = telephoneNumberClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public Set<Reservations> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservations> reservations) {
		this.reservations = reservations;
	}
	
	
}
