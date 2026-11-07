//Odd Or Even - Version 4

import java.util.Scanner;

public class Odd4{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    String result = (n%2!=0)?"Odd":"Even";
    System.out.print(result);
    sc.close();
  }
}
