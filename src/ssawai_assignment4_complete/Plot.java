package ssawai_assignment4_complete;
/*
 * Class: CMSC203 
 * Instructor: Professor Monshi
 * Description: This class represents a rectangular plot of land. It stores the x and y coordinates of the upper-left corner, 
 * along with the width and depth of the plot. It includes methods to check if one plot overlaps another or if one plot fully contains another.
 * Due: 04/22/25
 * Platform/compiler: Eclipse IDE Java
 * I pledge that I have completed the programming 
assignment independently. 
 * I have not copied the code from a student or any source. 
 * I have not given my code to any student.
 * Print your Name here: Sinsho Sawai
*/
public class Plot {
    private int x;
    private int y;
    private int width;
    private int depth;

    // Default constructor
    public Plot() {
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.depth = 1;
    }

    // Parameterized constructor
    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    // Copy constructor
    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // Returns true if the plots overlap
    public boolean overlaps(Plot other) {
        return !(x + width <= other.x || other.x + other.width <= x ||
                 y + depth <= other.y || other.y + other.depth <= y);
    }

    // Returns true if this plot completely encompasses the other plot
    public boolean encompasses(Plot other) {
        return (other.x >= this.x &&
                other.y >= this.y &&
                other.x + other.width <= this.x + this.width &&
                other.y + other.depth <= this.y + this.depth);
    }

    // String representation
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}
