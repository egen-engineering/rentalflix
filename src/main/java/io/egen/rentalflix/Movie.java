package NetFlix;

public class Movie {
	private int id;
	private static String title;
	private String language;
	private int year;
	public String Name;
	public String Stuff;
	public String Nid;
	public String Nyear;
	public Movie(int id ,String title,String language,int year ) {
		this.id= id;
		this.title=title;
		this.language=language;
		this.year=year;
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getTitle() {
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	

}
