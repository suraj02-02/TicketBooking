package com.cg.ticketbooking.exception;

import com.cg.ticketbooking.dao.TicketBookingDaoImpl;
import com.cg.ticketbooking.service.ServiceImpl;

public class InvalidMovieException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String string;

	public InvalidMovieException(String string) {
		super(string);
	}

}
