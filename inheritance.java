import java.util.*;

import bank.*;

class shape{// inheritance means prooperty of one class taken by another class
String color;
public void area(){
    System.out.println("display area");
}
//There are four types of inheritance
//1. single leval inheritance-->one is the parent node and one child which use the property of base class
//2.multiple leval inheritance-->parent-parent.child(use the property of base class)-parent.child.child(use the property of parent.child)
//3. hierarical inheritance-parent-parent.child(use the property of base class)-parent.child.child(use the property of parent)
//4.hybrid inheritance-
}int l, int h
class Triangle extends shape{
public void area(int l, int h){
    System.out.println(1/2*l*h);
}
}
class circle extends shape{
public void area(int r){
    System.out.println((3.14)*r*r);
}


    // public void col(){
    //     System.out.println(this.color);
    // }
}



public class inheritance {
    public static void main(String[] args){
        // Triangle t1 = new Triangle();
        // t1.color = "red";
        // // t1.col();
        // t1.area();
    //    --using package // bank.Account account1 = new bank.Account();
        // account.name = "aman"
       
    }
    
}
