package io.egen.rentalflix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {

    private List<Movie> movObj = Collections.synchronizedList(new ArrayList<Movie>());

    @java.lang.Override
    public List<String> findAll() {
        List<String> stringMovieList = new ArrayList<String>();
        for (Movie obj : movObj) {
            stringMovieList.add(obj.getTitle());
        }
        return stringMovieList;
    }

    @java.lang.Override
    public List<String> findByName(String name) {

        List<String> stringMovieList = new ArrayList<String>();
        for (Movie obj : movObj) {
            if (name.equals(obj.getTitle())) stringMovieList.add(obj.getTitle());
        }
        return stringMovieList;
    }

    @java.lang.Override
    public Movie create(Movie movie) {
        movObj.add(movie);
        return null;
    }

    @java.lang.Override
    public Movie update(Movie movie) {
        boolean flag = true;
        for (int i = 0; i < movObj.size(); i++) {
            if (movie.getId() == movObj.get(i).getId()) {
                flag = false;
                movObj.set(i, movie);
            }
        }
        if (flag) throw new IllegalArgumentException("movie with this id is not found!");
        else return movie;
    }

    @java.lang.Override
    public Movie delete(int id) {
        Movie deletedMovie;
        for (int i = 0; i < movObj.size(); i++) {
            if (movObj.get(i).getId() == id) {
                deletedMovie = movObj.get(i);
                movObj.remove(i);
                return  deletedMovie;
            }
        }
        throw new IllegalArgumentException("movie with this id is not found!");
    }

    @java.lang.Override
    public boolean rentMovie(int movieId, String user) {

        for (int i = 0; i < movObj.size(); i++) {
            if (movObj.get(i).getId() == movieId) {
                if(movObj.get(i).isRented())
                {
                    throw new IllegalArgumentException("movie with this id is already rented out!");
                }
                else{
                    movObj.get(i).setRented(true);
                    movObj.get(i).setRentedUser(user);
                    return true;
                }
            }
        }
        return false;
    }
}
