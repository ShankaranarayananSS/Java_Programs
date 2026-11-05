//Biggest Of Two Numbers

import java.util.Scanner;

public class Biggest1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number-1:");
    int a = sc.nextInt();
    System.out.print("Enter number-2:");
    int b = sc.nextInt();
    
    if(a>b){
      System.out.print(a + " is bigger than " + b);
    }else if(a<b){
      System.out.print(b + " is bigger than " + a);
    }else{
      System.out.print("Both are same");
    }
    sc.close();
  }
}
