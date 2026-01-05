import java.util.*;

class TicTacToeImplementaion {
    Scanner sc = new Scanner(System.in);
    char[][] board = new char[3][3];
    char turn;
    Boolean flag = true;

    TicTacToeImplementaion() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void showboard() {
        System.out.println("-------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
            System.out.println("-------");
        }
    }

    char checkresult(){
        
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == turn && board[i][1] == turn && board[i][2] == turn) {
                return turn;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (board[0][i] == turn && board[1][i] == turn && board[2][i] == turn) {
                return turn;
            }
        }

        if (board[0][0] == turn && board[1][1] == turn && board[2][2] == turn) {
            return turn;
        }

        if (board[0][2] == turn && board[1][1] == turn && board[2][0] == turn) {
            return turn;
        }

        return 'd';
    }

    void start() {
        System.out.println("who want to start: \n1) X\n2) O");
        int choicev = sc.nextInt();
        if (choicev == 1) {
            turn = 'X';
        }
        else{
            turn = 'O';
        }
        
        while (flag) {
            System.out.println("\nTurn: " + turn);
            System.out.print("Enter your location:");
            
            int choice = sc.nextInt();
            int row = (choice - 1) / 3;
            int column = (choice - 1) % 3;

            if (board[row][column] == ' ') {
                board[row][column] = turn;
                showboard();
                char result = checkresult();
                if(result == 'X' || result =='O'){
                    System.out.println("Player "+result+" wins.");
                }
                
                else if(isboardfull()){
                    System.out.println("Its draw");
                    start();
                }
                turnexchange();
            }
            else {
                System.out.println("Location is already occupied");
            }
        }
    }

    void turnexchange(){
        if(turn == 'X'){
            turn = 'O';
        }
        else{
            turn ='X';
        }
    }

    boolean isboardfull(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

public class TicTacToe {
    public static void main(String args[]) {
        TicTacToeImplementaion board1 = new TicTacToeImplementaion();
        board1.showboard();
        board1.start();
    }
}
