import static java.lang.System.out;
import java.util.Scanner;

/**
 * Console input/output.
 * 
 * @author Mr Horn
 * @version 1.0
 */
public class Console {

  private final String EMPTY = "";
  private final Scanner scanner = new Scanner(System.in);

  /**
   * Reads the next character from the console.
   * 
   * @return character entered on the console
   */
  public char readChar() {
    return readChar("");
  }

  /**
   * Writes a prompt to the console and reads the next character from it.
   * 
   * @param prompt
   *          string to be displayed on the console
   * @return character entered on the console
   */
  public char readChar(String prompt) {
    return readLine(prompt).charAt(0);
  }

  /**
   * Reads the next string from the console.
   * 
   * @return string entered on the console
   */
  public String readLine() {
    return readLine(EMPTY);
  }

  /**
   * Writes a prompt to the console and reads the next string from it.
   * 
   * @param prompt
   *          string to be displayed on the console
   * @return string entered on the console
   */
  public String readLine(String prompt) {
    print(prompt);
    return scanner.nextLine();
  }

  /**
   * Reads the next integer from the console.
   * 
   * @return integer entered on the console
   */
  public int readInt() {
    return readInt(EMPTY);
  }

  /**
   * Writes a prompt to the console and reads the next integer from it.
   * 
   * @param prompt
   *          string to be displayed on the console
   * @return integer entered on the console
   */
  public int readInt(String prompt) {
    print(prompt);
    return scanner.nextInt();
  }

  /**
   * Writes a string to the console.
   */
  public void print(String s) {
    out.print(s);
  }

  /**
   * Writes a boolean to the console.
   */
  public void print(boolean b) {
    out.print(b);
  }

  /**
   * Writes a character to the console.
   */
  public void print(char c) {
    out.print(c);
  }

  /**
   * Writes a double precision floating point number to the console.
   */
  public void print(double d) {
    out.print(d);
  }

  /**
   * Writes a floating point number to the console.
   */
  public void print(float f) {
    out.print(f);
  }

  /**
   * Writes an integer to the console.
   */
  public void print(int i) {
    out.print(i);
  }

  /**
   * Writes a long integer to the console.
   */
  public void print(long l) {
    out.print(l);
  }

  /**
   * Writes a newline character to the console.
   */
  public void println() {
    out.println();
  }

  /**
   * Writes a string to the console and starts a newline.
   */
  public void println(String s) {
    out.println(s);
  }

  /**
   * Writes a boolean to the console and starts a newline.
   */
  public void println(boolean b) {
    out.println(b);
  }

  /**
   * Writes a character to the console and starts a newline.
   */
  public void println(char c) {
    out.println(c);
  }

  /**
   * Writes a double precision floating point number to the console and
   * starts a newline.
   */
  public void println(double d) {
    out.println(d);
  }

  /**
   * Writes a floating point number to the console and starts a newline.
   */
  public void println(float f) {
    out.println(f);
  }


  /**
   * Writes an integer to the console and starts a newline.
   */
  public void println(int i) {
    out.println(i);
  }

  /**
   * Writes a long integer to the console and starts a newline..
   */
  public void println(long l) {
    out.println(l);
  }

  /**
   * Erases from the console previous output.
   */
  public void clear() {
    println("\f");
  }

}