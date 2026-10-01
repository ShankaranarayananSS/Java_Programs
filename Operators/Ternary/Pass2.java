//Pass Or Fail - Version 2

import java.util.Scanner;

public class Pass2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter mark:");
    int mark = sc.nextInt();
    
    String result = (mark<40)?"Fail":"Pass";
    System.out.print(result);
    sc.close();
  }
}
