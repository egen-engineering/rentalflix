package io.egen.rentalflix;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {


    @Test
    public void testFindAll() throws Exception{

        Movie m1= new Movie(1,"Mission Impossible","2000","English");
        Movie m2= new Movie(2,"Mission Impossible 2","2002","spanish");
        Movie m3= new Movie(3,"Mission Impossible 3","2008","French");
        Movie m4= new Movie(4,"Mission Impossible 4","2011","English");
        Movie m5= new Movie(5,"Mission Impossible 5","2015","spanish");

        MovieService movieService = new MovieService();
        movieService.create(m1);
        movieService.create(m2);
        movieService.create(m3);
        movieService.create(m4);
        movieService.create(m5);

        Assert.assertEquals(5,movieService.findAll().size());

    }

    @Test
    public void testFindByName() throws Exception {
        Movie m1= new Movie(1,"Mission Impossible","2000","English");
        Movie m2= new Movie(2,"Mission Impossible 2","2002","spanish");
        Movie m3= new Movie(3,"Mission Impossible 3","2008","French");
        Movie m4= new Movie(4,"Mission Impossible 4","2011","English");
        Movie m5= new Movie(5,"Mission Impossible 5","2015","spanish");

        MovieService movieService = new MovieService();
        movieService.create(m1);
        movieService.create(m2);
        movieService.create(m3);
        movieService.create(m4);
        movieService.create(m5);

        Assert.assertEquals(true, movieService.findByName("Mission").contains(m1));
    }

    @Test
    public void testCreate() throws Exception {
        Movie m1= new Movie(1,"Mission Impossible","2000","English");


        MovieService movieService = new MovieService();

        Assert.assertEquals("Mission Impossible",movieService.create(m1).getTitle());
    }

    @Test
    public void testUpdate() throws Exception {
        Movie m2= new Movie(2,"Mission Impossible 2","2002","spanish");
        MovieService movieService=new MovieService();
        movieService.create(m2);
        m2.setTitle("SuperHero");
        Assert.assertEquals("SuperHero", movieService.update(m2).getTitle());
    }

    @Test
    public void testDelete() throws Exception {
        Movie m1= new Movie(1,"Mission Impossible","2000","English");
        Movie m2= new Movie(2,"Mission Impossible 2","2002","spanish");

        MovieService movieService = new MovieService();
        movieService.create(m1);
        movieService.create(m2);

        movieService.delete(1);
        Assert.assertEquals(1, movieService.findAll().size());
    }

    @Test
    public void testRent() throws Exception {
        Movie m1= new Movie(1,"Mission Impossible","2000","English");
        Movie m2= new Movie(2,"Mission Impossible 2","2002","spanish");
        m1.setRent(true);
        MovieService movieService = new MovieService();
        movieService.create(m1);
        movieService.create(m2);
        Assert.assertEquals(true, movieService.rentMovie(1,"Ashiq"));
    }
}
