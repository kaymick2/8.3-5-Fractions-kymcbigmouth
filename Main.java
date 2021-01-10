
//Kyle McDowell
//Methods and operations with math
import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    while (userInput.hasNextInt()) {

      System.out.println("Enter value for n1:");
      int n1 = userInput.nextInt();
      System.out.println("Enter value for d1");

      double d1 = userInput.nextInt();

      System.out.println("Enter value for n2:");
      int n2 = userInput.nextInt();
      System.out.println("Enter value for d2");

      double d2 = userInput.nextInt();

    }

    bigMath bigdog = new bigMath(n1, d1, n2, d2);

    System.out.println("Which math would you like to do?"); 
  }

}