/*
Implementation of simple linked list
*/
class SimpleLinkedList{
  Node head;
 /*
As linked list definition it contain data and refernce to next node.
 */
  static class Node{
    // reference to next Node
    Node next;
    // data conatined by the node
    String data;

    /* Intialize the data and next node as intitally there is no head. so next node is assigned to null*/
    Node(String data){
      this.data=data;
      this.next=null;
    }

    @Override
    public String toString(){
       return "data conatined by this object:::: " +this.data+"\n"+ "and reference of the next node:::: "+this.next;
    }
  }


 /* traverse linked list*/
  public void printList(){
    Node n = head;
    while(n.next!=null){
      System.out.println(n.data+"  data of node");
      n = n.next;
    }
    System.out.println(n.data+"  data of node");
  }

public void addNode(Node nodeToBeAdded){
  Node head1 = head;
 if(nodeToBeAdded!=null){
   if(head1.next==null){
     head1.next=nodeToBeAdded;
   }
   else{
   while(head1.next!=null){
     head1=head1.next;
   }
   head1.next=nodeToBeAdded;
   }
 }
 else{
   System.out.println("node cannot be null");
 }
}

  public static void main(String... args){

    /*Create object of Node*/
    Node node1 = new Node("A");
    Node node2 = new Node("B");
    Node node3 = new Node("C");
    Node node4 = new Node("D");

    /* node1.data => conatins "A"
       node2.next => contains null
       node3 => show two types of output

       i) when you do not override toString method it will print a string which
          contains alphaneumeric representation of object which contains
          class name ,
          @ symbol and
          hexadecimal representation of the hashcode.
      ii) when you override toString method it will print content of the toString() method.
    */
    System.out.println(node1.data);
    System.out.println(node2.next);
    System.out.println(node3);
    System.out.println(node3.toString());

    //After successfully run this. Just comment toString() method and see the changes.

    //now add these nodes


    //create object of SimpleLinkedList and add all nodes with it one by one.
    SimpleLinkedList linkedList = new SimpleLinkedList();
    //set its head value to node1
    linkedList.head = node1;
    //set its next to node2
    linkedList.head.next = node2;
    //set its next to node3
    node2.next = node3;



    //printList
    System.out.println("************Before adding element************");
    linkedList.printList();
    linkedList.addNode(node4);
    System.out.println("************After adding element*************");
    linkedList.printList();



  }

}
