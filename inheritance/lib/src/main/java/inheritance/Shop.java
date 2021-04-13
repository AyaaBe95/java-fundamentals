package inheritance;

import java.util.ArrayList;

public class Shop {
        String name;
        String description;
        String priceCategory;
        ArrayList<Review> reviews;


        public Shop(String name, String description, String priceCategory) {
            this.name = name;
            this.description = description;
            this.priceCategory = priceCategory;
            this.reviews = new ArrayList<>();
        }

        public String toString() {
            String msg= "Shop Name: " + name + " Description: "+ description + " Currency: " + priceCategory ;

            System.out.print(msg);
            return msg;
        }

    public void addReview(String newReview , int NewStars){
        Review review = new Review( newReview, NewStars);
        this.reviews.add(review);
    }


}
