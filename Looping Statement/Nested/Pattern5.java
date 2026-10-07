/*
EXPECTED PATTERN
1
2  3
4  5  6
*/

public class Pattern5{
  public static void main(String args[]){
    int i,j,k=1;
    for(i=1;i<=3;i++){
      for(j=1;j<=i;j++){
        System.out.print(k + "\t");
        k++;
      }
      System.out.println();
    }
  }
}
