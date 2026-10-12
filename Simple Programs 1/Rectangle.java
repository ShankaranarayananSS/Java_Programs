//Area of Rectangle      = L * B
//Perimeter of Rectangle = 2 * (L + B)

import java.util.Scanner;

public class Rectangle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter length of rectangle:");
		int l = sc.nextInt();
		System.out.printf("Enter breadth of rectangle:");
		int b = sc.nextInt();
		
		System.out.printf("\nArea of Rectangle = %d",(l*b));
		System.out.printf("\nPerimeter of Rectangle = %d",2*(l+b));
		sc.close();
	}
}
