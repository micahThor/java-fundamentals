package inheritance;

import java.util.LinkedList;

public class Shop {

    private String shopName;
    private double starRanking;
    private LinkedList<Review> reviewList;

    public Shop(String shopName) {

        this.shopName = shopName;
        this.starRanking = 0.0;
        this.reviewList = new LinkedList<>();
    }

    public String getShopName() {
        return this.shopName;
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

        return "Name: " +
                this.getShopName() +
                " :: Star Ranking: " +
                String.format("%.01f", this.getStarRanking());

    }

}
