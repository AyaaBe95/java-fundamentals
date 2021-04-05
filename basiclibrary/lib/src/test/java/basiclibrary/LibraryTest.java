/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testrollMethod(){
        int array[] = Library.roll(4);
        assertEquals(4,array.length);

    }

    @Test public void testcontainsDuplicatesFalseMethod(){
        int[] array = {1, 5, 2, 3};
        assertFalse(false);

    }

    @Test public void testcontainsDuplicatesTrueMethod(){
        int[] array = {1, 2, 2, 3};
        assertTrue(true);

    }

    @Test public void testcalculateAverage(){
        int[] array = {1, 1, 1, 1};
        float average;
        average = Library.calculateAverage(array);
        assertEquals(1.0,average,1.0);
    }

    @Test public void testcalculateAverageOfTwoArrays() {
        int[][] array = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        float average = Library.calculateAverageOfTwoArrays(array);
        assertEquals(1.0, average, 1.0);
    }
}
