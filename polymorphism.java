// import javax.print.attribute.standard.MediaSize.NA;



// class Pen{
    
    //     String color;
    //     String type;
    
    
    //     public void write(){
        //         System.out.println("Write Something");
        
        //     }
        //     public void printColor(){
            //         System.out.println(this.color);
            //     }
            
// }

class Student{
    String Id;
    int Rollno;
    String Name;
    
    // public void Apnacollage(){
        //     System.out.println("Apna Collage");
        
        // }
        public void toprint(String Name){
            System.out.println(Name);
        }
        public void toprint(int Rollno){
            System.out.println(Rollno);
        }
        public void toprint(String Name, int Rollno){
            System.out.println(Name +" "+ Rollno);//same function used for different purpose is known as polymorphism
        }
        
    }
    public class polymorphism {
    public static void main(String[] args){
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";
        // // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "red";

        // pen1.printColor();
        // pen2.printColor();


        // Student st = new Student("Abhishek", 13, "Nothing");
      
        // st.Name = "aman";
        // st.Rollno = 13;
        // st.Id = "Nothing Defind";
        // Student s2 = new Student(st);
        Student st = new Student();

        st.Id = "Nothing Defind";
        st.Rollno = 13;
        st.Name="Abhishek";
        st.toprint(st.Name,st.Rollno);

        // st.Apnacollage();
        // s2.toprint();
        // st.toprint();
         

    }
}





    



