package Stack_Queue;

class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
    }

}
class QueueImp_LL {

    Node front;
    Node rear;

    // Enqueue operation
    void enqueue(int value){
        Node node = new Node(value);

        if( rear == null){
            front = rear = node;
            return;
        }

        rear.next = node;
        rear = node;
    }

    // Dequeue operation
    int dequeue(){
        
        if(front == null){
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

         if (front == null) {
            rear = null;
        }

        return removed;
    }

    int peek(){

        if(front == null){
            return -1;
        }
        return front.data;

    }

    // Check empty
    boolean isEmpty(){
        return front == null;
    }

    // display queue
    void display(){

        if (front == null){
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;

        while(temp != null){
            System.out.println(temp.data +" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String args[]){
          QueueImp_LL q = new QueueImp_LL();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
    
}
