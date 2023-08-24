import java.util.*;
public class bitmanupulation{
    //GET BIT 
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos;
        // if((bitmask & n)==0){
        //     System.out.println("BIT IS ZERO");
        // }else{
        //     System.out.println("BIT IS ONE");
        // }
        // SET BIT
        // int newnumber = bitmask | n;
        // System.out.println("the newnumber is :"+ newnumber);
        // CLEAR BIT
        // int notbitmask = ~(bitmask);
        // int newnumber = notbitmask & n;
        // System.out.println(newnumber);
        // UPDATE BIT
        // for 1=And with Not operation
        // for 0 = And with NOt operation

        // int update = bitmask | n;//for 1 updation
        // System.out.println("The update bit is :"+ update);
        int update =bitmask & n;//for 0 updation
        int up = ~update;
        System.out.println("The update bit is :"+ up);


    }
}