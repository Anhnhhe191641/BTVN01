/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author ADMIN
 */
public class SinglyLinkedList {
    ListNode head;
    ListNode tail;
    static int size;
    public SinglyLinkedList(){
        head = tail = null;
        size = 0;
    }
    public void addLast(int data){
        ListNode newNode = new ListNode(data);
        if(tail == null){
            head = tail = newNode;
        }
        else{
            tail.next=newNode;
            tail = newNode;
        }
        size++;
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
