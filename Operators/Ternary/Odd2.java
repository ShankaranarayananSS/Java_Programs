//Odd Or Even - Version 2

import java.util.Scanner;

public class Odd2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    String result = (n%2==1)?"Odd":"Even";
    System.out.print(result);
    sc.close();
  }
}
