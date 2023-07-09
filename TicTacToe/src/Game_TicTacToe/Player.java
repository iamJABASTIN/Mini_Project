package Game_TicTacToe;
//import Game_TicTacToe.*;

public abstract class Player {
    public String name;
    public char mark;
    public abstract void MakeMove();
    protected boolean isValid(int r,int c){
        if(TicTacToe.board[r][c] == ' ')
        return true;
        else
        return false;
    }
}
