import java.util.Scanner;
public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        char[] board = createBoard();
        showBoard(board);
    }
    private static char[] createBoard() {
        char[] board = new char[10];
        for(int index=0;index<board.length;index++)
        {
            board[index] = ' ';
        }
        return board;
    }
    private static char chooseUserLetter(Scanner userInput) {
        System.out.println("Choose your letter: ");
        return userInput.next().toUpperCase().charAt(0);
    }
    private static void showBoard(char[] board) {
        System.out.println( board[0] + " | " + board[1] + " | " + board[2] );
        System.out.println("----------");
        System.out.println( board[3] + " | " + board[4] + " | " + board[5] );
        System.out.println("----------");
        System.out.println( board[6] + " | " + board[7] + " | " + board[8] );
    }
}
