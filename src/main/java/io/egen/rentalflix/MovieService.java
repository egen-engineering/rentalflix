package io.egen.rentalflix;


import java.util.ArrayList;
import java.util.List;


/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {

    private List<Movie> list = new ArrayList<>();
    @Override
    public List<Movie> findAll() {
        return list;
    }

    @Override
    public List<Movie> findByName(String name) {

      //  if(list.contains())
        return list;
    }

    @Override
    public Movie create(Movie movie) {
        list.add(movie);
        return list.get(0);


    }

    @Override
    public Movie update(Movie movie){
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
