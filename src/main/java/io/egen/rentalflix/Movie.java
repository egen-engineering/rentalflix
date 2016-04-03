package io.egen.rentalflix;

/**
 * Entity representing a movie.
 * Fields: id, title, year, language
 */
public class Movie {
	//POJO IMPLEMENTATION GOES HERE


    private int id;
    private String title;
    private String year;
    private String language;
    private boolean isRent=false;

    public Movie(int id, String title, String year, String language) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isRent() {
        return isRent;

    }

    public void setRent(boolean rent) {
        isRent = rent;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", language='" + language + '\'' +
                ", isRent=" + isRent +
                '}';
    }
}
