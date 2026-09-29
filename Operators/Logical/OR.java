public class OR{
  public static void main(String args[]){
    boolean t = true, f = false;
    System.out.printf("Logical OR");
    System.out.printf("\n%b || %b = %b",t,t,(t||t));
    System.out.printf("\n%b || %b = %b",t,f,(t||f));
    System.out.printf("\n%b || %b = %b",f,t,(f||t));
    System.out.printf("\n%b || %b = %b",f,f,(f||f));
  }
}
