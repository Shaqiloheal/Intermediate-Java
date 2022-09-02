package Input_And_Output;

import java.util.Scanner;

// Scanner class that reads user's input.
public class Scanner {
  public static void main( String[] args ) {
    
    // declares the Scanner
    Scanner input = new Scanner(System.in);
    
    // question
    System.out.print("What is your name?: ");
    // awaits user input
    String userName = input.next();
    // printed response including the user input
    System.out.printf("Hello %s! It's nice to meet you.\n", userName);

  }
}
