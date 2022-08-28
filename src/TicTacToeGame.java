import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        char[] board = createBoard();
        showBoard(board);
        userPosition(userLetter, board);
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
    private static void userPosition(char userLetter, char[] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your placement (1-9)");
        int position = scanner.nextInt();
        for(int i=0;i<=8;i++)
        {
            if(board[i]==' ')
            {
                switch(position) {
                    case 1:
                        board[0] = userLetter;
                        break;
                    case 2:
                        board[1] = userLetter;
                        break;
                    case 3:
                        board[2] = userLetter;
                        break;
                    case 4:
                        board[3] = userLetter;
                        break;
                    case 5:
                        board[4] = userLetter;
                        break;
                    case 6:
                        board[5] = userLetter;
                        break;
                    case 7:
                        board[6] = userLetter;
                        break;
                    case 8:
                        board[7] = userLetter;
                        break;
                    case 9:
                        board[8] = userLetter;
                        break;
                }
            }
            else {
                System.out.println("Position is not free! Letter is entered");
            }
        }
        showBoard(board);
    }
}
