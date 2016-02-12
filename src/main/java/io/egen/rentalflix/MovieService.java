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
	HashSet<Movie> movieCollection;
	int count;

	public MovieService() {
		Collections.synchronizedSet(movieCollection);
	}

	@Override
	public List<Movie> findAll() {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov : movieCollection) {
			movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public List<Movie> findByName(String name) {
		List<Movie> movielist = new ArrayList<Movie>();
		for (Movie mov : movieCollection) {
			if (mov.title.equalsIgnoreCase(name))
				movielist.add(mov);
		}
		return movielist;
	}

	@Override
	public Movie create(Movie movie) {
		movie.id = ++count;
		movieCollection.add(movie);
		return movie;

	}

	@Override
	public Movie update(Movie movie) throws IllegalArgumentException {
		for (Movie mov : movieCollection) {
			if (mov.id == movie.id) {
				mov = movie;
				return mov;
			}
		}
		throw new IllegalArgumentException("Invalid Movie ID");
	}

	@Override
	public Movie delete(int id) throws IllegalArgumentException {
		Movie temp = null;
		for (Movie mov : movieCollection) {
			if (mov.id == id) {
				temp = mov;
				break;
			}
		}
		if (temp != null) {
			movieCollection.remove(temp);
			return temp;
		} else {
			throw new IllegalArgumentException("Invalid Movie ID");
		}

	}

	@Override
	public boolean rentMovie(int movieId, String user)
			throws IllegalArgumentException {

		for (Movie mov : movieCollection) {
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
