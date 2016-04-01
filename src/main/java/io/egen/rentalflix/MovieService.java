package io.egen.rentalflix;

import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {

    @Override
    public List<Movie> findAll() {
        return null;
    }

    @Override
    public List<Movie> findByName(String name) {
        return null;
    }

    @Override
    public Movie create(Movie movie) {
        return null;
    }

    @Override
    public Movie update(Movie movie) {
        return null;
    }

    @Override
    public Movie delete(int id) {
        return null;
    }

    @Override
    public boolean rentMovie(int movieId, String user) {
        return false;
    }
}
