/**
 * 
 */
package com.example.demo.business.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Reservations;

/**
 * @author paloma
 *
 */
public interface RepositoryReservation extends JpaRepository<Reservations, String>{
	
	@Query("SELECT r FROM Reservations r WHERE r.dateEntryReservation =: initialDate and r.dateOutReservation =: finalDate")
	public List<Reservations> find(@Param("dateEntryReservation") Date initialDate, @Param("dateOutReservation") Date finalDate);
	
}
