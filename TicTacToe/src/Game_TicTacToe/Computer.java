package Game_TicTacToe;
import java.util.Random;
import Game_TicTacToe.*;

public class Computer extends Player{
    public Computer(char mark){
        name = "Computer";
        this.mark = mark;
    }
    public void MakeMove(){
        Random R = new Random();
        int row , col;
        do {
             row = R.nextInt(3);
             col = R.nextInt(3);
        }while(!isValid(row,col));
        TicTacToe.charPlacer(row,col,mark);
    }
}
