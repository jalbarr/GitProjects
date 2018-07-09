
/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line extends Shape
{
    private Point p1;
    private Point p2;
    
    public Line(Point p1,Point p2)
    {
        super();
        this.p1 = (Point)p1.clone();
        this.p2 = (Point)p2.clone();
    }
    
    public void draw()
    {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();
        Canvas c = Canvas.getInstance();
        if (dx == 0)
        {
            int inc = dy/Math.abs(dy);
            for(int row = p1.getY(); inc*row <= inc*p2.getY(); row += inc)
            {
                c.plot(p1.getX(),row,getPenStyle());
            }
        } else
        {
            double slope = ((double)(dy))/dx;
            double yIntercept = p1.getY()-slope*p1.getX();
            if (slope <= 1)
            {
                int incx = dx/Math.abs(dx);
               for(int col = p1.getX(); incx*col < incx*p2.getX(); col += incx)
                {
                    //calculate row 
                    int row = (int)Math.round(slope*col+yIntercept);
                    c.plot(col,row,getPenStyle());
                } 
            } else
            { 
                int incy = dy/Math.abs(dy);
                for(int row = p1.getY(); incy*row <= incy*p2.getY(); row += incy)
                {
                    //calculate col 
                    int col = (int)Math.round((row-yIntercept)/slope);
                    c.plot(col,row,getPenStyle());
                }
            }
        }
    }
}
