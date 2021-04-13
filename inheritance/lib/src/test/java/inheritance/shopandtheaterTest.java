package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class shopandtheaterTest {

    @Test
    public void testShopToString() {

        Shop shop = new Shop("Max", "It is a clothing shop.", "$$");
        System.out.println(shop.toString());
        assertEquals("Shop Name: Max Description: It is a clothing shop. Currency: $$",shop.toString());
    }

    @Test public void testTheater() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Titanic");
        list.add("The Lion King");
        Theater theater = new Theater("Prime Cinema",list);
        assertEquals("[Titanic, The Lion King]",theater.toString());

        theater.addMovie("Home alone");
        assertEquals("[Titanic, The Lion King, Home alone]",theater.toString());

        theater.removeMovie("Titanic");
        assertEquals("[The Lion King, Home alone]",theater.toString());





    }

    @Test public void testTheaterReview(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Titanic");
        list.add("The Lion King");
        Theater theater = new Theater("Prime Cinema",list);
        assertEquals("The movie has been added!", theater.addReview("Aya",5 ,"Home alone"));

        assertEquals("The Titanic movie has rate Review: Name: Aya\n" +
                "Rate: 4\n" +
                "Movie Name: Titanic.", theater.addReview("Aya",4,"Titanic"));
        assertEquals("The The Lion King movie has rate Review: Name: Aya\n" +
                "Rate: 4\n" +
                "Movie Name: The Lion King.", theater.addReview("Aya",4,"The Lion King"));

    }
}
