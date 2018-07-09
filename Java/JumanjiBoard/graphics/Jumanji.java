
/**
 * Write a description of class Jumanji here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jumanji
{
    public static void runIt()
    {
        Canvas.set(20,20);
        Canvas c = Canvas.getInstance();
        c.setBackground('.');
        Shape s = new Rectangle(new Point(5,0), 8, 4);
        s.draw();
        Shape r = new Rectangle(new Point(5,8),10,5);
        r.draw();
        System.out.println(c);
        //Rectangle sr = new Rectangle(new Point(), 10, 20);
        //sr.getWidth();
    }
}
