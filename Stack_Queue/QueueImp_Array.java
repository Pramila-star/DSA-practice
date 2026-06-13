package Stack_Queue;

class QueueImp_Array {
    int[] arr;
    int front;
    int rear;
    int size;

    QueueImp_Array(int size){
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int value){

        if (rear == size -1){
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        arr[rear] = value;
    }

    // Dequeue operation
    int dequeue() {

        if(front > rear){
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = arr[front];
        front++;

        return removed;
    }

    // Peek operation
    int peek(){

        if(front > rear){
            System.out.println("Queue is Empty");
            return -1;
        }

        return arr[front];
    }

    // Check empty
    boolean isEmpty(){
        return front > rear;
    }

    // display queue
    void display(){
        
        if(front > rear){
            System.out.println("Queue is empty");
            return ;
        }

        for(int i = front; i <= rear; i++){
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]){
          QueueImp_Array q = new QueueImp_Array(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        System.out.println("Front element: " + q.peek());

        System.out.println("Removed: " + q.dequeue());

        q.display();
    }
    
}
