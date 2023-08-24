import javax.print.event.PrintJobAttributeEvent;
import javax.swing.plaf.synth.SynthStyleFactory;

class node{
    int data;
    node next;


    node(int data){
        this.data = data;
        this.next = null;
    }
}

    class linkedlist2{
        node head;
        node tall;
        int size;
    void addfirst(int data){
        node temp = new node(data);
        if(head == null){
            head = temp;
            return;
        }else{
           
            temp.next = head;
            head = temp;

        }
    }

    
    
//  void removeLast(){
//     if(size==0){
//         System.out.println("List is empty");
//     }else if(size==1){
//         head =tall = null;
//         size=0;
//     }else{
//         node temp = head;
//         for(int i =0; i <size-2; i++){
//             temp = temp.next;
//         }
//         tall  = temp;
//         temp.next  = null;
//         size--;
//     }
//  }

void reverse(){
    node curr = head;
    node prev = null;
    while(curr != null){
        node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    node temp = head;
    head = tall;
    tall = temp;
}
void merge(LL list, LL list1){
    node one = list.head;
    node two  = list1.head;
    LL res = new LL();
    while(one != null && two!=null){
        if(one.data <= two.data){
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
        System.out.println(res);
    }
}
 void print(){
    node t = head;
    while(t!=null){
        System.out.print(t.data + "->");
        t = t.next;
    }
    System.out.print("null");
}
    public static void main(String[] args){
        linkedlist2 list = new linkedlist2();
        list.addfirst(12);
        list.addfirst(13);
        list.addfirst(14);
        list.addfirst(15);
        list.print();
        //  list.removeLast();
        list.reverse();
        list.print();
    }
}