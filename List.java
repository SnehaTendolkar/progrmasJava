package assigment;
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head; 

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }
}

public class List {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.push(9);
        llist.push(8);
        llist.push(27);
        llist.push(7);

        System.out.println("Created Linked List: ");
        llist.printList();

        llist.deleteNode(27);
        System.out.println("Linked List after Deletion of 1: ");
        llist.printList();
    }
}
