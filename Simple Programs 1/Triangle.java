//Area of Right Angle Triangle = 0.5 * B * H

import java.util.Scanner;

public class Triangle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter base value:");
    float b = sc.nextFloat();
    System.out.printf("Enter height value:");
    float h = sc.nextFloat();
    
    System.out.printf("Area of Triangle = %.2f",(0.5*b*h));
    sc.close();
  }
}
