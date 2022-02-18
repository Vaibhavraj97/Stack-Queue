package com.bridgelabz.LinkedList;

public class Create_LinkedListuc1 {
	
	 public static void main(String[] arg)
	    {
	        Create_LinkedListuc1 List = new Create_LinkedListuc1();
	        List.addAtStart(70);
	        List.addAtStart(30);
	        List.addAtStart(56);
	        List.display();
	    }
	static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void display()
    {
        Node current = head;

        if (head == null)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null)
        {
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void addAtStart(int newdata)
    {
        Node newNode = new Node(newdata);

        if (head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
}
