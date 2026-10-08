import java.util.Scanner;

public class Positive{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    if(n<0){
      System.out.print("Negative");
    }else if(n>0){
      System.out.print("Positive");
    }else{
      System.out.print("Neutral");
    }
    sc.close();
  }
}
