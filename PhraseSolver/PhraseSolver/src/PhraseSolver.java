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

        // boolean correct = true;
        while (!solved) {


            System.out.println("Current Board: " + board);


            String currentPlayerName = (currentPlayer == 1) ? player1 : player2;
            System.out.print(currentPlayerName + ", enter your move: ");
            String move = input.nextLine();


            solved = checkMove(move, curentPlayerName);

            if (solved) {
                solved = true;
                System.out.println(currentPlayerName + " wins!");
            } else {
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }
    }

    private boolean checkMove(String move, String currentPlayerName) {

        //This checks if the move solves the phrase that is given
        if (move.equals("your_solved_phrase"))
        {
            return true;
        }
        else{ 
            
            char letter = move.charAt(0);
            if (board.contains(String.valueOf(letter))) {
                System.out.println("Letter '" + letter + "' is in the phrase.");
            } else {
                System.out.println("Letter '" + letter + "' is not in the phrase.");
            }
        
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
