package com.cg.ticketbooking.bean;

import java.util.Random;

public class Theatre {

int theatreid;
private String theatreName;
private String theatreCity;
private String managerName;
private String managerContact;
Movie movies;
Screen listOfScreen;

public Theatre(String managerName,String managerContact, String theatreName,String theatreCity) {
	this.managerName=managerName;
	this.managerContact=managerContact;
	this.theatreCity=theatreCity;
	this.theatreName=theatreName;
}
public int theatreidGenerator() {
	
	return 2000 + new Random().nextInt(1000);
}
public void  searchMovie() {
   	   
   }

public void searchScreen() {

}

public Movie getMovies() {
	return movies;
}
public void setMovies(Movie movies) {
	this.movies = movies;
}
public Screen getListOfScreen() {
	return listOfScreen;
}
public void setListOfScreen(Screen listOfScreen) {
	this.listOfScreen = listOfScreen;
}

public String getTheatreName() {
	return theatreName;
}
public void setTheatreName(String theatreName) {
	this.theatreName = theatreName;
}
public  String getTheatreCity() {
	return theatreCity;
}
public void setTheatreCity(String theatreCity) {
	this.theatreCity = theatreCity;
}
public String getManagerName() {
	return managerName;
}

public String getManagerContact() {
	return managerContact;
}


}

