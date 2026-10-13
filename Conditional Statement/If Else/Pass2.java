//Pass Or Fail - Version 2

import java.util.Scanner;

public class Pass2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter mark:");
    int mark = sc.nextInt();
    
    if(mark<40){
      System.out.print("Fail");
    }else{
      System.out.print("Pass");
    }
    sc.close();
  }
}
