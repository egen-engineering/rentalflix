package io.egen.rentalflix;


import java.util.ArrayList;
import java.util.List;


/**
 * Service implementing IFlix interface
 * You can use any Java collection type to store movies
 */
public class MovieService implements IFlix {

    private List<Movie> movieList = new ArrayList<>();
    @Override
    public List<Movie> findAll() {
        return movieList;
    }

    @Override
    public List<Movie> findByName(String name) {

      //  if(list.contains())
        List<Movie> mList = new ArrayList<>();
        if(movieList.size()==0){
            return null;
        }
        for(Movie movie: movieList){
            if(movie.getTitle().contains(name)){
                mList.add(movie);
            }
        }

        return mList;
    }

    @Override
    public Movie create(Movie movie) {
        movieList.add(movie);
        return movie;


    }

    @Override
    public Movie update(Movie movie){

        if(movieList.contains(movie)){
            movie.setId(movie.getId());
            movieList.add(movie);
        }
        else{
            throw new IllegalArgumentException("Update Error");
        }
        return movie;
    }

    @Override
    public Movie delete(int id) {
        Movie movie = movieList.get(id);
        if(movie == null){
            throw new IllegalArgumentException("Delete Error");
        }
        movieList.remove(movie);
        return movie;
    }

    @Override
    public boolean rentMovie(int movieId, String user) {

        Movie movie = movieList.get(movieId);
        if(movie.isRent()){
            throw new IllegalArgumentException("Rent Movie Error");
        }
        movie.setRent(true);
        return true;
    }

}
