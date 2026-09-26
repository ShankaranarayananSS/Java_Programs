import java.util.Scanner;

public class Bitwise2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer value:");
    int value = sc.nextInt();
    System.out.print("Enter shift amount:");
    int shift = sc.nextInt();
    
    System.out.println(value + " << " + shift + " = " + (value<<shift));
    System.out.println(value + " >> " + shift + " = " + (value>>shift));
    sc.close();
  }
}
