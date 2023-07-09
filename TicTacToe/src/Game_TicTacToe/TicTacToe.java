package Game_TicTacToe;

public class TicTacToe {
    public static char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }
    public static void initBoard(){
        for(int r=0;r<board.length;r++){
            for(int c=0;c<3;c++){
                board[r][c] = ' ';
            }
        }
    }

    public static void BoardDesign(){
        System.out.println("\033[34m---------------");
        for(int r=0;r<board.length;r++){
            System.out.print("| ");
            for(int c=0;c<3;c++){
                System.out.print("\033[32m"+board[r][c]+"\033[34m"+ " |  ");
            }
            System.out.println();
            System.out.println("---------------");
        }
        System.out.print("\n");
    }
    public static boolean rowWin() {
        for (int r = 0; r < 3; r++) {
            if (board[r][0] != ' ' && board[r][0] == board[r][1] && board[r][1] == board[r][2]) {
                return true;
            }
        }
        return false;
    }
    public static boolean colWin(){
        for(int c=0;c<3;c++){
            if(board[0][c] != ' ' && board[0][c]==board[1][c] && board[1][c] == board[2][c]){
                return true;
            }
        }
        return false;
    }
    public static boolean digWin(){
        if(board[0][0] != ' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
            return true;
        else if (board[0][2] != ' ' && board[0][2]==board[1][1] && board[1][1]==board[2][0])
            return true;
        else
            return false;
    }
    public static boolean isDraw(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]== ' ')
                    return false;
            }
        }
        return true;
    }
    public static void charPlacer(int row,int col, char c){
            board[row][col] = c;
            BoardDesign();

    }
}

