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

    /*
    * method is used to delete the last element from the linked list
    * */
    public void deleteLastElement(){
        if (head == null)
            System.out.println("Linked list is empty!");
        else {
            Node current = head;
            if(head.next == null){
                head = null;
                return;
            }
            while (current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }
    /*
     * This method is used to find the node with the give value
     * It will return position of node if found
     * else it will return -1
     * */
    public int findNode(int data){
        int position = 0;
        if (head == null)
            return -1;
        else{
            Node current = head;
            while (current != null){
                if (current.data == data){
                    return position;
                }
                position++;
                current = current.next;
            }
            return -1;
        }
    }
    /*
     * This method is used to find the node with the give value
     * and delete that node
     * */
    public void deleteNode(int data){
        if (head == null)
            System.out.println("Linked list is empty!");
        else{
            Node current = head;
            Node prev = head;
            if (head.data == data){
                head = head.next;
                return;
            }
            while (current != null){
                if (current.data == data){
                    prev.next = current.next;
                    return;
                }
                prev = current;
                current = current.next;
            }
            System.out.println("node not found!");
        }
    }
    /*
    * This method is used to get the size of the linked list
    * */
    public int size(){
        Node current = head;
        int size = 0;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

}
