package com.bridgelabz;

import java.util.Scanner;

/**
 * Purpose - Linked list Operations
 * @author - Mehul Bhange
 * @since - 27-08-2022
 */
public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to linked list problem");
        Scanner sc = new Scanner(System.in);

        int ch;
        do{
            System.out.println("\n0.Exit \n1.Add node at start \n2.Add node at end \n3.Add node in between" +
                    "\n4.Delete first element \n5.Delete last element \n6.Find node" +
                    "\n7.Insert after a particular value");
            ch = sc.nextInt();
            switch (ch){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    LinkedList linkedList = new LinkedList();
                    linkedList.addNodeAtStart(70);
                    linkedList.addNodeAtStart(30);
                    linkedList.addNodeAtStart(56);
                    linkedList.displayLinkedList();
                    break;
                case 2:
                    LinkedList linkedList1 = new LinkedList();
                    linkedList1.addNodeAtEnd(56);
                    linkedList1.addNodeAtEnd(30);
                    linkedList1.addNodeAtEnd(70);
                    linkedList1.displayLinkedList();
                    break;
                case 3:
                    LinkedList ll2 = new LinkedList();
                    ll2.addNodeAtEnd(56);
                    ll2.addNodeAtEnd(70);
                    ll2.displayLinkedList();
                    System.out.println();
                    ll2.addInBetween(1,30);
                    ll2.displayLinkedList();
                    break;
                case 4:
                    LinkedList ll3 = new LinkedList();
                    ll3.addNodeAtEnd(56);
                    ll3.addNodeAtEnd(30);
                    ll3.addNodeAtEnd(70);
                    ll3.displayLinkedList();
                    System.out.println();
                    ll3.deleteFirstElement();
                    ll3.displayLinkedList();
                    break;
                case 5:
                    LinkedList ll4 = new LinkedList();
                    ll4.addNodeAtEnd(56);
                    ll4.addNodeAtEnd(30);
                    ll4.addNodeAtEnd(70);
                    ll4.displayLinkedList();
                    System.out.println();
                    ll4.deleteLastElement();
                    ll4.displayLinkedList();
                    System.out.println();
                    break;
                case 6:
                    LinkedList ll5 = new LinkedList();
                    ll5.addNodeAtEnd(56);
                    ll5.addNodeAtEnd(30);
                    ll5.addNodeAtEnd(70);
                    int x = ll5.findNode(30);
                    if ( x == -1)
                        System.out.println("Not found!");
                    else
                        System.out.println("Found at position "+x);
                    break;
                case 7:
                    LinkedList ll6 = new LinkedList();
                    ll6.addNodeAtEnd(56);
                    ll6.addNodeAtEnd(30);
                    ll6.addNodeAtEnd(70);
                    ll6.displayLinkedList();
                    System.out.println();
                    int position = ll6.findNode(30);
                    if ( position == -1)
                        System.out.println("Not found!");
                    else
                        ll6.addInBetween(position+1, 40);
                    ll6.displayLinkedList();
                    break;
                default:
                    System.out.println("Invalid input!");

            }

        }while (ch != 0);

    }
}
