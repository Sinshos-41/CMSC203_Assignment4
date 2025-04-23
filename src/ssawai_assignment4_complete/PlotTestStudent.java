package ssawai_assignment4_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class tests the basic functionality of the Plot class
 * Due: 04/22/25
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
*/
import static org.junit.Assert.*;
import org.junit.Test;

public class PlotTestStudent {

    @Test
    public void testDefaultConstructor() {
        Plot p = new Plot();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
        assertEquals(1, p.getWidth());
        assertEquals(1, p.getDepth());
    }

    @Test
    public void testParameterizedConstructor() {
        Plot p = new Plot(2, 3, 4, 5);
        assertEquals(2, p.getX());
        assertEquals(3, p.getY());
        assertEquals(4, p.getWidth());
        assertEquals(5, p.getDepth());
    }

    @Test
    public void testCopyConstructor() {
        Plot original = new Plot(1, 2, 3, 4);
        Plot copy = new Plot(original);
        assertEquals(1, copy.getX());
        assertEquals(2, copy.getY());
        assertEquals(3, copy.getWidth());
        assertEquals(4, copy.getDepth());
    }

    @Test
    public void testOverlapsTrue() {
        Plot p1 = new Plot(0, 0, 5, 5);
        Plot p2 = new Plot(3, 3, 4, 4);
        assertTrue(p1.overlaps(p2));
    }

    @Test
    public void testOverlapsFalse() {
        Plot p1 = new Plot(0, 0, 3, 3);
        Plot p2 = new Plot(4, 4, 2, 2);
        assertFalse(p1.overlaps(p2));
    }

    @Test
    public void testEncompassesTrue() {
        Plot outer = new Plot(0, 0, 10, 10);
        Plot inner = new Plot(2, 2, 3, 3);
        assertTrue(outer.encompasses(inner));
    }

    @Test
    public void testEncompassesFalse() {
        Plot outer = new Plot(0, 0, 5, 5);
        Plot inner = new Plot(3, 3, 5, 5);
        assertFalse(outer.encompasses(inner));
    }

    @Test
    public void testToString() {
        Plot p = new Plot(1, 2, 3, 4);
        assertEquals("1,2,3,4", p.toString());
    }
}

