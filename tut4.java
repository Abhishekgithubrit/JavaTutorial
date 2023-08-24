import java.util.*;
public class tut4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
   //Q-1// solid rectegle ******---------------
                     //   ******
                     //   ******
       System.out.println("Enter the value of n");
      int n = sc.nextInt(); 
      int m = sc.nextInt();
    //   for (int i = 0; i <= n; i++) {
    //       for (int j = 0; j <=m; j++) {
              
          
    //       System.out.print("*");
    //       }
    //       System.out.println();  
    //   } 



    //Q-2 Hollow rectengle ****-------------
                      //   *  *
                        // ****


    //  for (int i = 0; i <= n; i++) {
    //      for (int j = 0; j <= m; j++) {
    //          if (i==n || j==m ||i==0 || j==0) {
    //              System.out.print("*");
                 
    //          }
    //          else{
    //              System.out.print(" ");
    //          }
            
    //      }
    //      System.out.println();  
    //  }


// Q3- HAlf pyrsmid *
                 // **
                 // *** 
    // for (int i = 0; i <=n; i++) {
    //     for (int j = 0; j <=i; j++) {
    //         System.out.print("*");
            
    //     }
    //     System.out.println();
        
    // }

// Q-4------------------>inverted half pyramid
    //   ****
     //  ***
     //  **
    
    
    // for (int i = n; i >=1; i--) {
    //          for (int j = 1; j <=i; j++) {
    //              System.out.print("*");
                
    //          }
            
    //         System.out.println();
    // }

    // --------->Q-5-- inverted half pyramid rotated by 180 deg

    // for (int i = 0; i <=n; i++) {
    //          for (int j = 0; j <=n-i; j++) {
                 
    //              System.out.print(" ");
          
    //          }
    //          for (int j = 0; j <= i; j++) {
                 
    //              System.out.print("*");
    //          }
            
    //         System.out.println();
    //         }

    // =========:>Q-6 half pyramid with number of increasing order
    // for (int i = 1; i <= n; i++) {
    //  for (int j = 1; j <= i; j++) {
    //      System.out.print(j+" ");
         
    //  }
    //  System.out.println();
        
    // }
  // =========>Q-7 half pyramid with number in reverse order of increasing order
//   for (int i = n; i >= 1; i--) {
//       for (int j = 1; j <= i; j++) {
//           System.out.print(j+" ");       
//       }
//       System.out.println();//    
//   }
// ---------------Q-9 floyds triangle with number of increasing order
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// int number = 1;
// for (int i = 1; i <= n; i++) {
//     for (int j = 1; j <= i; j++) {
//         System.out.print(number+" ");
//         number++;

        
//     }
//     System.out.println();
   
// }
// Q-9 0-1 triangle
for (int i = 1; i<=n; i++) {
    for (int j = 1; j <=i; j++) {
        if ((i+j)%2==0) {
            System.out.print("1"+" ");
        }
        else{
                System.out.print("0"+" ");
            
        }
    }
        System.out.println();
        
    
}
 
}
    
}
