import java.util.*;
public class tut5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        //Butterfly pattern

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        
     
            System.out.println();
        }

            for (int i = n; i >= 1; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    
                }
                for (int j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                    
                }
                for (int j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            
         
                System.out.println();
                    
            
        }
    }
}
        // hollow solid Rhombus
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int j = 1; j <= m; j++) {
        //         if (i==n || j==m || i==1 || j==1) {
                    
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
                
        //     }
        //     System.out.println();
            
        // }
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i+" ");
                
        //     }
        //     System.out.println();
            
        // }
        //palindrome Pattern--------
    //     for (int i = 1; i <= n; i++) {
    //     for (int j = 1; j <= n-i; j++) {
    //       System.out.print(" ");       
    //   }
    //   for (int j = i; j >= 1; j--) {
    //       System.out.print(j);
          
    //   }
    //   for (int j = 2; j <= i; j++) {
    //       System.out.print(j);
          
    //   }
    //   System.out.println();
    // }
    // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n-i; j++) {
        //       System.out.print(" ");       
        //   }
        //   for (int j = i; j >= 1; j--) {
        //       System.out.print(j);
              
        //   }
        //   for (int j = 2; j <= i; j++) {
        //       System.out.print(j);
    // }
    // System.out.println();
        // }
    //     for (int i = 1; i <= n; i++) {
    //          for (int j = 1; j <= n-i; j++) {
    //            System.out.print(" ");       
    //        }
    //        for (int j = 1; j <= i; j++) {
    //            System.out.print("*");
        
    //        }
    //        for (int j = 2; j <= i; j++) {
    //            System.out.print("*");
    //        }
    //        System.out.println();
    //     }
    //     for (int i = n; i >= 1; i--) {
    //         for (int j = 1; j <= n-i; j++) {
    //           System.out.print(" ");       
    //       }
    //       for (int j = 1; j <= i; j++) {
    //           System.out.print("*");
       
    //       }
    //       for (int j = 2; j <= i; j++) {
    //           System.out.print("*");
    //       }
    //       System.out.println();
    //    }
       
    // }
    // }