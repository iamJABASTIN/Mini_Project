package Game_TicTacToe;

import java.util.Scanner;
public class Human extends Player{
    public Human(String name,char mark){
         this.name = name;
         this.mark = mark;
    }
    public void MakeMove(){
        Scanner s = new Scanner(System.in);
        int row,col;
        do {
            again: while(true) {
                try {
                    System.out.print("Enter the ROW : ");
                    row = s.nextInt() - 1;
                    System.out.print("Enter the COL : ");
                    col = s.nextInt() - 1;
                    if (row > 2 || row < 0 || col > 2 || col < 0) {
                        throw new InvalidNumbers();
                    } else
                        break;
                } catch (InvalidNumbers e) {
                    System.out.println("-- INVALID NUMBERS --\n\n!! GIVE IT A ANOTHER TRY !!");
                    continue again;
                } catch (Exception f) {
                    System.out.println("-- INVALID NUMBERS --\n\n!! Don't enter decimal numbers !!");
                }
            }
        }while(!isValid(row,col));
        TicTacToe.charPlacer(row,col,mark);
    }
}
