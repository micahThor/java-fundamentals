package inheritance;

public class Review {

    private String reviewMessage;
    private String author;
    private int numOfStars;
    private String movieTitle;

    public Review(String reviewMessage, String author, int numOfStars) {

        this.reviewMessage = reviewMessage;
        this.author = author;
        this.numOfStars = setNumStars(numOfStars);
    }

    public Review(String reviewMessage, String author, int numOfStars, String movieTitle) {

        this(reviewMessage, author, numOfStars);
        this.movieTitle = movieTitle;
    }

    public String getReviewMessage() {
        return this.reviewMessage;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumOfStars() {
        return this.numOfStars;
    }

    public String getMovieTitle() {
        return this.movieTitle;
    }

    public int setNumStars(int numOfStars) {

        if (numOfStars < 0 || numOfStars > 5) {
            throw new IllegalArgumentException(String.format("Stars must be between 0 and 5.  Stars passed: %d", numOfStars));
        }

        return numOfStars;
    }

    public String toString() {

        StringBuilder reviewStr = new StringBuilder();

        reviewStr.append("Author: ");
        reviewStr.append(this.author);

        reviewStr.append(" :: Review: ");
        reviewStr.append(this.reviewMessage);

        reviewStr.append(" :: Number of Stars: ");
        reviewStr.append(this.numOfStars);

        if (this.movieTitle != null) {
            reviewStr.append(" :: Movie Reviewed: ");
            reviewStr.append(this.movieTitle);
        }

        return reviewStr.toString();
    }
}
