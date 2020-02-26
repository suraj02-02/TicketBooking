package com.cg.ticketbooking.service;

import com.cg.ticketbooking.exception.InvalidMovieException;

public interface ServiceIntf {
	  public void choosecity(String city) throws InvalidMovieException;
	  public void choosemovie(String usertheatre);
     public void searchScreen(String usertheatre);
     

}
