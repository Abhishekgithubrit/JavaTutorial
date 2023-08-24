import java.util.*;
public class prac{
 
  
  public static void main(String[] args){
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number of n, m ,p");
    // int x=sc.nextInt();//for finding power
    //  int num=sc.nextInt();
    //  int result =1;
    //  //Fibbonacci series
  //  int item=0;
  //  System.out.println(item);
  //  int item1 =1; 
  //  System.out.println(item1);

   
  //  for (int i = 2; i <=n; i++) {
  //    int item3=item+item1;
  //    System.out.println(item3);
  //    item = item1;
  //    item1 = item3;

  //  } 
  // reverse of any number
  // int reverse=0;
  // int temp= num;
  // int remainder=0;
  // while(temp>0){
  // remainder = temp%10;
  // reverse = reverse*10+remainder;
  // temp/=10;

  // }
  // System.out.println(reverse);
  // for power of the value
//   for (int i = 1; i <= num; i++) {
//     result= result*x;
//     System.out.println(result);

    
//   }
//   }
// }
int nums[] = {1, 2 ,3 ,4};
int sum = 0;
for (int index = 1; index < nums.length+1; index++) {
  sum = sum+index;
// nums[index] = sum;
System.out.println(sum);
}
  }
}