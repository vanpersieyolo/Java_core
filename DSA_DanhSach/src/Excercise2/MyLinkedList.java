package Excercise2;

public class MyLinkedList<E> {
    private Node head;
    int numberNode;

    public MyLinkedList(){
    }
    public  MyLinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index , Object data){
        Node tempp = head;
        Node holder;

        for (int i = 0; i < index -1 && tempp.next != null ; i++) {
            tempp = tempp.next;
        }
        holder = tempp.next;
        tempp.next  = new Node(data);
        tempp.next.next = holder;
        numberNode++;

    }

    public void addFirst(E e){
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }


    }


}
