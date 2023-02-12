import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();// class data for linked list is mentioned below that is Node class and Linked list class  
        l1.addAtLast(2);
        l1.addAtLast(5);
        l1.addAtLast(12);
        l1.addAtLast(2);
        l1.addAtLast(3);
        l1.addAtLast(5);
        l1.addAtLast(1);
        l1.addAtLast(2);
        l1.addAtLast(5);
        l1.addAtLast(5);
       Node ans = removeDuplicates(l1.head);
       Node temp = ans;
       while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
       }
       System.out.println("end");
    }
    public static Node removeDuplicates(Node head1){
        Node newHead = null;
        ArrayList<Integer> al = new ArrayList<>();
        Node temp = head1;
        while(temp!=null){
            if(al.contains(temp.data)){
                temp=temp.next;
                continue;
            }
            al.add(temp.data);
            temp=temp.next;
        }
       System.out.println(al);
       for (Integer integer : al) {
          Node n1 = new Node(integer);
          if(newHead==null){
            newHead = n1;
          }
          else{
            Node t1 = newHead;
            while(t1.next!=null){
                t1 = t1.next;
            }
            t1.next = n1;
          }
       }
        return newHead;
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