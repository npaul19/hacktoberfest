public class LoopInLinkedList {
 
    static class Node {
        int key;
        Node next;
    };
 
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.next = null;
        return temp;
    }
 
    static void printList(Node head)
    {
        while (head != null) {
            System.out.print(head.key + " ");
            head = head.next;
        }
    }
  
    static Node detectLoop(Node head)
    {

        Node slow = head;
        Node fast=head;
        
        slow = slow.next;	
	      fast = fast.next.next;
	      while (ffast!=null && fast.next!=null) {
	          if (slow == fast)
	            break;
	          slow = slow.next;
	          fast = fast.next.next;
	      }
	      if (slow != fast)
	          return null;
	      slow = head;
	      while (slow != fast) {
	          slow = slow.next;
	          fast = fast.next;
	      }
	      return slow;
    }
 

    public static void main(String args[])
    {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        head.next.next.next.next = newNode(5);

        head.next.next.next.next.next = head.next.next;
 
        Node loopNode = detectLoop(head);
        if (loopNode!=null)
            System.out.println("Loop found at node "+loopNode.key);
        else
            System.out.println("No Loop Found");
    }
}
