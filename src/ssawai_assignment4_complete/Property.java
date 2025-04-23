package ssawai_assignment4_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class represents a property that will be managed. It includes details such as the 
 * property name, city, rent amount, owner, and the plot where the property is located. It includes a 
 * copy constructor and a toString() method for displaying property details.
 * Due: 04/22/25
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
*/
public class Property {
    private String propertyName;
    private String city;
    private String owner;
    private double rentAmount;
    private Plot plot;

    // Default constructor
    public Property() {
        this.propertyName = "";
        this.city = "";
        this.owner = "";
        this.rentAmount = 0.0;
        this.plot = new Plot();
    }

    // Constructor without plot info
    public Property(String propertyName, String city, double rentAmount, String owner) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot();
    }

    // Constructor with plot info
    public Property(String propertyName, String city, double rentAmount, String owner,
                    int x, int y, int width, int depth) {
        this.propertyName = propertyName;
        this.city = city;
        this.rentAmount = rentAmount;
        this.owner = owner;
        this.plot = new Plot(x, y, width, depth);
    }

    // Copy constructor
    public Property(Property otherProperty) {
        this.propertyName = otherProperty.propertyName;
        this.city = otherProperty.city;
        this.owner = otherProperty.owner;
        this.rentAmount = otherProperty.rentAmount;
        this.plot = new Plot(otherProperty.plot);
    }

    // Getters and Setters
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public Plot getPlot() {
        return new Plot(plot); // defensive copy
    }

    public void setPlot(int x, int y, int width, int depth) {
        this.plot = new Plot(x, y, width, depth);
    }

    // String representation
    public String toString() {
        return propertyName + "," + city + "," + owner + "," + rentAmount;
    }
}
