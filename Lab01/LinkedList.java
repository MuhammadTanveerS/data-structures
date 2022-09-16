package Lab01;

interface MyList<d>{
    public boolean isEmpty();
    public int size();
    public void add(d item);//(node item);
    public void add(d index,d item);//add(int index,node item);
    public void remove(int index);//remove(int index);
    public void remove(d item);//remove(node item);
    public MyList duplicate();
    public MyList duplicateReversed();
}


class LinkedList implements MyList<node>{
   public node head;
   public node curr=null;
   int size;
   public class node{
        int data;
        node next;
    }
      
   
    public boolean isEmpty()
      {
          if(head==null)
          {
              return true;
          }      
          else 
          return false;
    
    }
     
     
  public int size()
                        {

                        }
public void add(node item)
                      {

                      }
public void add(int index,node item)
                      {

                      }
     public void remove(node item)
     {

     }
    public MyList duplicate()
    {

    }
    public MyList duplicateReversed()
    {

    }
    // class a extends LinkedList{

    // }
        public static void main(String[] args)     
        {
            MyList obj=new LinkedList();
            boolean empty=obj.isEmpty();
            System.out.print(empty); 
                   }
}