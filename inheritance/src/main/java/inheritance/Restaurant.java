package inheritance;

import java.util.LinkedList;

public class Restaurant {

    private String restaurantName;
    private int priceCategory;
    private double starRanking;
    private LinkedList<Review> reviewList;

    public Restaurant(String restaurantName, int priceCategory) {

        this.restaurantName = restaurantName;
        this.priceCategory = priceCategory;
        this.starRanking = 0.0;
        this.reviewList = new LinkedList<>();
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public int getPriceCategory() {
        return this.priceCategory;
    }

    public double getStarRanking() {
        return this.starRanking;
    }

    public int getReviewCount() {
        return this.reviewList.size();
    }

    public Review getReview(int reviewAtNode) {

        if (reviewAtNode > this.reviewList.size() || reviewAtNode < 0) {
            throw new IllegalArgumentException(String.format("Index specified at %d is out of review list size limits.", reviewAtNode));
        }

        return this.reviewList.get(reviewAtNode);
    }

    public void addReview(Review review) {

        // add a review
        this.reviewList.add(review);
        // update starRanking
        this.updateStarRanking();
    }

    public void updateStarRanking() {

        double reviewAccumulator = 0.0;

        for (Review review : reviewList) {
            reviewAccumulator += review.getNumOfStars();
        }

        starRanking = reviewAccumulator / reviewList.size();
    }

    public String toString() {

        StringBuilder restaurantStr = new StringBuilder();

        restaurantStr.append("Name: ");
        restaurantStr.append(this.restaurantName);

        restaurantStr.append(" :: Price Category: ");
        for (int i = 0; i < this.priceCategory; i++) {
            restaurantStr.append("$");
        }

        restaurantStr.append(" :: Star Ranking: ");
        restaurantStr.append(String.format("%.01f", this.starRanking));

        return restaurantStr.toString();
    }
}
