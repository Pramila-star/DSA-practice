package Stack_Queue;

class Node{    
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class StackImp_LL {
    Node top;

    void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    int pop(){
        if(top == null){
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = top.data;
        top = top.next;

        return removed;
    }

    int peek(){
        if(top== null){
            return -1;
        }

        return top.data;
    }

    void display(){
         Node temp = top;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

     public static void main(String[] args) {

        StackImp_LL st = new StackImp_LL();

        st.push(5);
        st.push(15);
        st.push(25);

        st.display();

        System.out.println("Popped: " + st.pop());

        st.display();

}
}