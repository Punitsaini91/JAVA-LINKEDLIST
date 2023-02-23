package LikedLIst;

import java.util.Scanner;

public class TakeInput {
    public static Node<Integer> TakeInput() {

        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;

            } else {
                // Node<Integer> tail = head ;
                // while(tail.next!=null){
                //     tail=tail.next;

                // }
                // tail.next = currentNode;
                tail.next = currentNode;
                tail = currentNode;

            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printNode(Node<Integer> head) {
        while(head!=null){
            System.out.print(head.data);
            head=head.next;
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput();
        printNode(head);

    }

}
