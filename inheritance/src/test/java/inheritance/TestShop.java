package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestShop {

    Shop tacoBell;

    @Before public void initialize() {

        tacoBell = new Shop("Taco Bell");

        Review tBellReview1 = new Review("This place was terribly...GOOD!", "John Doe", 5);
        Review tBellReview2 = new Review("Found a roach in my food.", "Jessica Tomato", 1);
        Review tBellReview3 = new Review("I like to drink nacho cheese.", "Bobby Smith", 4);
        Review tBellReview4 = new Review("Taco's are decent.", "Mike Michaelson", 2);
        Review tBellReview5 = new Review("Taco's are garbage.", "Tammy Michaelson", 2);
        Review tBellReview6 = new Review("Choked on my five layer burrito.", "Mr. Joe Bob", 3);

        tacoBell.addReview(tBellReview1);
        tacoBell.addReview(tBellReview2);
        tacoBell.addReview(tBellReview3);
        tacoBell.addReview(tBellReview4);
        tacoBell.addReview(tBellReview5);
        tacoBell.addReview(tBellReview6);
    }

    @Test public void shop_testGetShopName() {

        String expected = "Taco Bell";
        String actual = tacoBell.getShopName();

        assertEquals(expected, actual);
    }

    @Test public void shop_testGetStarRanking() {

        double expected = 2.833;
        double actual = tacoBell.getStarRanking();

        assertEquals(expected, actual, .001);
    }

    @Test public void shop_testUpdateStarRanking() {

        Review tBellReview7 = new Review("I eat here everyday!", "Mr. T.", 5);
        tacoBell.addReview(tBellReview7);

        double expected = 3.142;
        double actual = tacoBell.getStarRanking();

        assertEquals(expected, actual, .001);
    }

    @Test public void shop_testAddReview() {

        Review reviewAtThree = tacoBell.getReview(2);
        String expectedMessage1 = "I like to drink nacho cheese.";
        String actualMessage1 = reviewAtThree.getReviewMessage();

        assertEquals(expectedMessage1, actualMessage1);

        Review reviewAtZero = tacoBell.getReview(0);
        String expectedMessage2 = "This place was terribly...GOOD!";
        String actualMessage2 = reviewAtZero.getReviewMessage();

        assertEquals(expectedMessage2, actualMessage2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shop_testGetReview_IllegalArg_InputValExceedsListSize() {

        tacoBell.getReview(tacoBell.getReviewCount() + 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shop_testGetReview_IllegalArg_InputValOneLessThanListSize() {

        tacoBell.getReview(-1);
    }

    @Test public void shop_testToString() {

        String expected = "Name: Taco Bell :: Star Ranking: 2.8";
        String actual = tacoBell.toString();
        assertEquals(expected, actual);
    }
}
