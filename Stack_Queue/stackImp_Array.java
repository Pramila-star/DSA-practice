package Stack_Queue;

//import java.util.Stack;

class stackImp_Array {
    int[] arr;
    int top;
    int size;

    stackImp_Array(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push operation
     void push(int value){
        if (top == size -1) {
            System.out.println("Stack Overflow");
            return;
        }

        top ++;
        arr[top] = value;
    }

    // Pop operation
    int pop(){
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int removed = arr[top];
        top--;

        return removed;
    }

    // Peek operation
    int peek(){
        if(top ==-1){
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check empty
    boolean isEmpty(){
        return top == -1;
    }

    // Display stack
    void display(){
        for(int i = top; i>= 0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        stackImp_Array st = new stackImp_Array(5);

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top element: " + st.peek());

        System.out.println("Removed: " + st.pop());

        st.display();

    }
}
