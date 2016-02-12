package io.egen.rentalflix;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import io.egen.rentalflix.MovieService;

;
/**
 * JUnit test cases for MovieService
 */
public class MovieServiceTest {

	MovieService movieService = new MovieService();

	@Test
	public void testCreate() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		ArrayList<Movie> list = movieService.findAll();
		assertEquals("book tittle1", list.get(0).getTitle());
		assertEquals("book tittle2", list.get(1).getTitle());
		assertEquals("book tittle3", list.get(2).getTitle());

		ArrayList<Movie> list2 = movieService.findByName("book tittle1");
		assertEquals("book tittle1", list2.get(0).getTitle());

		Movie movie = new Movie("1", "book tittle change", "1988", "English");
		movieService.update(movie);
		assertEquals("book tittle change", list2.get(0).getTitle());

		assertEquals("1", list.get(0).getId());
		movieService.delete(0);

		boolean boolVal = movieService.rentMovie(Integer.parseInt(list.get(1)
				.getId()), list.get(1).getUserName());
		String stringBoolVal = null;
		if (boolVal == true) {
			stringBoolVal = "true";
		} else {
			stringBoolVal = "false";
		}

		assertEquals("true", stringBoolVal);

	}

	@Test
	public void testFindAll() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		ArrayList<Movie> list = movieService.findAll();
		assertEquals("book tittle1", list.get(0).getTitle());
		assertEquals("book tittle2", list.get(1).getTitle());
		assertEquals("book tittle3", list.get(2).getTitle());

	}

	@Test
	public void testfindByName() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		ArrayList<Movie> list2 = movieService.findByName("book tittle1");
		String stringBool = null;
		
		if(list2.isEmpty())
		{
			stringBool = "null";
		}
		else
		{
			stringBool = "not_null";
		}
		assertEquals("not_null", stringBool);

	}

	@Test
	public void testfindByName2() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		ArrayList<Movie> list2 = movieService.findByName("book tittle12");
		String stringBool = null;
		
		if(list2.isEmpty())
		{
			stringBool = "null";
		}
		else
		{
			stringBool = "not_null";
		}
		assertEquals("null", stringBool);

	}
	
	@Test
	public void testUpdate() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		Movie movie = new Movie("1", "book tittle change", "1988", "English");
		Movie movieChange = movieService.update(movie);
		assertEquals("book tittle change", movieChange.getTitle());

	}

	@Test
	public void testDelete() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);
		Movie movie = movieService.delete(1);
		String dataPresent = null;
		if (movie == null) {
			dataPresent = "null";
		} else {
			dataPresent = "not_null";
		}
		assertEquals("not_null", dataPresent);
	}

	@Test
	public void testDelete2() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);

		// assertEquals("1", list.get(0).getId());
		Movie movie = movieService.delete(11);
		String dataPresent = null;
		if (movie == null) {
			dataPresent = "null";
		} else {
			dataPresent = "not_null";
		}
		assertEquals("null", dataPresent);
	}

	@Test
	public void testRentMovie() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);
		ArrayList<Movie> list = movieService.findAll();

		boolean boolVal = movieService.rentMovie(Integer.parseInt(list.get(1)
				.getId()), list.get(1).getUserName());
		String stringBoolVal = null;
		if (boolVal == true) {
			stringBoolVal = "true";
		} else {
			stringBoolVal = "false";
		}

		assertEquals("true", stringBoolVal);
	}

	@Test
	public void testRentMovie2() {
		Movie movie1 = new Movie("1", "book tittle1", "1988", "English");
		Movie movie2 = new Movie("2", "book tittle2", "1988", "English");
		Movie movie3 = new Movie("3", "book tittle3", "1988", "English");
		movieService.create(movie1);
		movieService.create(movie2);
		movieService.create(movie3);
		ArrayList<Movie> list = movieService.findAll();

		boolean boolVal = movieService.rentMovie(11, list.get(1).getUserName());
		String stringBoolVal = null;
		if (boolVal == true) {
			stringBoolVal = "true";
		} else {
			stringBoolVal = "false";
		}

		assertEquals("false", stringBoolVal);
	}
}
