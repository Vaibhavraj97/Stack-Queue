package com.bridgelabz.LinkedList;

public class Create_LinkedList {
	
	 public static void main(String[] arg)
	    {
	        Create_LinkedList List = new Create_LinkedList();
	        List.addAtStart(70);
	        List.addAtStart(30);
	        List.addAtStart(56);
	        List.insertAfter(List.head, 30);
	        List.search(30);
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
 
    
    public void insertAfter(Node preNode, int newdata)
    {
        if (preNode == null)
        {
            System.out.println("invalid");
            return;
        }
        Node newNode = new Node(newdata);
        newNode.next = preNode.next;
        preNode.next = newNode;
    }

    public void search(Integer data)
    {
        boolean flag = false;
        int i = 1;
        Node current = head;
        if (head == null)
        {
            System.out.println("empty");
        }
        while (current != null)
        {
            if (current.data == data)
            {
                System.out.println("found");
                flag = true;
                break;
            }
            i++;
            current = current.next;
        }
        if (flag)
        {
            System.out.println("element is present at:" + i);
        }
        else
        {
            System.out.println("element is absent");
        }
    }



}
