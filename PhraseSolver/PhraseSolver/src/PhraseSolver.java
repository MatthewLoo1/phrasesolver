import java.util.Scanner;

public class PhraseSolver {
    String player1;
    String player2;
    String board;
    boolean solved;

    public PhraseSolver() {
        player1 = null;
        player2 = null;
        board = null;
        solved = false;
    }

    public void setPlayers(String p1, String p2) {
        player1 = p1;
        player2 = p2;
    }

    public void initializeBoard(String initialBoard) {
        board = initialBoard;
    }

    public void play() {
        int currentPlayer = 1;

        Scanner input = new Scanner(System.in);

        boolean correct = true;
        while (!solved) {


            System.out.println("Current Board: " + board);


            String currentPlayerName = (currentPlayer == 1) ? player1 : player2;
            System.out.print(currentPlayerName + ", enter your move: ");
            String move = input.nextLine();


            correct = checkMove(move);

            if (correct) {
                solved = true;
                System.out.println(currentPlayerName + " wins!");
            } else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }

    private boolean checkMove(String move) {
        
        return false; 
    }

    public static void main(String[] args) {
        PhraseSolver game = new PhraseSolver();
        game.setPlayers("Player1", "Player2");
        game.initializeBoard("_ _ _ _ _ _"); 

        System.out.println("Game is solved: " + game.solved);

        game.play();
    }
}