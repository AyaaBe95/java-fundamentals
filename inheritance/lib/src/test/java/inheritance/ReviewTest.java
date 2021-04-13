package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ReviewTest {
    Review review;

    @Test
    public void testReview_constructor() {
        Review reviewObject = new Review("Test", 3);
        assertEquals("Review{author='Test', rating='3'}",reviewObject.toString());
    }

    @Test
    public void reveiewToStringTest() {
        Review reviewObject = new Review("Test", 3);
        assertEquals("Review{author='Test', rating='3'}",reviewObject.toString());

    }

}
