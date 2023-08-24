import java.security.PublicKey;
import java.util.*;

public class Recursion {
    public static ArrayList<String>  gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> nres = new ArrayList<>();
        for(String rstr : nres){
            nres.add(" " + rstr);

        }
   for(String rstr : nres){
nres.add(ch + rstr);

}
return nres;
    }
       public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter the value of all the inputs");
    String str = scn.next();
    ArrayList<String> res = gss(str);
    System.out.println(res);
}
}

  


