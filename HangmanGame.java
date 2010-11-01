/**
 * Class to start a simple Hangman game from the command line.
 * 
 * @author Mr Horn
 * @version 1.0
 */
public class HangmanGame {

  /**
   * Instantiate a helper class to interact with the user through the console.
   */
  private final static Console console = new Console();

  /**
   * Hide constructor. Only static procedures and functions can be invoked.
   */
  private HangmanGame() {
    /* empty */
  }

  /**
   * Start Hangman game from the command line with command line arguments.
   * 
   * If no command line argument has been specified, then the procedure first
   * asks the user for a word. Assume there is another person who is the player.
   * This player guesses letters with the goal of finding out what the word is.
   * Only seven guesses are allowed. The game is over if the player exceeds the
   * number of allowed guesses or if (s)he has successfully guessed the word.
   */
  public static void main(String[] args) {
    // Declare a variable of type string
    String secret;

    if (args.length > 0) {
      // Assign the first command line argument 
      secret = args[0];
    } else {
      // Assign the return value of a function
      secret = enterSecret();
    }
    
    // Invoke another procedure to trigger certain functionality, i.e. play the game
    playGame(secret);
  }

  /**
   * Play Hangman game where a player tries to guess a word.
   * 
   * @param secret
   *          sequence of letters the player should guess as part of the game
   */
  public static void playGame(String secret) {
    HangmanConsole consoleGame = new HangmanConsole(console);
    
    // Declare and assign to a variable which can hold a sequence
    // of characters: the variable is of type character array.
    char[] secretChars = secret.toCharArray();
    consoleGame.playHangman(secretChars);
  }

  /**
   * Prompts the user to enter a string which corresponds to the sequence of
   * letters a player must guess.
   * 
   * @return characters of the string entered by the user
   */
  private static String enterSecret() {
    return console.readLine("Enter secret: ");
  }

}
