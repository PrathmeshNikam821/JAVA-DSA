public class LinkedList{
    public static class Node{
        int data ; 
        Node next ; 

        public Node(int data){
            this.data = data ;
            this.next = null ; 
        }
    }

    public static Node head ;
    public static Node tail ;

    //for size of linkedlist
    static int size = 0 ; 


    //add First
    public void addFirst(int data ){
        Node newNode = new Node(data);
        if(head == null){
            head=tail=newNode ;
             return ;
        }


        newNode.next = head ;
        head = newNode ; 
    }


    //add last

    public void addLast(int data){
        Node newNode = new Node(data);

        if(head == null){
            head=tail=newNode;
            return ;
        }


        tail.next = newNode ;
        tail = newNode ; 
    }

    //print LinkedList

    public void print(){
        Node temp = head ;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next; 

        }

        System.out.print("null");
    }


    // add in the middle

    //add(index , data)

    public void add(int idx , int data){

        if(head == null){
            addFirst(data);
            return ;
        }
        Node newNode = new Node(data);
        Node temp = head ;
        int i = 0 ;

        while(i<idx-1){
            temp = temp.next ;
            i++;
        }

        newNode.next = temp.next ;
        temp.next = newNode ;
    }

    //remove first 

    public int RemoveFirst(){
        int value = head.data;
        head = head.next ;
        return value ; 
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();

        ll.head = new Node(1);
        ll.head.next = new Node(2);

        ll.print();
    }

}