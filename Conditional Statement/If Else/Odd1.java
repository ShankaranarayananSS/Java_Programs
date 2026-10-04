//Odd Or Even - Version 1

import java.util.Scanner;

public class Odd1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    if(n%2==0){
      System.out.printf("Even");
    }else{
      System.out.printf("Odd");
    }
    sc.close();
  }
}
