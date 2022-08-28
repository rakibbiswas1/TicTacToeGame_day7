public class TicTacToeGame {

    public static void main(String[] args) {
        char[] board = createBoard();
        System.out.println("Welcome to TicTacToe program");

    }
    private static char[] createBoard() {
        char[] board = new char[10];
        for(int index=0;index<board.length;index++)
        {
            board[index] = ' ';
        }
        return board;
    }
}
