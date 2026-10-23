//Sum of N Even Numbers

import java.util.Scanner;

public class SumOfNumbers3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,n,add=0;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    for(i=2;i<=n;i+=2){
      add = add + i;
    }
    System.out.print("Sum of N Even numbers = " + add);
    sc.close();
  }
}
