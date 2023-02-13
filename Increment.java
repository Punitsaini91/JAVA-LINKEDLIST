// 4 code 
package LikedLIst;

public class Increment {
    public static Node<Integer> CreateLinkedList(){
        Node<Integer> n1 =  new Node<>(10);
        Node<Integer> n2 =  new Node<>(20);
        Node<Integer> n3 =  new Node<>(30);
        Node<Integer> n4 =  new Node<>(40);
        n1.next =n2;
        n2.next = n3;
        n3.next = n4;
        return n1;

    }
    public static void Print(Node<Integer> head){
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();


    }
    public static void Increment(Node<Integer> head){
        // it will increment only 1st node because of head (in this to head address create 1st for increment and 2nd for main both indicate to print head )
        // head.data++;
        // for change all node 
        while(head!=null){
            System.out.print(head.data++);
            head=head.next;
        }
        System.out.println();



    }
    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList();
        Increment(head);
        Print(head);
        
    }
    
}
