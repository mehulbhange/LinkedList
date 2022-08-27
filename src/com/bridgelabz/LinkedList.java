package com.bridgelabz;

public class LinkedList {

    //Represent the head and tail of the singly linked list
    Node head = null;
    Node tail = null;


    public void createLinkedList(){
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;
    }

    public void displayLinkedList(){
        if(head == null)
            System.out.println("Linked list is empty!");
        else{
            Node current = head;
            while (current != null){
                System.out.print(current.data+" -> ");
                current = current.next;
            }

        }
    }

    public void addNodeAtStart(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            newNode.next = null;
        }else{
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }

    public void addNodeAtEnd(int data){
        Node newNode = new Node(data);
        if ( head == null){
            head = newNode;
            tail = newNode;
            newNode.next = null;
        }else{
            tail.next = newNode;
            newNode.next =null;
            tail = tail.next;
        }
    }

    public void addInBetween(int index, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(index == 0)
            addNodeAtStart(data);
        else{
            Node current = head;
            Node prev = head;
            for(int i=0;i < index; i++){
                prev = current;
                current = current.next;
                if (current == null){
                    addNodeAtEnd(data);
                    return;
                }
            }
            Node temp = prev.next;
            prev.next = newNode;
            newNode.next = temp;
        }
    }

    public void deleteFirstElement(){
        if (head == null)
            System.out.println("Linked list is empty!");
        else {
            head = head.next;
        }
    }


}
