package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    Restaurant restaurant;
    @Test
    public void constructorTest() {
            Restaurant restaurantObject = new Restaurant("Aya", 3, "$");
            assertEquals("Aya", restaurantObject.name);
            assertEquals(3, restaurantObject.starsRating);
            assertEquals("$", restaurantObject.price_category);
        }
    @Test
    public void restaurantToStringTest() {
        Restaurant restaurant = new Restaurant("Elul", 5, "JD");
        restaurant.addReview("Aya", 4 );


        String expected = "Restaurant Name: Elul Votes: 5 Currency: JD[ Review Name: Aya Rating: 4]" ;
        System.out.println(restaurant.toString());
        assertEquals(expected, restaurant.toString());
    }

    @Test
    public void RestuarantaddReviewTest() {
        Restaurant restaurantObject = new Restaurant("Irbid", 3, "$");
        restaurantObject.addReview("Reem", 3);
        restaurantObject.addReview("Ahmad", 3);

        int numOfReviews = restaurantObject.reviews.size();
        assertEquals(2, numOfReviews);
    }



    @Test public void RestuarantaverageRatingTest() {
        Restaurant restuarantObject = new Restaurant("Irbid", 3, "$");
        restuarantObject.addReview( "Aya", 4);
        restuarantObject.addReview( "Aya", 4);
        restuarantObject.averageReview();
        assertEquals(4, restuarantObject.starsRating);
    }

}
