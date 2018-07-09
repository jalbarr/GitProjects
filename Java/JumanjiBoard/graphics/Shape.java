
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    private static final char PEN_STYLE = '*';
    // instance variables - replace the example below with your own
    private char pen;

    /**
     * Constructor for objects of class Shape
     */

    public Shape()
    {
        // initialise instance variables
        pen = PEN_STYLE;
    }

    public Shape(char pen)
    {
        setPenStyle(pen);
    }

    public char getPenStyle()
    {
        return this.pen;
    }

    public void setPenStyle(char pen)
    {
        this.pen = pen;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if( this == obj) {
            return true;
        }

        else if (!(obj instanceof Shape)) {
            return false;
        }
        Shape s = (Shape)obj;
        return pen == s.pen;
    }

    public abstract void draw();
}
