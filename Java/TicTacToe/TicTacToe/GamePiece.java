
/**
 * Write a description of class GamePiece here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GamePiece
{
    private static final char DEFAULT_PIECE='X';
    
    private char piece;
    
    public GamePiece()
    {
        setPiece(DEFAULT_PIECE);
    }
    
    public GamePiece(char piece)
    {
        setPiece(piece);
    }
    
    public GamePiece(GamePiece gamePiece)
    {
        this.piece = gamePiece.piece;
    }
    
    public char getPiece()
    {
        return piece;
    }
    
    public void setPiece(char piece)
    {
        this.piece = piece;
    }
    
    public String toString()
    {
        return ""+piece;
    }
    
    public boolean isEqual(GamePiece gp)
    {
        return piece == gp.piece;
    }
}
