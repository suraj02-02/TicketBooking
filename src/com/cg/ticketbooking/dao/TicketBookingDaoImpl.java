package com.cg.ticketbooking.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


import com.cg.ticketbooking.bean.Movie;
import com.cg.ticketbooking.bean.Screen;
import com.cg.ticketbooking.bean.Theatre;

public class TicketBookingDaoImpl implements TicketBookingDaoIntf{
	List<Theatre>  list = new ArrayList<Theatre>();
	List<Screen> screenList1 =new ArrayList<Screen>();
	List<Screen> screenList2 =new ArrayList<Screen>();
	List<Screen> screenList3 =new ArrayList<Screen>();
	List<Screen> screenList4 =new ArrayList<Screen>();
	List<Movie> movieList1 = new ArrayList<Movie>();
	List<Movie> movieList2 = new ArrayList<Movie>();
	List<Movie> movieList3 = new ArrayList<Movie>();
	List<Movie> movieList4 = new ArrayList<Movie>();
	
	public TicketBookingDaoImpl() {

		list.add( new Theatre("suraj", "1234", "P.V.R", "NOIDA"));
		list.add(new Theatre("shubham", "5678", "CINEPOLIS", "DELHI"));
		list.add(new Theatre("paras", "0987", "SUNCITY CINEMA", "DELHI"));
		list.add(new Theatre("robin", "6543" + "", "WAVE CINEMA", "NOIDA"));
		
	

		movieList1.add(new Movie(3001, "TANHAJI", "JAY WARDAN", 3, LocalDate.now()));
		movieList1.add(new Movie(3002, "DABANG 3", "ARBAAZ KHAN", 2, LocalDate.now()));
		movieList1.add(new Movie(3003, "GOOD NEWS", "SHOAIB", 3, LocalDate.now()));
		movieList2.add(new Movie(3004, "TANHAJI", "JAY WARDAN", 2, LocalDate.now()));
		movieList2.add(new Movie(3005, "RACE 3", "JAY WARDAN", 4, LocalDate.now()));
		movieList3.add(new Movie(3006, "LUCIFER", "JAMES CAMERON", 5, LocalDate.now()));
		movieList3.add(new Movie(3007, "KGF", "JAY TRIMURTI", 2, LocalDate.now()));
		movieList4.add(new Movie(3008, "DROOLS", "JEFF", 3, LocalDate.now()));
		movieList4.add(new Movie(3009, "GO HOME", "ADNAN KHAN", 1, LocalDate.now()));

		screenList1.add(new Screen(4001,"SCREEN 1","2D"));
		screenList1.add(new Screen(4002,"SCREEN 2","3D"));
		screenList2.add(new Screen(4003,"SCREEN 1","IMAX"));
		screenList2.add(new Screen(4004,"SCREEN 2","2D"));
		screenList3.add(new Screen(4005,"SCREEN 1","3D"));
		screenList3.add(new Screen(4006,"SCREEN 2","IMAX"));
		screenList4.add(new Screen(4007,"SCREEN 1","2D"));
		screenList4.add(new Screen(4008,"SCREEN 2","3D")); 
	}
	
	
	public List<Theatre> getTheatreData(){
		return list;
	}
	
	public List<Movie> getMovieList1Data(){
		return movieList1;
	}
	public List<Movie> getMovieList2Data(){
		return movieList2;
	}
	public List<Movie> getMovieList3Data(){
		return movieList3;
	}
	public List<Movie> getMovieList4Data(){
		return movieList4;
	}
	public List<Screen> getScreenList1Data(){
		return screenList1;
	}
	
	public List<Screen> getScreenList2Data(){
		return screenList2;
	}
	public List<Screen> getScreenList3Data(){
		return screenList3;
	}
	public List<Screen> getScreenList4Data(){
		return screenList4;
	}
}
