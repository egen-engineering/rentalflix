package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Service implementing IFlix interface You can use any Java collection type to
 * store movies
 */
public class MovieService implements IFlix {
	HashSet<Movie> moveStore;
	int movieID = 0;

	public MovieService() {
		Collections.synchronizedSet(moveStore);
	}

	@Override
	public List<Movie> findAll() {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov : moveStore) {
			movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public List<Movie> findByName(String name) {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov : moveStore) {
			if (mov.title.equalsIgnoreCase(name))
				movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public Movie create(Movie movie) {
		movie.id = ++movieID;
		moveStore.add(movie);
		return movie;

	}

	@Override
	public Movie update(Movie movie){
		for (Movie mov : moveStore) {
			if (mov.id == movie.id) {
				mov = movie;
				return mov;
			}
		}
		throw new IllegalArgumentException("Invalid Movie ID");
	}

	@Override
	public Movie delete(int id){
		Movie temp = null;
		for (Movie mov : moveStore) {
			if (mov.id == id) {
				temp = mov;
				break;
			}
		}
		if (temp != null) {
			moveStore.remove(temp);
			return temp;
		} else {
			throw new IllegalArgumentException("Invalid Movie ID");
		}

	}

	@Override
	public boolean rentMovie(int movieId, String user){
		for (Movie mov : moveStore) {
			if (mov.id == movieId) {
				if (mov.rentedBy == null) {
					mov.rentedBy = user;
					return true;
				} else {
					throw new IllegalArgumentException("Already Rented");
				}
			}
		}
		throw new IllegalArgumentException("Invalid Movie ID");
	}
}
