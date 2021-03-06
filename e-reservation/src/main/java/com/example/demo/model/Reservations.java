/**
 * 
 */
package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * Table Reservations
 * @author paloma
 *
 */
@Data
@Entity
@Table(name = "reservations")
public class Reservations {
	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String idReservation;
	
	@Temporal(TemporalType.DATE)
	private Date dateEntryReservation;
	@Temporal(TemporalType.DATE)
	private Date dateOutReservation;
	
	private int numberPersonsReservation;
	private String descriptionReservation;
	
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
}
