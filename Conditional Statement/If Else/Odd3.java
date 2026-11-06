//Odd Or Even - Version 3

import java.util.Scanner;

public class Odd3{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    if(n%2!=1){
      System.out.print("Even");
    }else{
      System.out.print("Odd");
    }
    sc.close();
  }
}
