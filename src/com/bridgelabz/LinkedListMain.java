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
            System.out.println("\n0.Exit \n1.Add node at start \n");
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
            }

        }while (ch != 0);

    }
}
