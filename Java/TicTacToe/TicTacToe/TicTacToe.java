import java.util.Scanner;
/**
 * This class implements the game we all love to
 * not play.
 *
 * @author (M Rasamny)
 * @version (03/13/2018)
 */
public class TicTacToe
{
    // instance variables 
    private GamePiece[][] board;
    private GamePiece[] piece;
    private int nextPlayerIndex;
    private int numOfMoves;

    public TicTacToe(GamePiece p1, GamePiece p2)
    {
        board = new GamePiece[3][3];
        clear();
        piece = new GamePiece[2];
        piece[0] = new GamePiece(p1);
        piece[1] = new GamePiece(p2);
        nextPlayerIndex = 0;
        numOfMoves = 0;
    }

    public boolean isValid(int location)
    {
        return location >= 0 && location < board.length*board.length;
    }

    public boolean isEmpty(int location)
    {
        return getPiece(location) == null;
    }

    public int movesRemaining()
    {
        return board.length*board.length - numOfMoves;
    }

    public GamePiece getPiece(int location)
    {
        int row = location/board.length;
        int col = location%board.length;
        return board[row][col];
    }

    public GamePiece getWinner()
    {
        int[][] combs = 
            {
                {0,1,2},{3,4,5},{6,7,8},
                {0,3,6},{1,4,7},{2,5,8},
                {0,4,8},{2,4,6}
            };
        GamePiece winner=null;
        for(int index=0; index < combs.length && winner==null; index++){
            if (getPiece(combs[index][0]) == getPiece(combs[index][1]) && 
            getPiece(combs[index][0]) == getPiece(combs[index][2])){
                winner = getPiece(combs[index][0]);
            }
        }
        return winner;
    }

    public GamePiece currentPlayer()
    {
        return new GamePiece(piece[nextPlayerIndex]);
    }

    public boolean add(int location)
    {
        if (isValid(location) && isEmpty(location)){
            board[location/board.length][location%board.length] = piece[nextPlayerIndex];
            nextPlayerIndex = nextPlayerIndex > 0?0:1;
            numOfMoves++;
            return true;
        }
        return false;
    }

    public void clear()
    {
        // set all elements of 2d array to null
        for(int row=0; row < board.length; row++){
            for(int col=0; col < board[row].length; col++){
                board[row][col] = null;
            }
        }
    }

    public String toString()
    {
        String s = "";
        // concatinate top of board
        for(int col = 0; col < board[0].length; col++){
            s += "--";
        }
        s += "-\n";
        // draw board
        for(int row=0; row < board.length; row++){
            for(int col=0; col < board[row].length; col++){
                s += "|";
                if (board[row][col] == null){
                    s += ""+(row*board.length+col);
                } else {
                    s+=board[row][col].getPiece();
                }
            }
            s += "|\n";

            for(int col = 0; col < board[row].length; col++){
                s += "--";
            }
            s += "-\n";
        }
        return s;
    }

    public static void main(String[] argv)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe ttt = new TicTacToe(new GamePiece('X'),new GamePiece('O'));
        System.out.println(ttt.toString());
        int move;
        while ((ttt.getWinner() == null) &&(ttt.movesRemaining() != 0)) {
            System.out.print("Player " + ttt.currentPlayer() + ", choose a square:");
            move = input.nextInt();
            System.out.println();
            if ((ttt.isValid(move)) && (ttt.isEmpty(move))) {
                ttt.add(move);
            }
            else if (!(ttt.isValid(move))) {
                System.out.println("Please select a valid square!");
            }
            else if (!(ttt.isEmpty(move))) {
                System.out.println("That square is already taken!");
            }
            System.out.println(ttt.toString());
            
        }
        if (ttt.movesRemaining() == 0) {
            System.out.println("Game ended in a draw!");
        }
        else if (ttt.getWinner() != null) {
            System.out.println("" + ttt.getWinner() + " is the winner!");
        }
    }
}
