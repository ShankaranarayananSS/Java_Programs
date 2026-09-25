import java.util.Scanner;

public class Relational{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter number-1:");
    int n1 = sc.nextInt();
    System.out.printf("Enter number-2:");
    int n2 = sc.nextInt();
    
    System.out.printf("\n%d < %d : %b",n1,n2,(n1<n2));
    System.out.printf("\n%d > %d : %b",n1,n2,(n1>n2));
    System.out.printf("\n%d <= %d : %b",n1,n2,(n1<=n2));
    System.out.printf("\n%d >= %d : %b",n1,n2,(n1>=n2));
    System.out.printf("\n%d == %d : %b",n1,n2,(n1==n2));
    System.out.printf("\n%d != %d : %b",n1,n2,(n1!=n2));
    sc.close();
  }
}
