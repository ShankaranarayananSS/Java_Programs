/*
EXPECTED PATTERN
1
3  5
7  9  11
*/

public class Pattern6{
  public static void main(String args[]){
    int i,j,k=1;
    for(i=1;i<=3;i++){
      for(j=1;j<=i;j++){
        System.out.print(k + "\t");
        k+=2;
      }
      System.out.println();
    }
  }
}
