import java.util.*;


class Pen{
    String color;
    String type;


    public void write(){
        System.out.println("Write Something");

    }
    public void printColor(){
        System.out.println(this.color);
    }
    
}

class Student{
    String Id;
    int Rollno;
    String Name;

    public void Apnacollage(){
        System.out.println("Apna Collage");

    }
    public void toprint(){
        System.out.println(this.Name);
        System.out.println(this.Id);
        System.out.println(this.Rollno);
    }
    Student(Student s2){//copy constructer
        // System.out.println("This is the constructer");
       this.Name = s2.Name;
       this.Rollno = s2.Rollno;
       this.Id = s2.Id;
    // Student(String name,int rollno, String id  ){//paramiterized constructer
    //     // System.out.println("This is the constructer");
    //     this.Name = name;
    //     this.Rollno = rollno;
    //     this.Id = id;
}
Student(){

}
}

public class oops {
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        // pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "red";

        // pen1.printColor();
        // pen2.printColor();


        // Student st = new Student("Abhishek", 13, "Nothing");
        Student st = new Student();
        st.Name = "aman";
        st.Rollno = 13;
        st.Id = "Nothing Defind";
        Student s2 = new Student(st);
        

        // st.Id = "Nothing Defind";
        // st.Rollno = 13;
        // st.Name="Abhishek";

        // st.Apnacollage();
        s2.toprint();
        // st.toprint();
   



    }
}
