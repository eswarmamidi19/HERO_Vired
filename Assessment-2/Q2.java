import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        l1.addAtLast(25);
        l1.addAtLast(35);
        l1.addAtLast(12);
        l1.addAtLast(4);
        l1.addAtLast(36);
        l1.addAtLast(48);
        l1.display();
        l2.addAtLast(8);
        l2.addAtLast(32);
        l2.addAtLast(22);
        l2.addAtLast(45);
        l2.addAtLast(63);
        l2.addAtLast(49);
        l2.display();
     mergeAndsort(l1.head, l2.head);
    }
    public static void mergeAndsort(Node h1,Node h2){
        Node temp = h1;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=h2;
        Node t = h1;
        ArrayList<Integer> al = new ArrayList<>();
        while(t!=null){
            al.add(t.data);
            t = t.next;
        }
        t = h1;
        Collections.sort(al);
        int i=0;
        while(t!=null){
            t.data = al.get(i);
            t = t.next;
            i++;
        }
        t =h1;
        while(t!=null){
            System.out.print(t.data+"  ");
            t = t.next;
        }
        
        return ;
    }
}

class Node{
      int data;
      Node next;
      Node(int data){
        this.data = data;
      }
}

class LinkedList{
      Node head;
      int size = 0;
      LinkedList(){
        size =0;
        this.head =null;
      }
      public void addAtLast(int data){
           Node n1 = new Node(data);
           if(head==null){
              head = n1;
              return;
           }
           Node temp=head;
           while(temp.next!=null){
               temp = temp.next;
           }
           temp.next = n1;
      }
      public void display(){
           Node temp = head;
           while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
           }
           System.out.println("end");
      }

}