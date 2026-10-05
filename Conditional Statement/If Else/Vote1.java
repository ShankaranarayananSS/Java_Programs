//Vote Eligibility - Version 1

import java.util.Scanner;

public class Vote1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = sc.nextInt();
    
    if(age>=18){
      System.out.print("Eligible");
    }else{
      System.out.print("Not eligible");
    }
    sc.close();
  }
}
