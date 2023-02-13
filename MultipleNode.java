package LikedLIst;

public class MultipleNode {
    public static Node<Integer> CreateLinkedList(){
        Node<Integer>n1=new Node<>(10);
        Node<Integer>n2=new Node<>(20);
        Node<Integer>n3=new Node<>(30);
        Node<Integer>n4=new Node<>(50);
        n1.next=n2;
        System.out.println("n1 "+n1+"  data  "+n1.data+"  nextaddress " +n1.next);
        n2.next=n3;
        System.out.println("n2 "+n2+"  data  "+n2.data+"  nextaddress " +n2.next);
        n3.next=n4;
        System.out.println("n1 "+n3+"  data  "+n3.data+"  nextaddress " +n3.next);
        System.out.println("n1 "+n4+"  data  "+n4.data+"  nextaddress " +n4.next);
        return n1;

    }
    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList();
    }

}
