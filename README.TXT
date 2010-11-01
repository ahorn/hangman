Content: Simple Hangman game on the console.
License: GPLv3

Description: The source code exemplifies fundamental modular design principles
in imperative programming languages. You should be familiar with the basics of
control flow statements such as if-then, if-then-else and loops. Procedures and
functions with arguments aim to structure the program into independent units.
Furthermore, the use of arrays demonstrates the differences between "call by
value" and "call by reference". The latter could cause procedures and functions
to have side effects. Finally, there is an auxiliary testing class which
features rudimentary automated unit tests which can help you identify bugs.

Game example:

 +--Console------------------------------------------+
 |                                                   |
 |  Guess a letter: e                                |
 |  ______                                           |
 |  6/7                                              |
 |                                                   |
 |  Guess a letter: i                                |
 |  ______                                           |
 |  5/7                                              |
 |                                                   |
 |  Guess a letter: o                                |
 |  o__o__                                           |
 |  5/7                                              |
 |                                                   |
 |  Guess a letter: p                                |
 |  o__o__                                           |
 |  4/7                                              |
 |                                                   |
 |  Guess a letter: d                                |
 |  o__o_d                                           |
 |  4/7                                              |
 |                                                   |
 |  Guess a letter: x                                |
 |  ox_o_d                                           |
 |  4/7                                              |
 |                                                   |
 |  Guess a letter: f                                |
 |  oxfo_d                                           |
 |  4/7                                              |
 |                                                   |
 |  Guess a letter: r                                |
 |  oxford                                           |
 |  4/7                                              |
 |                                                   |
 |  You saved your life this time. Until next time!  | 
 |                                                   |
 +---------------------------------------------------+

Instructions if you are new to Java:

0) Install software development tools:
   b) Download JDK 6 or higher [1]
   a) Download BlueJ [2]
1) Open the Hangman project in BlueJ
2) Compile the project (Ctrl + K)
3) Right-click on the HangmanGame rectangle
4) Choose the menu option "void play(String secret)"
5) A dialog window opens; enter a string such as "oxford" with double quotes.

Enjoy modifying the code.
Mr Horn

URLs:

[1] http://www.oracle.com/technetwork/java/javase/downloads/index.html
[2] http://www.bluej.org/
