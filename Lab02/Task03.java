package Lab02;

public class Task03 {

    node head=null;

    void insertSingle(node n)
    {
        if(head==null)
        {
          head=n;
        }
    else{
        node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=n;
    }
    }
void displaySinglee()
{
  node curr=head;
  while(curr!=null)
  {
      System.out.print(curr.name+" ");
      curr=curr.next;
  }
}
void doublee(node n)
{
         if(head==null)
        {
          head=n;
        }
    else{
        node curr=head;
       // node back;
        while(curr.next!=null)
        {
           //back=curr;
            curr=curr.next;
        }
        curr.next=n;
        n.prev=curr;
    }
}
void display()
{
    node curr=head;
    while(curr!=null)
    {
    System.out.print(curr.name+" ");
    curr=curr.next;
}
}
public void checkCycleSinglee()
{
     boolean f=false;
  node curr=head;
  while(curr.prev!=null)
{
   curr=curr.next;
   if(curr.prev!=null)
   {
       f=true;
       break;
   }
   
   else {
       
   }
}
if(f==true){
System.out.println("There is a cycle");
}
else
{
    System.out.println("No cycle");
}
}

public void checkCycleDoublee()
{
    boolean f=false;
  node curr=head;
  while(curr.prev==null)
{
   curr=curr.next;
   if(curr.prev!=null)
   {
       f=true;
       break;
   }
   
   else {
       
   }
}
if(f==true){
System.out.println("There is a cycle");
}
else
{
    System.out.println("No cycle");
}
}

public static void main(String[] args)
{
  node node1 =new node("Tim");
  node node2 =new node("Bob");
  node node3 =new node("Alice");


}
}

    
}

class node{
    String name;
    node next;
    node prev;

    node(String name)
    {
        this.name=name;
        next=null;
        prev=null;
    }
}
