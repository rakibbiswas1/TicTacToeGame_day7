import java.util.Scanner;
public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        char[] board = createBoard();
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
}
