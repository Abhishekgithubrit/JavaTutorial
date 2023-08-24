import java.util.*;
import java.util.Arrays;

public class tut_07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the arrays a primtive data types");
    //    int n  = sc.nextInt();
       
    //    int marks[] = new int[n];
    //    for (int i = 0; i < n; i++) {
    //        marks[i] = sc.nextInt();
           
    //    }
    //    for (int i = 0; i < n; i++) {
    //        System.out.println(marks[i]);
           
    //    }
    // search the number and print their index;
    // int sea[] = new int[n];
    // for (int i = 0; i < n; i++) {
    //     sea[i] = sc.nextInt();
    // }
    // int x =sc.nextInt();
    // for (int i = 0; i < sea.length; i++) {
    //     if(sea[i]==x){
    //         System.out.println("the ith position" + " "+ i);
    //     }
        
    // }
// sorting a string and the integer---------------
int myarr[] = {2,5,7,3,4,9,8,6,45,3423,233};
String myarr2[] = {
    "java",
    "php",
    "html",
    "c++",
    "css",
    "javascript"
};
System.out.println("The original array is :" + Arrays.toString(myarr) );
Arrays.sort(myarr);
System.out.println("The original array is :" + Arrays.toString(myarr) );
System.out.println("The original array is :" + Arrays.toString(myarr2) );
Arrays.sort(myarr2);
System.out.println("The original array is :" + Arrays.toString(myarr2) );

// sum of the to array
// int sum=0;
// int ave;
// int sum1[] = {3,4,5,6,7};
// for (int i = 0; i <= 5; i++)
//     sum = sum+i;
//     ave = (sum/5);
    

// System.out.println(ave);
     
            
    }
}
