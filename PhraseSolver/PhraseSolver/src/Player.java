/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
    String name;
    int points;
  /* your code here - constructor(s) */ 
  public Player()
  {
    System.out.println("Enter Player Name:");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();

    name = newName;
    points = 0;
    
    System.out.println("Hello and welcome to the game, " + name);
  }

  public Player(String inputName) {
    name = inputName;
    points = 0;

    System.out.println("Hello and welcome to the game, " + name);
  }
  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}