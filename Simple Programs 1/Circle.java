//Area of Circle           = 3.14 * R * R
//Circumference of Circle  = 2 * 3.14 * R

import java.util.Scanner;

public class Circle{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radius of circle:");
    float r = sc.nextFloat();
    
    System.out.printf("\nArea of Circle = %.2f",3.14*r*r);
    System.out.printf("\nCircumference of Circle = %.2f",2*3.14*r);
    sc.close();
  }
}
