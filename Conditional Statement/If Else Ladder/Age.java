import java.util.Scanner;

public class Age{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age:");
    int age = sc.nextInt();
    
    if(age>=80){
      System.out.print("Old Age");
    }else if(age>=60){
      System.out.print("Senior Citizen");
    }else if(age>=40){
      System.out.print("Middle Aged");
    }else if(age>=20){
      System.out.print("Young Age");
    }else if(age>=13){
      System.out.print("Teenager");
    }else if(age>=0){
      System.out.print("Child");
    }else{
      System.out.print("Invalid Age!");
    }
    sc.close();
  }
}
