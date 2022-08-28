package com.bridgelabz;

public class SortedLinkedList {
    //Represent the head of the singly linked list
    Node head = null;

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            Node prev = head;
            if (data < head.data){
                Node temp = head;
                head = newNode;
                newNode.next = temp;
            }else{
                while(current != null && current.data < data){
                    prev = current;
                    current = current.next;
                }
                Node temp = prev.next;
                prev.next = newNode;
                newNode.next = temp;
            }

        }
    }

    public void displayLinkedList(){
        if (head == null)
            System.out.println("Linked list is empty");
        else{
            Node curr = head;
            while (curr != null){
                System.out.print(curr.data+" -> ");
                curr = curr.next;
            }
            System.out.println();
        }
    }

}
