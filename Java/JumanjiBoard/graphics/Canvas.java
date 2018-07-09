
/**
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Canvas
{
    private final static char BACKGROUND = ' ';
    public final static int HEIGHT = 40;
    public final static int WIDTH = 80;

    private static Canvas instance = null;
    private static int height=HEIGHT;
    private static int width=HEIGHT;

    private char background;
    private char image[][];

    /**
     * Private constructor.
     */
    private Canvas()
    {
        image = new char[height][width];
        background = BACKGROUND;
        clear();
    }

    /**
     * Returns an instance of the canvas.  If this is the first invocation of the method,
     * then a new Canvas instane is created and returned.  Subsequent invocations of this
     * method returns the same instance.
     */
    public static Canvas getInstance()
    {
        if (instance == null)
        {
            instance = new Canvas();
        }
        return instance;
    }

    /**
     * Sets the height and width of the canvas.  This must be called before the first 
     * invocation of the getInstance().  If getInstance() has been invoked, this method
     * does nothing.
     * 
     * @param height New height of the canvas.
     * @param width New width of the canvas.
     */
    public static void set(int height, int width)
    {
        if (instance == null)
        {
            Canvas.height = height;
            Canvas.width = width;
        }
    }

    /**
     * Writes a character represented by pen to coordinate x,y.
     * 
     * @param x location along the x-axis
     * @param y location along the y-axis
     * @param pen character which is to be placed at location x,y
     */
    public void plot(int x, int y, char pen)
    {
        try 
        {
            image[y][x] = pen;
        } 
        catch (IndexOutOfBoundsException iobe)
        {

        }
    }

    /**
     * Undoes what plot did.  Uses the background character to replace the plot at x,y
     * 
     * @param x location along the x-axis
     * @param y location along the y-axis
     */
    public void unplot(int x, int y)
    {
        try
        {
            image[y][x] = background;
        }
        catch (IndexOutOfBoundsException iobe)
        {

        }
    }

    /**
     * Clear the canvas with the current background character.
     */
    public void clear()
    {
        for(int row = 0; row < image.length; row++)
        {
            for(int col = 0; col < image[0].length; col++)
            {
                image[row][col] = background;
            }
        }
    }

    /**
     * Set the background for the Canvas.
     * 
     * @param background the character to use as the background character.
     */
    public void setBackground(char background)
    {
        for(int row = 0; row < image.length; row++)
        {
            for(int col = 0; col < image[0].length; col++)
            {
                if (image[row][col] == this.background)
                {
                    image[row][col] = background;
                }
            }
        }
        this.background =  background;
    }

    public char getBackground()
    {
        return background;
    }

    public String show()
    {
        return toString();
    }

    public String toString()
    {
        String result = "";
        for(int row = 0; row < image.length; row++)
        {
            for(int col = 0; col < image[0].length; col++)
            {
                result += image[row][col];
            }
            result += "\n";
        }
        return result;
    }
}
