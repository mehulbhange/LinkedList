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
                    "\n4.Delete first element \n");
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
                default:
                    System.out.println("Invalid input!");

            }

        }while (ch != 0);

    }
}
