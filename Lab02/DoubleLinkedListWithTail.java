package Lab02;

public class DoubleLinkedListWithTail{

    Node head = null;
    Node tail = null;
   
    boolean isEmpty(){
        if(head==null){
            return true;
        }else
            return false;
    }
   
    public void insertAtBeginning(String name){
        Node node = new Node(name);
        if(isEmpty()){
            head = node;
            tail = node;
        } else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
   
    public void insertAtBeginning(Node node){
        if(isEmpty()){
            head = node;
            tail = node;
        }else{
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
   
    public void insertAtEnd(String name){
        Node node = new Node(name);
        if(isEmpty()){
            head = node;
        }else{
            Node n = head;
            while(n!=null){
                if(n.next == null){
                    node.prev = n;
                    n.next = node;
                    break;
                }
                else {
                    n = n.next;
                }
            }
        }
    }
   
    public void insertAtEnd(Node node){
        if(isEmpty()){
            head = node;
        }else{
            Node n = head;
            while(n!=null){
                if(n.next == null){
                    node.prev = n;
                    n.next = node;
                    break;
                }
                else {
                    n = n.next;
                }
            }
        }
    }
   
    public void insertAfterName(String name, Node node){
       
            Node n = head;
            Node m =null;
           
            while(n.name != name){
                m = n;
                n = n.next;
            }
           
            Node t = m.next;
            m.next = node;
            n.prev = m;
            node.next = t;
             
        }

   
    public void insertBeforeName(String name, Node node){
    }
   
    public void makeCircular(){
    }
   
    public void printAll(){
        Node n = head;
        while(n!=null){
            System.out.println(n.name);
            n = n.next;
        }
    }
   
   
    public static void main(String[] args) {
        Node n1 = new Node("ABC");
        Node n2 = new Node("XYZ");
       
        DoubleLinkedList Dll = new DoubleLinkedList();
       
        Dll.insertAtBeginning(n1);
        Dll.insertAtBeginning(n2);
        Dll.insertAtBeginning("NPQ");
        Dll.insertAtEnd("EFG");
        Dll.insertAtBeginning("HIJ");
       
       
        Dll.printAll();
       
    }
   
}

class Node {
    String name;
    Node prev,next;
   
     Node(String name){
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}


