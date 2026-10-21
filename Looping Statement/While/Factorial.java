//Factorial of N Numbers

import java.util.Scanner;

public class Factorial{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,i=1,fact=1;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    while(i<=n){
      fact = fact * i;
      i++;
    }
    System.out.print("Factorial of " + n + " is " + fact);
    sc.close();
  }
}
