package io.egen.rentalflix;

import java.util.ArrayList;

/**
 * Service implementing IFlix interface You can use any Java collection type to
 * store movies
 */
public class MovieService implements IFlix {

	static int movieId = 0;
	MovieData movieData = new MovieData();

	@Override
	public ArrayList<Movie> findAll() {

		return movieData.getMovieData();
	}

	@Override
	public ArrayList<Movie> findByName(String name) {
		ArrayList<Movie> listByName = new ArrayList<Movie>();
		for (int i = 0; i < movieData.getMovieData().size(); i++) {
			if (movieData.getMovieData().get(i).getTitle().equals(name)) {
				listByName.add(movieData.getMovieData().get(i));
			}
		}
		if(listByName.isEmpty())
		{
			try
			{
				new IllegalArgumentException();
			}
			catch(IllegalArgumentException illegal)
			{
				illegal.printStackTrace();	
			}
		}
		return listByName;
	}

	@Override
	public Movie create(Movie movie) {
		// int addId = movieId++;
		// movie = new Movie(addId+"" , "book tittle" , "1988" , "English" );
		movieData.getMovieData().add(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		// movie = new Movie("1" , "book tittle" ,"1988" , "English" );
		for (int i = 0; i < movieData.getMovieData().size(); i++) {
			if (movieData.getMovieData().get(i).getId().equals(movie.getId())) {
				movieData.getMovieData().get(i)
						.setLanguage(movie.getLanguage());
				movieData.getMovieData().get(i).setTitle(movie.getTitle());
				movieData.getMovieData().get(i).setYear(movie.getYear());
			}
		}

		return movie;
	}

	@Override
	public Movie delete(int id) {

		Movie movie = null;
		String stringId = id + "";
		for (int i = 0; i < movieData.getMovieData().size(); i++) {
			if (movieData.getMovieData().get(i).getId().equals(stringId)) {
				movie = movieData.getMovieData().get(i);
				movieData.getMovieData().remove(i);

			}
		}
		if (movie == null) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException illegal) {
				illegal.printStackTrace();
			}
		}
		return movie;
	}

	@Override
	public boolean rentMovie(int movieId, String user) {

		Movie movie = null;

		for (int i = 0; i < movieData.getMovieData().size(); i++) {
			if (movieData.getMovieData().get(i).getId().equals(movieId + "")) {
				movie = movieData.getMovieData().get(i);
			}
		}

		if (movie != null && movie.getUserName() == null) {
			movie.setUserName(user);
			return true;
		} else {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException illegal) {
				illegal.printStackTrace();
			}
			return false;
		}
	}

}
