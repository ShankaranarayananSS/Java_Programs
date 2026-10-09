//Area of Square      = S * S
//Perimeter of Square = 4 * S

import java.util.Scanner;

public class Square{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side of square:");
    int s = sc.nextInt();
    
    System.out.println("Area of Square = " + (s*s));
    System.out.println("Perimeter of Square = " + (4*s));
    sc.close();
  }
}
