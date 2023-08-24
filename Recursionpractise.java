import java.text.MessageFormat.Field;
import java.util.*;

public class Recursionpractise {
    public static int  fi(int []arr, int idx, int x) {
if(idx==0){
    return arr[idx];
}
int fisa = fi(arr, idx+1, x);
if(arr[idx]==x){
    return arr[idx];

}


}
public static void main(String[] args){
   int arr[] = {55, 3, 55, 5, 6,4, 5, 56, 5};
   int d = 5;
   int f = fi(arr, 0, d);
System.out.println(f);

}
}