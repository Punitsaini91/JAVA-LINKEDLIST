// 3 code
package LikedLIst;


public class PrintNode {
    public static Node<Integer> CreateLinkedList(){
        Node<Integer>n1=new Node<>(10);
        Node<Integer>n2=new Node<>(20);
        Node<Integer>n3=new Node<>(30);
        Node<Integer>n4=new Node<>(50);
        n1.next=n2;
        // System.out.println("n1 "+n1+"  data  "+n1.data+"  nextaddress " +n1.next);
        n2.next=n3;
        // System.out.println("n2 "+n2+"  data  "+n2.data+"  nextaddress " +n2.next);
        n3.next=n4;
        // System.out.println("n1 "+n3+"  data  "+n3.data+"  nextaddress " +n3.next);
        // System.out.println("n1 "+n4+"  data  "+n4.data+"  nextaddress " +n4.next);
        return n1;

    }
    public static void Print(Node<Integer> head){
        // this is the wrost way to print the data because of so much chaninig happens.

        // System.out.println(head.data);
        // System.out.println(head.next.data);
        // System.out.println(head.next.next.data);

        // better method to print data

        // while(head!=null){
        //     System.out.println(head.data);
        //     head=head.next;
        // }
        
        // if we want to print the data in one line then it is used and to run it first while loop in disenabled because above while love do head null
        // because if we use to while loop in print togeter then only first loop run because of head become null to ovecome this we put head in another temp variable 
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();
        



    }
    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList();
        Print(head);
        System.out.println();
        // if we pass the next node address it will print the next node data
        Print(head.next);
    }
    
}
