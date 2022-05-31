package LinkedLists;

public class LinkedList<T> {

  private Node head;

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void add(T obj) {

        //make an object of LinkedLists.Node and connect them one by one
             if(head==null){
                 System.out.println("Head is null");
                 head=new Node();
                 head.setData(obj);
                 head.setNext(null);
             }
             else {
                 Node temp=head;

                 Node<T> node = new Node<>();
                 while(temp.getNext()!=null) {
                     temp=temp.getNext();
                 }

                 node.setData(obj);
                 node.setNext(null);
                 temp.setNext(node);
             }
    }


    public void printList(LinkedList<T> list){
        if(head==null){
            System.out.println("List Is Empty");
        }
        Node temp=head;
        System.out.print(temp.getData()+"-->");
        while(temp.getNext()!=null) {
            temp=temp.getNext();
            System.out.print(temp.getData()+"-->");
        }
        System.out.print("null");
    }

    public void delete(T obj){
        //

    }






}
