
/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point implements Cloneable
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Point
     */
    public Point()
    {
        // initialise instance variables
        x = 0;
        y = 0;
    }

    /**
     * Constructor for objects of class Point
     * 
     * @param x location along x-axis
     * @param y location along y-axis
     */
    public Point(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public Object clone()
    {
        return new Point(this.x,this.y);
    }

    public boolean equals( Object obj) {
        if (obj == null) {
            return false;
        }
        else if( this == obj) {
            return true;
        }

        else if (!(obj instanceof Rectangle)) {
            return false;
        }
        Point p = (Point)obj;
        return x == p.x && y == p.y;
    }
}
