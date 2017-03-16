import java.io.Console;

public class App {
  public static void main (String[] args) {
    Console myConsole = System.Console();
    System.out.println("Welcome to Hangman! Enter the letter that you would like to guess first.");
    String emptyboard = "_ _ _ _ _ _"
    System.out.println()
    String userInput = myConsole.readLine();
    String answer = "coding"
    if (answer.goodInput(userInput)) {
      answer.indexOf(userInput) = replaceBoardWith;
      
    }
  }
}
