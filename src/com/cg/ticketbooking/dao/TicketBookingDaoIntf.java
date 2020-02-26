package com.cg.ticketbooking.dao;

import java.util.List;

import com.cg.ticketbooking.bean.Movie;
import com.cg.ticketbooking.bean.Screen;
import com.cg.ticketbooking.bean.Theatre;

public interface TicketBookingDaoIntf {
	          
	
	public List<Theatre> getTheatreData();

	public List<Movie> getMovieList1Data();
	
	public List<Movie> getMovieList2Data();

	public List<Movie> getMovieList3Data();
	
	public List<Movie> getMovieList4Data();
	
	public List<Screen> getScreenList1Data();
	
	public List<Screen> getScreenList2Data();
	
	public List<Screen> getScreenList3Data();
	
	public List<Screen> getScreenList4Data();
}

	
	

