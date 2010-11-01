import static junit.framework.Assert.*;

/**
 * Automated testing for {@link HangmanConsole} class.
 *
 * @author Mr Horn
 * @version 1.0
 */
public class HangmanConsoleTest extends junit.framework.TestCase {
  
  /**
   * Unit test the hangman game.
   */
  private HangmanConsole hangman;
  
  /**
   * An array with five characters used for testing purposes.
   */
  private char[] underscores;
  
  /**
   * Sets up the test fixture.
   *
   * Called before every test case method.
   */
  protected void setUp() {
    hangman = new HangmanConsole(null);
    underscores = new char[] { '_', '_', '_', '_', '_' };
  }
  
  /**
   * Test case for {@link HangmanConsole#initializeCharArray(char, int)}.
   */
  public void testInitializeCharArray() {
    char[] actualChars = hangman.initializeCharArray('_', 5);
    
    assertEquals(5, actualChars.length);
    for(char actualChar : actualChars) {
      assertEquals('_', actualChar);
    }
  }
  
  /**
   * Test case for {@link HangmanConsole#copyChar(char[], char[], char)}.
   * This test case exemplifies the effects of "call by reference".
   */
  public void testCopyChar() {
    char[] letters = { 'a', 'b', 'c', 'b', 'b' };
    
    int i = hangman.copyChar(letters, underscores, 'b');
    assertEquals(3, i);
    assertEquals('_', underscores[0]);
    assertEquals('b', underscores[1]);
    assertEquals('_', underscores[2]);
    assertEquals('b', underscores[3]);
    assertEquals('b', underscores[4]);
  }
  
  /**
   * Tears down the test fixture.
   *
   * Called after every test case method.
   */
  protected void tearDown() {
    underscores = null;
  }
  
}
