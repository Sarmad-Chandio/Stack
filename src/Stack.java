public class Stack {
    private Node top;
    private int height;
    public Stack(int value){
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }

    public void printStack() {
        Node temp=top;
        while (temp != null){
            System.out.println(temp.value);
            temp.next=temp;
        }
    }

    public void push(int value){
        //value= 2
        //if list is empty
        //push: big(O)= o(1)
        Node newNode= new Node(value);
        if (height==0){
            top=newNode;
        }else {
            Node temp=top;
            newNode.next=temp;
            top=newNode;
        }

        height++;
    }

    public Node pop(){

        //big(O)=o(1)
        if(height==0) return null;

        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }



    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
}
