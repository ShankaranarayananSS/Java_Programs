import java.util.Scanner;

public class Tables{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i,n;
    System.out.print("Enter number:");
    n = sc.nextInt();
    
    System.out.println(n + " Tables:");
    for(i=1;i<=10;i++){
      System.out.println(n + " * " + i + " = " + (n*i));
    }
    sc.close();
  }
}
