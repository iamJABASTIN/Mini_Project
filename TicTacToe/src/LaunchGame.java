import Game_TicTacToe.*;



public class LaunchGame extends TicTacToe {
    public static void main(String[] args){
        TicTacToe t = new TicTacToe();
        Human p1 = new Human("JABASTIN",'X');
        Computer p2 = new Computer('O');
        Player cp;
        cp = p1;
        while(true) {
            System.out.println("\033[36m"+cp.name + " turn\033[34m");
            cp.MakeMove();
            if (rowWin() || colWin() || digWin()) {
                System.out.print("\033[31m"+cp.name + " have WON!!!");
                break;
            }
            else if(isDraw()) {
                System.out.print("\033[31m-- The Match Is Draw --");
                break;
            }
            else{
                if(cp==p1){
                    cp = p2;
                }
                else{
                    cp=p1;
                }
            }
        }
    }
}
