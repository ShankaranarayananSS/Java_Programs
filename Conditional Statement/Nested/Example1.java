import java.util.Scanner;

public class Example1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number:");
    int n = sc.nextInt();
    
    if(n<0){
      if(n%2==0){
        System.out.printf("Negative Even");
      }else{
        System.out.printf("Negative Odd");
      }
    }else if(n>0){
      if(n%2==0){
        System.out.printf("Positive Even");
      }else{
        System.out.printf("Positive Odd");
      }
    }else{
      System.out.printf("Neutral");
    }
    sc.close();
  }
}
