package io.egen.rentalflix;

import java.util.List;

public interface IFlix {
	
	/**
	 * Finds all available movies in the movie store
	 * @return list of movies or empty list
	 */
	public List<Movie> findAll ();
	
	/**
	 * Finds all movies in the movie store which contains <strong>name</strong> in the title
	 * @param name String
	 * @return list of movies or empty list
	 */
	public List<Movie> findByName (String name);
	
	/**
	 * Create a new movie in the movie store
	 * @param movie
	 * @return Movie
	 */
	public Movie create (Movie movie);
	
	/**
	 * Update an existing movie
	 * @param movie
	 * @return updated movie or throws <strong>IllegalArgumentException</strong> if movie with this id is not found
	 */
	public Movie update (Movie movie);
	
	/**
	 * Delete an existing movie 
	 * @param id
	 * @return deleted movie or throws <strong>IllegalArgumentException</strong> if movie with this id is not found
	 */
	public Movie delete (int id);
	
	/**
	 * Rent the movie with movieId to the <strong>user</strong>.
	 * Make sure this movie is not rented already. 
	 * If it is already rented, throw <strong>IllegalArgumentException</strong>
	 * @param movieId
	 * @param user
	 * @return true: if movie can be rented, false otherwise
	 */
	public boolean rentMovie (int movieId, String user);
}
