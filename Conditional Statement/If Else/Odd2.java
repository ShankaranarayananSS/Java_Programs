//Odd Or Even - Version 2

import java.util.Scanner;

public class Odd2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    if(n%2==1){
      System.out.print("Odd");
    }else{
      System.out.print("Even");
    }
    sc.close();
  }
}
