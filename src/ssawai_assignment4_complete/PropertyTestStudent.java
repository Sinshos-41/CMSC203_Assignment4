package ssawai_assignment4_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class tests the basic functionality of the Property class
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

public class PropertyTestStudent {

    @Test
    public void testDefaultConstructor() {
        Property p = new Property();
        assertEquals("", p.getPropertyName());
        assertEquals("", p.getCity());
        assertEquals("", p.getOwner());
        assertEquals(0.0, p.getRentAmount(), 0.001);
    }

    @Test
    public void testConstructorWithoutPlot() {
        Property p = new Property("MyHouse", "New York City", 2500.0, "Josh");
        assertEquals("MyHouse", p.getPropertyName());
        assertEquals("New York City", p.getCity());
        assertEquals("Josh", p.getOwner());
        assertEquals(2500.0, p.getRentAmount(), 0.001);
    }

    @Test
    public void testConstructorWithPlot() {
        Property p = new Property("MyHouse", "New York City", 2500.0, "Josh", 1, 2, 3, 4);
        assertEquals("MyHouse", p.getPropertyName());
        assertEquals("New York City", p.getCity());
        assertEquals("Josh", p.getOwner());
        assertEquals(2500.0, p.getRentAmount(), 0.001);
        assertEquals("1,2,3,4", p.getPlot().toString());
    }

    @Test
    public void testCopyConstructor() {
        Property original = new Property("OceanView", "Miami", 2500.0, "Josh", 1, 2, 3, 4);
        Property copy = new Property(original);
        assertEquals("OceanView", copy.getPropertyName());
        assertEquals("Miami", copy.getCity());
        assertEquals("Josh", copy.getOwner());
        assertEquals(2500.0, copy.getRentAmount(), 0.001);
        assertEquals("1,2,3,4", copy.getPlot().toString());
    }

    @Test
    public void testToString() {
        Property p = new Property("PropertyHotel", "Rockville", 3200.0, "Victor");
        assertEquals("PropertyHotel,Rockville,Victor,3200.0", p.toString());
    }
}
