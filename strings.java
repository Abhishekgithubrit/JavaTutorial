import java.util.*;

import javax.sound.midi.SysexMessage;
public class strings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();//input of strings
        // String name = "Abhishek";//stringdeclaration
        // System.out.println(name);
        //concataination-------
         String firstName = "tony";
          String lastName = "Stark";
         String fullName = firstName +" "+lastName;
         System.out.println(fullName);
         System.out.println(fullName.length());
        //length--------
        // charAt-----
         String sen = fullName.substring(0,4);
         System.out.println("The sen is   :" + sen);
        //  for(int i = 0; i<fullName.length(); i++){
              System.out.println(fullName.charAt(0));
            
                
        // //   .comapareTo========
        // if(fullName.compareTo(V)!=0){
        //     // System.out.println("strings are zero");
        //  }


        // }
        // strings builder-----------
        StringBuilder sb = new StringBuilder("tony");
        
        // System.out.println(sb)";
        System.out.println("The length is"+sb.length());
    
        //print at char 0
        // System.out.println(sb.charAt(0));
        System.out.println(sb.substring(0, 4));  
            //set char at ;
            // sb.append("e");
            // // System.out.println(sb);
            // sb.setCharAt(0, 'p');
            // // System.out.println(sb);
            // sb.insert(2, "s");v
            // System.out.println(sb);
//             sb.reverse();
//             System.out.println(sb);
// sb.delete(0, 2);
// System.out.println(sb);
        
            
    }
}
