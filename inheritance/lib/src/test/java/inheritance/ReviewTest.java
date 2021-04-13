package inheritance;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ReviewTest {

    @Test
    public void testReview_constructor() {
        Review reviewObject = new Review("AAA", 5);
        assertEquals(" Review Name: AAA Rating: 5 ",reviewObject.toString());
    }

    @Test
    public void reveiewToStringTest() {
        Review reviewObject = new Review("AAA", 5);
        assertEquals(" Review Name: AAA Rating: 5 ",reviewObject.toString());

    }

}
