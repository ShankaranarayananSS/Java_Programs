import java.util.Scanner;

public class Simple_Interest{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter Principle amount:");
    float p = sc.nextFloat();
    System.out.printf("Enter No. of Years:");
    float n = sc.nextFloat();
    System.out.printf("Enter Rate of Percentage:");
    float r = sc.nextFloat();
    
    System.out.printf("Simple Interest = %.2f",p*n*r/100);
    sc.close();
  }
}
