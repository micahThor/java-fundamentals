package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestReview {

    Review tBellReview1;
    Review tBellReview2;
    Review tBellReview3;
    Review tBellReview4;
    Review tBellReview5;
    Review tBellReview6;

    Review movieRev1;
    Review movieRev2;
    Review movieRev3;
    Review movieRev4;

    @Before public void initialize() {

        tBellReview1 = new Review("This place was terribly...GOOD!", "John Doe", 5);
        tBellReview2 = new Review("Found a roach in my food.", "Jessica Tomato", 1);
        tBellReview3 = new Review("I like to drink nacho cheese.", "Bobby Smith", 4);
        tBellReview4 = new Review("Taco's are decent.", "Mike Michaelson", 2);
        tBellReview5 = new Review("Taco's are garbage.", "Tammy Michaelson", 2);
        tBellReview6 = new Review("Choked on my five layer burrito.", "Mr. Joe Bob", 3);

        movieRev1 = new Review("They only play Disney remakes.  WHICH I LOVE!", "John Doe", 5, "Jungle Book");
        movieRev2 = new Review("I like their concessions.", "Bobby Smith", 4, "Tarzan");
        movieRev3 = new Review("Theatre smells weird.", "Mike Michaelson", 2, "Land Before Time");
        movieRev4 = new Review("Movie selection needs to expand.", "Mr. Joe Bob", 3, "Lion King");
    }

    @Test public void review_testReviewConstructor() {

        String expected_revMsg = "Taco's are decent.";
        String expected_auth = "Mike Michaelson";
        int expected_numStars = 2;

        String actual_revMsg = tBellReview4.getReviewMessage();
        String actual_auth = tBellReview4.getAuthor();
        int actual_numStars = tBellReview4.getNumOfStars();

        assertEquals(expected_revMsg, actual_revMsg);
        assertEquals(expected_auth, actual_auth);
        assertEquals(expected_numStars, actual_numStars);
    }

    @Test public void review_testGetReviewMessage() {

        String actual = "Found a roach in my food.";
        String expected = tBellReview2.getReviewMessage();

        assertEquals(actual, expected);
    }

    @Test public void review_testGetAuthor() {

        String expected = "Tammy Michaelson";
        String actual = tBellReview5.getAuthor();

        assertEquals(expected, actual);
    }

    @Test public void review_testGetNumOfStars() {

        int expected = 2;
        int actual = tBellReview4.getNumOfStars();

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void review_testNumOfStarsIllegalInputVal_ExceedsAcceptableRange() {

        tBellReview6 = new Review("Choked on my five layer burrito.", "Mr. Joe Bob", 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void review_testNumOfStarsIllegalInputVal_BeneathAcceptableRange() {

        tBellReview6 = new Review("Choked on my five layer burrito.", "Mr. Joe Bob", -1);
    }

    @Test public void review_testGetMovieTitle() {

        String expected = "Tarzan";
        String actual = movieRev2.getMovieTitle();

        assertEquals(expected, actual);
    }

    @Test public void review_testToString() {

        String expected = "Author: John Doe :: Review: This place was terribly...GOOD! :: Number of Stars: 5";
        String actual = tBellReview1.toString();
        assertEquals(expected, actual);
    }

    @Test public void review_testToString_WithMovieTitle() {

        String expected = "Author: John Doe :: Review: They only play Disney remakes.  WHICH I LOVE! :: Number of Stars: 5 :: Movie Reviewed: Jungle Book";
        String actual = movieRev1.toString();
        assertEquals(expected, actual);
    }
}
