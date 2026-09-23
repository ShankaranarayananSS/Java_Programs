import java.util.Scanner;

public class Subscribe{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.printf("Enter number-1:");
    float n1 = sc.nextFloat();
    System.out.printf("Enter number-2:");
    float n2 = sc.nextFloat();
    
    System.out.printf("\n%.2f + %.2f = %.2f",n1,n2,(n1+n2));
    System.out.printf("\n%.2f - %.2f = %.2f",n1,n2,(n1-n2));
    System.out.printf("\n%.2f * %.2f = %.2f",n1,n2,(n1*n2));
    System.out.printf("\n%.2f / %.2f = %.2f",n1,n2,(n1/n2));
    System.out.printf("\n%.2f %% %.2f = %.2f",n1,n2,(n1%n2));
    sc.close();
  }
}
