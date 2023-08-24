import java.util.List;

import javax.swing.JSpinner.ListEditor;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
import javax.xml.validation.Validator;

class node{
    int data;
    node next;


    node(int data){
        this.data = data;
        this.next = null;
    }
}

    class LL{
        node head;
        node tall;
        int size;

    
    void addfirst(int data){
        node t = new node(data);
        if(head==null){
            head = t;
return;

        }
        else{
            t.next = head;
            head = t;

        }
    }
    void addlast(int data){
        node t = new node(data);
        if(head==null){
            head =tall =  t;
            
        }else{
         tall.next = t;
         tall = t;

         }
        size++;
        }
     void removefirst(){
        if(size==0){
            System.out.println("List is empty");
        }else if(size==1){
            head=tall=null;
        }else{
            head = head.next;
            size--;
        }

    }

    //  public static int addhelper(node one, int pv1, node two, int pv2, LL res){
    //     if(one == null && two == null){
    //         return 0;
    //     }
    //     if(pv1 > pv2){
    //         int oc = addhelper(one.next, pv1-1, two, pv2, res);
    //      int   data = one.data + oc;
    //     }
    //    else if(pv1 < pv2){
    //          oc = addhelper(one, pv1, two.next, pv2-1, res);
        
    //    }
        
    //    else{
    //         int oc = addhelper(one, pv1, two.next, pv2-1, res);

    //     }
    //  }
    
     void getfirst(){
        if(size==0){
            System.out.println("list is empty");
            
        }   
        else{
            System.out.println("The data is " + head.data);
           
        
        }

     }

      void removelast(){
        if(size==0){
            System.out.println("List is empty");
        }else if(size==1){
            head=tall=null;
            size=0;
        }else{
          node temp = head;
          for(int i =0; i<size-2; i++){
            temp = temp.next;
          }
          tall = temp;
          temp.next = null;
          size--;
        }

     }
     void getlast(){
        if(size==0){
            System.out.println("list is empty");
            
        }   
        else{
            System.out.println("The data is " + tall.data);
           
        
        }

     }
     private node getAtnode(int idx){
        node temp = head;
        for(int i =0; i<idx; i++){
            temp = temp.next;
        }
        return temp;
     }

     void reverse(){
        int l = 0; 
        int r = size-1;
        while(l<r){
            node left = getAtnode(l);
            node right = getAtnode(r);

            int temp = left.data;
            left.data = right.data;
            right.data = temp;
            l++;
            r--;
        }
     }
     
void  getAt(int idx){
        if(size==0){
            System.out.println("list is empty");
            
        }else if(idx < 0 || idx>=size){
            System.out.println("invalid Argument");
        }else{
            node t = head;
            for(int i=0; i<idx; i++){
                t=t.next;

            }
            System.out.println(t.data);
        }
     }

     void AtIndex(int idx, int data){
        if(idx<0 || idx>size){
            System.out.println("Invalid argument");
        }
        else if(idx==0){
            addfirst(data);

        }else if(idx==size){
            addlast(data);
        }else{
            node t = new node(data);
            node temp = head;
            for(int i =0; i<idx; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
     }
    
     void reverseP(){
        node Node = new node(size);
        node prev = null;
        node curr = head;
        while(curr != null){
            Node.next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = Node.next;

        }
        node temp = head;
        head = tall;
        tall  = temp;
     }

     void removeAtIndex(int idx){
        if(idx < 0 || idx >= size){
            System.out.println("INvalid Arguments");
        }
        else if(idx==0){
            removefirst();
        }else if(idx == size-1){
            removelast();
        }else{
            node temp = head;
            for(int i =0; i<idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
     }

     void kthfromlast(int k){
        node s = head;
        node f = head;
        for(int i =0; i < k; i++){
            f = f.next;

        }
        while(f!=tall){
            f = f.next;
            s = s.next;
        }
        System.out.println(s.data);
     }
    
     void mid(){
        node s = head;
        node f = head;
        while(f!=null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        System.out.println(s.data);
     }

     void merge(LL list, LL list1){
        node one = list.head;
        node two  = list1.head;
        LL res = new LL();
        while(one != null && two!=null){
            if(one.data < two.data){
                res.addlast(one.data);
                one = one.next;
            }else{
                res.addlast(two.data);
                two = two.next;

            }while(one!=null){
                res.addlast(one.data);
                one = one.next;
            }
            while(two!=null){
                res.addlast(two.data);
                two = two.next;
            }
        }
        System.out.println(res);
    }
    void removeduplicate(){
        LL res = new LL();
      
        node temp = head;
        if(temp.data!=temp.next.data && temp!=null){
            res.addlast(temp.data);
            temp = temp.next;
        }
        this.head = res.head;
        this.tall = res.tall;
        this.size = res.size;
        
   }

    void print(){
        node t = head;
        while(t!=null){
            System.out.print(t.data + "->");
            t = t.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args)
        {
        LL list = new LL();
        LL list1 = new LL();
        LL list2 = new LL();
       

        // list.addfirst(12);
        // list.addfirst(20);
        // list.addfirst(30);
        // list.print();
        list.addlast(05);
        list.addlast(15);
        list.addlast(17);
        list.addlast(25);
        list.addlast(35);
        list.addlast(55);
        list.addlast(65);
        list.addlast(75);
        list.addfirst(10);
        list.print();
        System.out.println("The mid of the linked list is ");
        list.mid();
        list.print();
        //  System.out.println();
        //  list.removeduplicate();
        //  list.print();
        //  System.out.println();
        //  list1.addlast(23);
        //  list1.addlast(34);
        //  list1.addlast(65);
        //  list1.addlast(378);
        //  list1.addlast(67775);
        // list1.print();
      
        // list2.merge(list2, list1);

        // list2.print();
        // System.out.println();
        // list.kthfromlast(2);
        // list.mid();
        // list.print();
        // System.out.println();
        // System.out.println("After removing the first element of the linked list");
        // list.removefirst();

// /
        // list.getlast();
        // System.out.println();
        // list.AtIndex(6, 89);
        // list.print();
        // System.out.println();
        // list.reverse();
        // System.out.println("After the remove the  element");
        // list.removeAtIndex(0);
        // list.reverseP();
        // list.removelast();
        // list.print();
        // System.out.println("get at index");
        // list.getAt(2);
        // // list.print();
    }
}