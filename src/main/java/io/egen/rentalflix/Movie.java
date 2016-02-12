package io.egen.rentalflix;

/**
 * Entity representing a movie. Fields: id, title, year, language
 */
public class Movie {
	// POJO IMPLEMENTATION GOES HERE
	private String id;
	private String title;
	private String year;
	private String language;
	private String userName;

	public Movie(String id, String title, String year, String language) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.language = language;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
