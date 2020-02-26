package com.cg.ticketbooking.bean;
import java.time.LocalDate;
public class Movie {
	
	int movieid;
	String movieName;
	String movieDirector;
	int movieLength;
	LocalDate movieRealeseDate;
	public Movie() {}
	
	  public Movie(int movieid,String movieName, String movieDirector, int movieLength, LocalDate movieRealeseDate ) {
		  this.movieid=movieid;
		  this.movieName=movieName;
		  this.movieDirector=movieDirector;
		  this.movieLength=movieLength;
		  this.movieRealeseDate=movieRealeseDate;        
		  
	  }

	  public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public int getMovieLength() {
		return movieLength;
	}
	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}
	public LocalDate getMovieRealeseDate() {
		return movieRealeseDate;
	}
	public void setMovieRealeseDate(LocalDate movieRealeseDate) {
		this.movieRealeseDate = movieRealeseDate;
	}
	

}
