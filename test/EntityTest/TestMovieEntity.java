package EntityTest;

import org.javaee7.movieplex7.entities.Movie;
import org.junit.*;


import static org.junit.Assert.*;

import org.hamcrest.*;

public class TestMovieEntity {

	Movie movie1;
	Movie movie2;
	Movie movie3;
	
	
	@Before
	public void setUp() throws Exception{
		movie1 = new Movie();
		movie2 = new Movie(10);
		movie3 = new Movie(15, "Matrix", "Keanu Reeves");
	}
	
	
	@After
	public void tearDown() throws Exception{
	}
	
	
	@Test
	public void testFirstConstructor(){
		assertTrue(movie1.getId() == null);
		assertTrue(movie1.getName() == null);
		assertTrue(movie1.getActors() == null);
		
	}
	
	@Test
	public void testSecondConstructor(){
		assertTrue(movie2.getId() == 10);
		assertTrue(movie2.getName() == null);
		assertTrue(movie2.getActors() == null);
		
	}
	
	@Test
	public void testThirdConstructor(){
		assertTrue(movie3.getId() == 15);
		assertTrue(movie3.getName() == "Matrix");
		assertTrue(movie3.getActors() == "Keanu Reeves");	
	}
	
	@Test
	public void testEquals(){
		assertTrue(movie3.equals(movie3));
		
		//Only Id is checked
		Movie movie4 = new Movie(15, "Home Alone", "bla)");
		assertTrue(movie3.equals(movie4));
		
		assertFalse(movie2.equals(movie3));
		assertTrue(movie2.equals(movie2));
		
		assertTrue(movie1.equals(movie1));
		assertFalse(movie1.equals(movie3));
		
		//Check instanceOf
		assertFalse(movie1.equals(new String()));
	}
	
	
}
