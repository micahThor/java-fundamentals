package inheritance;

public class Restaurant extends Shop {

    private int priceCategory;

    public Restaurant(String shopName, int priceCategory) {

        super(shopName);
        this.priceCategory = priceCategory;
    }

    public int getPriceCategory() {
        return this.priceCategory;
    }

    public String toString() {

        StringBuilder shopStr = new StringBuilder(super.toString());

        shopStr.append(" :: Price Category: ");

        for (int i = 0; i < this.getPriceCategory(); i++) {
            shopStr.append("$");
        }

        return shopStr.toString();

    }

}
