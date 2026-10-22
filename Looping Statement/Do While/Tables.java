import java.util.Scanner;

public class Tables{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i=1,n;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    System.out.println(n + " Tables:");
    do{
      System.out.println(n + " * " + i + " = " + (n*i++));
    }
    while(i<=10);
    sc.close();
  }
}
