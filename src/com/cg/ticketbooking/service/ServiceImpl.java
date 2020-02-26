package com.cg.ticketbooking.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.ticketbooking.bean.Movie;
import com.cg.ticketbooking.bean.Screen;
import com.cg.ticketbooking.bean.Theatre;
import com.cg.ticketbooking.dao.TicketBookingDaoImpl;
import com.cg.ticketbooking.exception.InvalidMovieException;

public class ServiceImpl implements ServiceIntf {
	TicketBookingDaoImpl tbdi=new TicketBookingDaoImpl();
	String usertheatre;
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	List<Theatre> list =tbdi.getTheatreData();
	
	
	public void choosecity(String city) throws InvalidMovieException {
		
		if(city.equalsIgnoreCase("delhi")||city.equalsIgnoreCase("noida")){
		
		for (Theatre t : list) {
			
			if (t.getTheatreCity().equalsIgnoreCase(city)) {
				System.out.println(" Theater name: "  +  t.getTheatreName());
	    	}
		   }
	}
				
		else{
			try {
			        throw new InvalidMovieException("INVALID CITY");
		}
			catch(Exception e) {
				System.out.println(e);
				
			}
			
		}
	}
	public void choosemovie(String usertheatre) {
		
        
		List<Movie> movieList1 =tbdi.getMovieList1Data(); 
		List<Movie> movieList2 =tbdi.getMovieList2Data(); 
		List<Movie> movieList3 =tbdi.getMovieList3Data();
		List<Movie> movieList4 = tbdi.getMovieList4Data();
     			
    if(usertheatre.equalsIgnoreCase("P.V.R")) {
			 System.out.println("*****ENTER MOVIE*****");
				String usermovie = null;
				try {
					usermovie = br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	
			for(Movie m : movieList1) {
				  
					if (m.getMovieName().equalsIgnoreCase(usermovie)) {
						System.out.println("MOVIE ID:" + m.getMovieid() + "\n" + "MOVIE NAME:" + m.getMovieName() + "\n"
								+ "DIRECTOR NAME:" + m.getMovieDirector() + "\n" + "MOVIE DURATION "
								+ m.getMovieLength() + "hrs" + "\n" + "RELEASE DATE:" + m.getMovieRealeseDate());
					    
					} 
	}          
			}
		else if(usertheatre.equalsIgnoreCase("CINEPOLIS")){
			System.out.println("*****ENTER MOVIE*****");
			String usermovie = null;
			try {
				usermovie = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
                   for (Movie m : movieList2) { 
                       if (m.getMovieName().equalsIgnoreCase(usermovie)) {
			System.out.println("MOVIE ID:" + m.getMovieid() + "\n" + "MOVIE NAME:" + m.getMovieName() + "\n"
					+ "DIRECTOR NAME:" + m.getMovieDirector() + "\n" + "MOVIE DURATION "
					+ m.getMovieLength() + "hrs" + "\n" + "RELEASE DATE:" + m.getMovieRealeseDate());
			
		}
  } 
    	}

		else if(usertheatre.equalsIgnoreCase("SUNCITY CINEMA")) {
			System.out.println("*****ENTER MOVIE*****");
			String usermovie = null;
			try {
				usermovie = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		   for (Movie m : movieList3) {
        	   if (m.getMovieName().equalsIgnoreCase(usermovie)) {
		       System.out.println("MOVIE ID:" + m.getMovieid() + "\n" + "MOVIE NAME:" + m.getMovieName() + "\n"
				+ "DIRECTOR NAME:" + m.getMovieDirector() + "\n" + "MOVIE DURATION "
				+ m.getMovieLength() + "hrs" + "\n" + "RELEASE DATE:" + m.getMovieRealeseDate());
		
	}
	}
		          }

		else if(usertheatre.equalsIgnoreCase("WAVE CINEMA")){
			System.out.println("*****ENTER MOVIE*****");
			String usermovie = null;
			try {
				usermovie = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 for (Movie m : movieList4) {
	      if (m.getMovieName().equalsIgnoreCase(usermovie)) {
		System.out.println("MOVIE ID:" + m.getMovieid() + "\n" + "MOVIE NAME:" + m.getMovieName() + "\n"
				+ "DIRECTOR NAME:" + m.getMovieDirector() + "\n" + "MOVIE DURATION "
				+ m.getMovieLength() + "hrs" + "\n" + "RELEASE DATE:" + m.getMovieRealeseDate());
		
		 
	   }
			}
		}
	}

	public void searchScreen(String usertheatre) {

		List<Screen> screenList1 =tbdi.getScreenList1Data();
		List<Screen> screenList2 =tbdi.getScreenList2Data();	
		List<Screen> screenList3 =tbdi.getScreenList3Data();
		List<Screen> screenList4 =tbdi.getScreenList4Data();

	
		if(usertheatre.equalsIgnoreCase("P.V.R")) {
			System.out.println("*****ENTER SCREEN*****\n 1.SCREEN 1  \n 2.SCREEN 2");
		      String userscreen=null;
		      try {
				userscreen=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		         for(Screen s : screenList1) {
		        	 
		     		if (s.getScreenName().equalsIgnoreCase(userscreen)) {
		     			System.out.println("SCREEN ID:" + s.getScreenid() + "\n" + "SCREEN TYPE:" + s.getScreenType() );
		     			System.out.println("      *********************************WELCOME********************************        ");
		     		}
		         }
	
		}
	
		else if(usertheatre.equalsIgnoreCase("CINEPOLIS")) {
			System.out.println("*****ENTER SCREEN*****\n 1.SCREEN 1  \n 2.SCREEN 2");
		      String userscreen=null;
		      try {
				userscreen=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		         for(Screen s : screenList2) {
		        	 
		     		if (s.getScreenName().equalsIgnoreCase(userscreen)) {
		     			System.out.println("SCREEN ID:" + s.getScreenid() + "\n" + "SCREEN TYPE:" + s.getScreenType() );
		     			System.out.println("      *********************************WELCOME********************************        ");
		     		}
		         }
	
		}
	
	
		else if(usertheatre.equalsIgnoreCase("SUNCITY CINEMA")) {
			System.out.println("*****ENTER SCREEN*****\n 1.SCREEN 1  \n 2.SCREEN 2");
		      String userscreen=null;
		      try {
				userscreen=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		         for(Screen s : screenList3) {
		        	 
		     		if (s.getScreenName().equalsIgnoreCase(userscreen)) {
		     			System.out.println("SCREEN ID:" + s.getScreenid() + "\n" + "SCREEN TYPE:" + s.getScreenType() );
		     			System.out.println("      *********************************WELCOME********************************        ");	     		
		     		}
		         }
	
		}
		else if(usertheatre.equalsIgnoreCase("WAVE CINEMA")) {
			System.out.println("*****ENTER SCREEN*****\n 1.SCREEN 1  \n 2.SCREEN 2");
		      String userscreen=null;
		      try {
				userscreen=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		         for(Screen s : screenList4) {
		        	 
		     		if (s.getScreenName().equalsIgnoreCase(userscreen)) {
		     			System.out.println("SCREEN ID:" + s.getScreenid() + "\n" + "SCREEN TYPE:" + s.getScreenType() );
		     			
		     			System.out.println("      *********************************WELCOME********************************        ");
		     		}
		         }
	
		}
	
	}
}
	




		  
	
   
