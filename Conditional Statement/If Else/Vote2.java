//Vote Eligibility - Version 2

import java.util.Scanner;

public class Vote2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = sc.nextInt();
    
    if(age<18){
      System.out.print("Not Eligible");
    }else{
      System.out.print("Eligible");
    }
    sc.close();
  }
}
