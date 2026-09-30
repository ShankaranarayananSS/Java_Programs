//Vote Eligibility - Version 2

import java.util.Scanner;

public class Vote2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = sc.nextInt();
    
    String result = (age<18)?"Not Eligible":"Eligible";
    System.out.print(result);
    sc.close();
  }
}
