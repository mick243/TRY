import java.util.*;

public class Main { 
  public static int fibo(int x) {
    if ( x == 1 || x == 2 ) { 
      return 1;
     }
     return fibo(x - 1) + fibo(x-2);
   }
   
   public ststic void main(Srting[] args) {
      System.out.println(fibo(4));
    }
 }
//

public class Main {
  public static long[] d = new long[100];
  
  public static void main(String[] args) {
    d[1] = 1;
    d[2] = 1;
    int n = 50;
    
    for (int i = 3, i <=n; i++) {
        d[i] = d[i-1] + d[i-2];
    }
    System.out.println(d[n]);
  }
}
//
