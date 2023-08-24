import java.util.*;

public class GETSEBSEQUENCES {

    // public static ArrayList<String> gss(String str){
    //     if(str.length()==0){
    //         ArrayList<String> bres = new ArrayList<>();
    //         bres.add ("");
    //         return bres;
    //     }
    //     char ch = str.charAt(0);
    //     String ros = str.substring(1);
    //     ArrayList<String> rres = gss(ros);
    //     ArrayList nres = new ArrayList<>();
    //     for(String rstr : rres){
    //         nres.add("" + rstr);
    //     }
    //     for(String rstr : rres){
    //         nres.add(ch + rstr);
    //     }
    //     System.out.println(nres);

            
    //   return nres;

    //      }"
    //@_________________keypad combination
    // static String[] codes = {";", "abc", "def", "ghi", "jkl", "mno ", "pqrs", "tu", "vwx", "yz"};
    // public static ArrayList<String> gkc(String str){
    //     if(str.length()==0){
    //         ArrayList<String> bres = new ArrayList<>();
    //         bres.add ("");
    //         return bres;
    //     }
    //     char ch = str.charAt(0);
    //     String ros = str.substring(1);

    //     ArrayList<String> rres = gkc(ros);
    //     ArrayList nres = new ArrayList<>();

    //     String codeforch = codes[ch - '0'];
    //     for(int i =0; i<codeforch.length(); i++){
    //         char chcode = codeforch.charAt(i);
        
       
    //     for(String rstr : rres){
    //         nres.add(chcode + rstr);
        
    //     }
    // }
    //     System.out.println(nres);

            
    //   return nres;
        
    //      }
    //@------------get Stairs path

    public static ArrayList<String> gsp(int n){
        if(n==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = gsp(n-1);
        ArrayList<String> path2 = gsp(n-2);
        ArrayList<String> path3 = gsp(n-3);
        ArrayList<String> paths = new ArrayList<>();
        for(String path : path1){
            paths.add(1 + path);
        }
        for(String path : path2){
            paths.add(2 + path);
        }
        for(String path : path3){
            paths.add(3 + path);
        }
        System.out.println(paths);
        return paths;
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of the string");
    // String str = sc.nextLine();
    // ArrayList <String> res =  gss(str);
    // System.out.println(res);
    //  String str = sc.nextLine();
    //  ArrayList <String> words =  gkc(str);
    //  System.out.println(words);
    
    //  String str = sc.nextLine();
     int n = sc.nextInt();
     ArrayList <String> SP =  gsp(n);
     System.out.println(SP);
    
}
}

  



