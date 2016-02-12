package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {
	HashSet<Movie> movieCollection = new HashSet<>();
	int count;
	
	 public MovieService() {
		 Collections.synchronizedSet(movieCollection);
	}
	
	@Override
	public List<Movie> findAll() {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov:movieCollection){
			movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public List<Movie> findByName(String name) {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov:movieCollection){
			if(mov.title.equalsIgnoreCase(name))
				movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public Movie create(Movie movie) {
		movie.id=++count;
		movieCollection.add(movie);
		return movie;
	}

	@Override
	public Movie update(Movie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean rentMovie(int movieId, String user) {
		// TODO Auto-generated method stub
		return false;
	}

}
