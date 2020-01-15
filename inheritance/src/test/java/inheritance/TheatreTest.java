package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheatreTest {

    Theatre myTheatre;

    @Before
    public void initialize() {

        myTheatre = new Theatre("Town Center Cinema");

        myTheatre.addMovie("Alladin");
        myTheatre.addMovie("Land Before Time");
        myTheatre.addMovie("Little Mermaid");
        myTheatre.addMovie("Jungle Book");
        myTheatre.addMovie("Lion King");
        myTheatre.addMovie("Tarzan");

        Review movieReview1 = new Review("They only play Disney remakes.  WHICH I LOVE!", "John Doe", 5, "Jungle Book");
        Review movieReview2 = new Review("Found a roach in my popcorn.", "Jessica Tomato", 1);
        Review movieReview3 = new Review("I like their concessions.", "Bobby Smith", 4, "Tarzan");
        Review movieReview4 = new Review("Theatre smells weird.", "Mike Michaelson", 2, "Land Before Time");
        Review movieReview5 = new Review("Movie projector is from the 80's and looks like garbage.", "Tammy Michaelson", 2);
        Review movieReview6 = new Review("Movie selection needs to expand.", "Mr. Joe Bob", 3, "Lion King");

        myTheatre.addReview(movieReview1);
        myTheatre.addReview(movieReview2);
        myTheatre.addReview(movieReview3);
        myTheatre.addReview(movieReview4);
        myTheatre.addReview(movieReview5);
        myTheatre.addReview(movieReview6);

    }

    @Test public void theatre_testGetShopName() {

        String expected = "Town Center Cinema";
        String actual = myTheatre.getShopName();

        assertEquals(expected, actual);
    }

    @Test public void theatre_testGetStarRanking() {

        double expected = 2.833;
        double actual = myTheatre.getStarRanking();

        assertEquals(expected, actual, .001);
    }

    @Test public void theatre_testUpdateStarRanking() {

        Review tBellReview7 = new Review("I eat here everyday!", "Mr. T.", 5);
        myTheatre.addReview(tBellReview7);

        double expected = 3.142;
        double actual = myTheatre.getStarRanking();

        assertEquals(expected, actual, .001);
    }

    @Test public void theatre_testAddReview() {

        Review reviewAtTwo = myTheatre.getReview(2);
        String expectedMovieTitle1 = "Tarzan";
        String actualMovieTitle1 = reviewAtTwo.getMovieTitle();

        assertEquals(expectedMovieTitle1, actualMovieTitle1);

        Review reviewAtFive = myTheatre.getReview(5);
        String expectedMovieTitle2 = "Lion King";
        String actualMovieTitle2 = reviewAtFive.getMovieTitle();

        assertEquals(expectedMovieTitle2, actualMovieTitle2);
    }

    @Test public void theatre_testAddReview_WithMovieTitle() {

        Review reviewAtThree = myTheatre.getReview(2);
        String expectedMessage1 = "I like their concessions.";
        String actualMessage1 = reviewAtThree.getReviewMessage();

        assertEquals(expectedMessage1, actualMessage1);

    }

    @Test(expected = IllegalArgumentException.class)
    public void theatre_testGetReview_IllegalArg_InputValExceedsListSize() {

        myTheatre.getReview(myTheatre.getReviewCount() + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void theatre_testGetReview_IllegalArg_InputValOneLessThanListSize() {

        myTheatre.getReview(-1);
    }

    @Test public void theatre_testAddMovie() {
        myTheatre.addMovie("Not a disney title");

        String expected = "Name: Town Center Cinema :: Star Ranking: 2.8 :: Current Movies: Alladin, Land Before Time, Little Mermaid, Jungle Book, Lion King, Tarzan, Not a disney title";
        String actual = myTheatre.toString();
        assertEquals(expected, actual);
    }

    @Test public void theatre_removeMovie_FailToRemove() {
        assertFalse(myTheatre.removeMovie("All Dogs Go To Heaven"));
    }

    @Test public void theatre_removeMovie_SuccessfullyRemove() {
        assertTrue(myTheatre.removeMovie("Land Before Time"));
    }

    @Test public void theatre_testToString() {

        String expected = "Name: Town Center Cinema :: Star Ranking: 2.8 :: Current Movies: Alladin, Land Before Time, Little Mermaid, Jungle Book, Lion King, Tarzan";
        String actual = myTheatre.toString();
        assertEquals(expected, actual);
    }
}
