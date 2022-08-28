import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        char[] board = createBoard();
        checkFirstPlayer();
        showBoard(board);
        while(true) {
            playerTurn(userLetter, board);
            if(winner(board,userLetter, computerLetter)) {
                break;
            }
            showBoard(board);
            computerTurn(computerLetter, board);
            if (winner(board,userLetter,computerLetter))
            {
                break;
            }
            showBoard(board);
        }
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
    private static void playerTurn(char userLetter, char[] board ) {
        int userInput;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9)");
            userInput = scanner.nextInt();
            if (isValidMove(board,userInput))
            {
                break;
            }
            else
            {
                System.out.println(userInput + "is not a valid move");
            }
        }
        placeMove(board,userInput, userLetter);
    }
    private static void placeMove(char[] board,int position,char symbol) {
        switch(position) {
            case 1:
                board[0] = symbol;
                break;
            case 2:
                board[1] = symbol;
                break;
            case 3:
                board[2] = symbol;
                break;
            case 4:
                board[3] = symbol;
                break;
            case 5:
                board[4] = symbol;
                break;
            case 6:
                board[5] = symbol;
                break;
            case 7:
                board[6] = symbol;
                break;
            case 8:
                board[7] = symbol;
                break;
            case 9:
                board[8] = symbol;
                break;
        }
    }
    private static boolean isValidMove(char[] board,int position) {

        switch(position) {
            case 1:
                return board[0] == ' ';
            case 2:
                return board[1] == ' ';
            case 3:
                return board[2] == ' ';
            case 4:
                return board[3] == ' ';
            case 5:
                return board[4] == ' ';
            case 6:
                return board[5] == ' ';
            case 7:
                return board[6] == ' ';
            case 8:
                return board[7] == ' ';
            case 9:
                return board[8] == ' ';
            default:
                return false;
        }
    }
    private static boolean checkFirstPlayer() {
        int Head=0;
        boolean userPlay;
        double randomNum = Math.floor(Math.random()*10)%2;
        if ( randomNum == Head )
        {
            System.out.println("computer starts to play first");
            userPlay=false;
        }
        else
        {
            System.out.println("User starts to play first");
            userPlay=true;
        }
        return userPlay;
    }
    private static void computerTurn(char computerLetter, char[] board) {
        int computerMove;
        while(true)
        {
            computerMove = (int)Math.floor(Math.random()*10)%9 + 1;
            if (isValidMove(board,computerMove)) {
                break;
            }

        }
        System.out.println("Computer chose "+ computerMove);
        placeMove(board,computerMove,computerLetter);
    }
    private static boolean winner(char[] board,char userLetter,char computerLetter)
    {
        if (( board[0] == userLetter && board[1] == userLetter && board[2] == userLetter )||
                (board[3] == userLetter && board[4] == userLetter && board[5] == userLetter)||
                (board[6] == userLetter && board[7] == userLetter && board[8] == userLetter)||
                (board[0] == userLetter && board[4] == userLetter && board[8] == userLetter)||
                (board[2] == userLetter && board[4] == userLetter && board[6] == userLetter))
        {
            showBoard(board);
            System.out.println("Player win the game");
            System.exit(0);
        }
        else if (( board[0] == computerLetter && board[1] == computerLetter && board[2] == computerLetter )||
                (board[3] == computerLetter && board[4] == computerLetter && board[5] == computerLetter)||
                (board[6] == computerLetter && board[7] == computerLetter && board[8] == computerLetter)||
                (board[0] == computerLetter && board[4] == computerLetter && board[8] == computerLetter)||
                (board[2] == computerLetter && board[4] == computerLetter && board[6] == computerLetter))
        {
            showBoard(board);
            System.out.println("Computer win the game");
            System.exit(0);
        }


        for (int i=0;i<board.length;i++)
        {
            if (board[i] ==' ') {
                return false;
            }
        }
        showBoard(board);
        System.out.println("The game ended in a tie!");
        return true;
    }
}
