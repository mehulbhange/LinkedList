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
        SortedLinkedList linkedList = new SortedLinkedList();
        int ch;
        do{
            System.out.println("\n0.Exit \n1.Add node \n2.Display Linked list \n");
            ch = sc.nextInt();
            switch (ch){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    linkedList.addNode(56);
                    linkedList.addNode(30);
                    linkedList.addNode(40);
                    linkedList.addNode(70);
                    break;
                case 2:
                    linkedList.displayLinkedList();
                    break;
                default:
                    System.out.println("Invalid input!");

            }

        }while (ch != 0);

    }
}
