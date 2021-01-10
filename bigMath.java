import java.lang.*;

public class bigMath {
  private int n1;
  private int n2;
  private int d1;
  private int d2;


  public bigMath(int n1, int d1, int n2, int d2) {
    this.n1 = n1;
    this.n2 = n2;
    this.d1 = d1;
    this.d2 = d2;


  }

  public String addition(int n1, int d1, int n2, int d2) {
    int numans = ((n1 * d2) + (n2 * d1));
    int denans = (d1 * d2);
    String ans = numans + "/" + denans;
    return ans;

  }

  public String subtraction(int n1, int d1, int n2, int d2) {
    int numans = ((n1 * d2) - (n2 * d1));
    int denans = (d1 * d2);
    String ans = simping(numans, denans);

    return ans;
    // calls x and z, defines b as x - z and tells the program to return b if called
  }

  public String multiplication(int n1, int d1, int n2, int d2) {
    int numans = (n1 * n2);
    int denans = (d1 * d2);
    String ans = simping(numans, denans);

    return ans;
    // calls x and z, defines c as x*z, and puts c to be returned if called
  }

  public String division(int n1, int d1, int n2, int d2) {
    int numans = (n1 * d2);
    int denans = (d1 * n2);
    String ans = simping(numans, denans);

    return ans;
    // calls x and z, defines d as x/z, and puts d to be returned if method is
    // called. if the method is called, you need to call x and z as parameters (as
    // they are the required parameters), which puts x and z into the method, kind
    // of like a function. return d; says that if you put x and z in, you get d out.
  }

  public String simping(int numans, int denans) {
    int gcf=0;
    for (int i = 1; i <= numans && i <= denans; i++) {
      if (numans % i == 0 && denans % i == 0){

      
        gcf = i;}
        
    }
  String realAns= (numans/gcf)+"/"+(denans/gcf);
    return realAns;
  }

}