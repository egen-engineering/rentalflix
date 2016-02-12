package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
	//POJO IMPLEMENTATION GOES HERE
	int id;
	String title,language,year,rentedBy;
	public int getId() {
		return id;
	}
	
	public Movie(int id, String title, String language, String year,
			String rentedBy) {
		this.id = id;
		this.title = title;
		this.language = language;
		this.year = year;
		this.rentedBy = rentedBy;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRentedBy() {
		return rentedBy;
	}
	public void setRentedBy(String rentedBy) {
		this.rentedBy = rentedBy;
	}  
}
