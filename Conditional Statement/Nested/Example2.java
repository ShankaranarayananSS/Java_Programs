import java.util.Scanner;

public class Example2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = sc.nextInt();
    
    if(age>=18 && age<=60){
      System.out.print("Eligible to drive");
    }else{
      if(age<18){
        System.out.print("Under age");
      }else{
        System.out.print("Over age");
      }
    }
    sc.close();
  }
}
