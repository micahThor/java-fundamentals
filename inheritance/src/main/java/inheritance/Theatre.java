package inheritance;

import java.util.ArrayList;

public class Theatre extends Shop {

    private ArrayList<String> movies;

    public Theatre(String shopName) {
        super(shopName);
        this.movies = new ArrayList<>();
    }

    public void addMovie(String title) {
        this.movies.add(title);
    }

    public boolean removeMovie(String title) {

        if (this.movies.contains(title)) {
            this.movies.remove(title);
            return true;
        }

        return false;
    }

    public String toString() {

        StringBuilder shopStr = new StringBuilder(super.toString());

        shopStr.append(" :: Current Movies: ");

        for (int i = 0; i < this.movies.size(); i++) {
            shopStr.append(this.movies.get(i));

            if (i + 1 < this.movies.size()) {
                shopStr.append(", ");
            }
        }

        return shopStr.toString();
    }


}
