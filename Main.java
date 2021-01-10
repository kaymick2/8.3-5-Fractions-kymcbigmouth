
//Kyle McDowell
//Methods and operations with math
import java.util.*;
import java.lang.*;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    int n1 = 0;
    int n2 = 0;
    int d1 = 0;
    int d2 = 0;
    String ans
    while (userInput.hasNextInt()) {

      System.out.println("Enter value for n1:");
      n1 = userInput.nextInt();
      System.out.println("Enter value for d1");

      d1 = userInput.nextInt();

      System.out.println("Enter value for n2:");
      n2 = userInput.nextInt();
      System.out.println("Enter value for d2");

      d2 = userInput.nextInt();

    }

    bigMath bigdog = new bigMath(n1, d1, n2, d2, ans, gcf);

    System.out.println("Which math would you like to do?");
  }

}