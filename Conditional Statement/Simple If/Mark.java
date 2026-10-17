import java.util.Scanner;

public class Mark{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter mark:");
    int mark = sc.nextInt();
    
    System.out.println("Mark = " + mark);
    if(mark>=90 && mark<=100){
      System.out.println("Excellent!");
    }
    sc.close();
  }
}
