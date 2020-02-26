package com.cg.ticketbooking.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.ticketbooking.bean.Movie;
import com.cg.ticketbooking.bean.Theatre;
import com.cg.ticketbooking.exception.InvalidMovieException;
import com.cg.ticketbooking.service.ServiceImpl;

public class User {
	String city;
	InputStreamReader r = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(r);
	ServiceImpl si = new ServiceImpl();

	public static void main(String[] args) throws IOException, InvalidMovieException {

		User u = new User();
		u.homePage();

	}

	public void homePage() throws IOException, InvalidMovieException {
		System.out.println("*****ENTER CITY*****");
		String city = br.readLine();
		si.choosecity(city);
		if(city.equalsIgnoreCase("noida")||city.equalsIgnoreCase("delhi")) {

		System.out.println("*****ENTER THEATRE*****");
		String usertheatre = br.readLine();
	    switch (usertheatre) {

		case "P.V.R": {
			si.choosemovie(usertheatre);
		}
			break;

		case "CINEPOLIS": {

			si.choosemovie(usertheatre);
		}
			break;

		case "SUNCITY CINEMA": {

			si.choosemovie(usertheatre);

		}
			break;

		case "WAVE CINEMA": {
			si.choosemovie(usertheatre);

		}
			break;
		}
		si.searchScreen(usertheatre);

	}
	
}
}