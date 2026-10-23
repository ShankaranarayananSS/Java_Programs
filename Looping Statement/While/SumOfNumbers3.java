//Sum of N Even Numbers

import java.util.Scanner;

public class SumOfNumbers3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i=2,n,add=0;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    while(i<=n){
      add = add + i;
      i = i + 2;
    }
    System.out.print("Sum of N Even numbers = " + add);
    sc.close();
  }
}
