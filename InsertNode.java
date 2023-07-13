// You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
//  Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
// Note :
// Assume that the Indexing for the singly linked list always starts from 0.

// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the linked list separated by a single space. 

// The second line contains the two integer values of 'data' and 'pos' separated by a single space, respectively
// Reminder/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
// For each test case, print the resulting singly linked list of integers in a row, separated by a single space.

// Output for every test case will be printed in a separate line.
//  Constraints :
// 1 <= t <= 10^2
// 0 <= N <= 10^5
// pos >= 0
// Time Limit: 1sec
// Sample Input 1 :
// 1
// 3 4 5 2 6 1 9 -1
// 3 100
// Sample Output 1 :
// 3 4 5 100 2 6 1 9
// Sample Input 2 :
// 2
// 3 4 5 2 6 1 9 -1
// 0 20
// 10 98 7 66 8 -1
// 5 99
// Sample Output 2 :
// 20 3 4 5 2 6 1 9
// 10 98 7 66 8 99 
package LikedLIst;

import java.util.Scanner;

public class InsertNode {

    public static Node<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next = currentNode;
                tail = currentNode;
            }
            data = sc.nextInt();
        }
        return head;

    }

    public static void PrintNode(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
        System.out.println();

    }

    public static Node<Integer> InsertingNode(Node<Integer> head, int pos, int element) {
        Node<Integer> nodetobeInseted = new Node(element);

        if (pos == 0) {
            nodetobeInseted.next = head;
            // head = nodetobeInseted;
            return nodetobeInseted;

        } else {
            Node<Integer> prev = head;
            int count = 0;

            while (count < pos - 1 && prev != null) {
                count++;
                prev = prev.next;
            }
            if (prev != null) {
                nodetobeInseted.next = prev.next;// new node connet next node address
                prev.next = nodetobeInseted;// previous node connect new node address

            }
            return prev;

        }

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = InsertingNode(head, 0, 34);
        System.out.println();
        PrintNode(head);

    }

}
