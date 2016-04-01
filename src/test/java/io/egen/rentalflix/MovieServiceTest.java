package io.egen.rentalflix;

import java.util.List;

/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {


    @org.junit.Test
    public void testName() throws Exception {
        MovieService movieService = new MovieService();
        Movie movie = new Movie();
        movie.setId(1);
        movie.setTitle("Mission Impossible");
        movie.setYear("2000");
        movie.setReleased("June 15 2014");
        movieService.create(movie);

        Movie movie2 = new Movie();
        movie2.setId(2);
        movie2.setTitle("Mission Impossible 2");
        movie2.setYear("2003");
        movie2.setReleased("June 15 2015");
        movieService.create(movie2);

        System.out.println("Movie created");
//        String name = "Mission Impossible";
//        movieService.findByName(name);
        List<Movie> result = movieService.findAll();
        result.stream().forEach(System.out::println);


    }
}
