/**
 * A simple Console-based implementation of the Hangman game.
 * 
 * @author Mr Horn
 * @version 1.0
 */
public class HangmanConsole {

  /**
   * Constant integer value for the number of guesses available to a player.
   */
  private static final int GUESSES = 7; /* non-negative integer */

  /**
   * Utility object to print output and read input from the console.
   */
  private final Console console;

  /**
   * Class constructor to instantiate an object which implements
   * the basic rules of Hangman as a console game.
   * 
   * @param console
   *          utility object to print output and read input from the console
   */
  public HangmanConsole(Console console) {
    this.console = console;
  }

  /**
   * Play Hangman where a player guesses the word represented as a sequence of
   * letters provided as a parameter of type character array.
   */
  public void playHangman(char[] secretChars) {
    // Sequence of letters correctly guessed by the player.
    // Initially, fill the array with '_' chars to represent invisible letters
    char[] guessedChars = initializeCharArray('_', secretChars.length);

    // Non-negative counter for the number of guesses available.
    // The counter is decremented on each incorrect guess.
    int guessCount = GUESSES;

    // Declare a variable that holds the most recently guessed character
    char guessChar;

    // Count the number of letters that have been revealed. The game is over
    // once revealedCount <= 0, i.e. the counter is zero or smaller.
    int revealedCount = secretChars.length;

    // Integer variable to store the number of letters  
    // which have been correctly guessed during the game.
    int replacedCount;

    // Loop which iterates at least once
    do {
      guessChar = console.readChar("Guess a letter: ");

      // Keep track what letters have been correctly guessed.
      // Only revealedCount OR guessCount decrements (never both)
      replacedCount = copyChar(secretChars, guessedChars, guessChar);
      if (replacedCount > 0) {
        // Decrement counter by the number of newly revealed letters 
        revealedCount -= replacedCount;
      } else {
        // One less guess available
        guessCount--;
      }

      // Reveal correctly guessed letter(s)
      printCharArray(guessedChars);
      console.println();

      // Print out how many guesses the player has still available
      console.println(guessCount + "/" + GUESSES);

      // Loop stops (i.e. game is over) if either:
      //   i)  the player has no more guesses available OR
      //   ii) all letters have been revealed
    } while (guessCount > 0 && revealedCount > 0);

    if (guessCount == 0) {
      console.println("Game over! You are dead!");
    } else {
      console.println("You saved your life this time.");
    }
  }

  /**
   * Initialize an array of {@code length} characters with the
   * character {@code c} specified as the first argument.
   */
  char[] initializeCharArray(char c, int length) {
    char[] cs = new char[length];
    for (int i = 0; i < length; i++) {
      cs[i] = c;
    }
    return cs;
  }

  /**
   * Iterate over the {@code xs} array and copy characters which are equal to
   * {@code x} to the {@code ys} array at the same position(s).
   * We assume that both arrays are of equal length.
   * 
   * @return number of characters replaced
   */
  int copyChar(char[] xs, char[] ys, char x) {
    int replacedCount = 0;
    for (int i = 0; i < xs.length; i++) {
      if (x == xs[i]) {
        ys[i] = x;
        replacedCount++;
      }
    }
    return replacedCount;
  }

  /**
   * Print each character of the array to the console.
   */
  void printCharArray(char[] xs) {
    for (int i = 0; i < xs.length; i++) {
      console.print(xs[i]);
    }
  }

}