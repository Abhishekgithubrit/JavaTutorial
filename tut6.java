
import java.util.*;
public class tut6{
    public static void fact(int n){
        if (n<=0) {
            System.out.println("Invalid Number");
            return;
            
        }
        int factorial=1;
        for (int i = n; i >=1; i--) {
            factorial= factorial*i;
        }
        System.out.println(factorial);

    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(); 
    fact(n);
   
}
}
