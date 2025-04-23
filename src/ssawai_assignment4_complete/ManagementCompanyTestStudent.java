package ssawai_assignment4_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class tests the basic functionality of the ManagementCompany class
 * Due: 04/22/25
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
*/
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyTestStudent {
    private ManagementCompany mgmt;

    @Before
    public void setUp() {
        mgmt = new ManagementCompany("BestMgmt", "123456789", 10.0);
        mgmt.addProperty("Property", "Silver Spring", 3000.0, "Alice", 1, 1, 2, 2);
        mgmt.addProperty("Place", "Rockville", 3500.0, "Bob", 3, 3, 2, 2);
    }

    @Test
    public void testAddProperty() {
        int index = mgmt.addProperty("Hotel", "Bethesda", 2800.0, "Charlie", 5, 5, 2, 2);
        assertEquals(2, index);
    }

    
    @Test
    public void testAddNullProperty() {
        int result = mgmt.addProperty(null);
        assertEquals(-2, result);
    }

    @Test
    public void testAddPropertyNotEncompassed() {
        Property outOfBounds = new Property("Inn", "New York City", 1000.0, "Billy", 15, 15, 2, 2);
        int result = mgmt.addProperty(outOfBounds);
        assertEquals(-3, result);
    }

    @Test
    public void testAddPropertyOverlaps() {
        Property overlap = new Property("OverlapPlace", "OverlapCity", 2600.0, "John", 1, 1, 3, 3);
        int result = mgmt.addProperty(overlap);
        assertEquals(-4, result);
    }

    @Test
    public void testGetTotalRent() {
        double total = mgmt.getTotalRent();
        assertEquals(6500.0, total, 0.001);
    }

    @Test
    public void testGetHighestRentProperty() {
        Property highest = mgmt.getHighestRentProperty();
        assertEquals("Place", highest.getPropertyName());
    }

    @Test
    public void testGetPropertiesCount() {
        assertEquals(2, mgmt.getPropertiesCount());
    }

    @Test
    public void testIsManagementFeeValid() {
        assertTrue(mgmt.isManagementFeeValid());
    }

    @Test
    public void testToString() {
        String output = mgmt.toString();
        assertTrue(output.contains("List of the properties for BestMgmt"));
        assertTrue(output.contains("Property"));
        assertTrue(output.contains("Place"));
    }
}
