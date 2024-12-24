package LinkedList;

public class Linkedlist_creation {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        Node newNode = head;
        if (newNode == null){
            System.out.println(" List is empty ");
        }
        while(newNode != null){
            System.out.print(newNode.data + " -> ");
            newNode = newNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Linkedlist_creation ll = new Linkedlist_creation();
        ll.addFirst("PANKAJ");
        ll.addFirst(" 1 : ");
        ll.addLast("Dhurandher");
        ll.printList();
        System.out.println();
        Linkedlist_creation lll = new Linkedlist_creation();
        lll.printList();
    }

}
