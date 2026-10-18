import java.util.Scanner;

public class Grade{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your mark:");
    int mark = sc.nextInt();
    
    if(mark>=80 && mark<=100){
      System.out.print("Distinction");
    }else if(mark>=60 && mark<=79){
      System.out.print("First Class");
    }else if(mark>=40 && mark<=59){
      System.out.print("Second Class");
    }else if(mark>=0 && mark<=39){
      System.out.print("Fail");
    }else{
      System.out.print("Invalid Mark");
    }
    sc.close();
  }
}
