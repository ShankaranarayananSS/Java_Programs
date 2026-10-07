/*
EXPECTED PATTERN
2
4  6
8  10  12
*/

public class Pattern7{
  public static void main(String args[]){
    int i,j,k=2;
    for(i=1;i<=3;i++){
      for(j=1;j<=i;j++){
        System.out.print(k + "\t");
        k+=2;
      }
      System.out.println();
    }
  }
}
