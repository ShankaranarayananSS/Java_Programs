//Sum of N Numbers

import java.util.Scanner;

public class SumOfNumbers1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i=1,n,add=0;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    while(i<=n){
      add = add + i;
      i++;
    }
    System.out.print("Sum of N numbers = " + add);
    sc.close();
  }
}
