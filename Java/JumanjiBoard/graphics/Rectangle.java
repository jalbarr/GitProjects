
/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle extends Shape
implements Boundable
{
    private Point p;
    private int width;
    private int height;

    public Rectangle(Point p, int width, int height)
    {
        this.p = (Point)p.clone();
        this.width = width;
        this.height = height;
    }

    public int getWidth()
    {
        return width;
    }

    public void draw()
    {
        Canvas c = Canvas.getInstance();

        Point p2 = new Point(p.getX()+width, p.getY());
        Point p3 = new Point(p.getX(),p.getY()+height);
        Point p4 = new Point(p.getX()+width, p.getY()+height);
        Line l1 = new Line(p,p2);
        Line l2 = new Line(p2,p4);
        Line l3 = new Line(p4,p3);
        Line l4 = new Line(p3,p);
        l1.draw();
        l2.draw();
        l3.draw();
        l4.draw();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        else if( this == obj) {
            return true;
        }

        else if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle r = (Rectangle)obj;
        return r.width==width && r.height == height &&
        p.equals(r.p);
    }

    public boolean contains(Point p)
    {
        return false;   
    }

    public Rectangle getBounds()
    {
        return new Rectangle(p, width, height); 
    }
}
