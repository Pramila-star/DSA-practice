package Stack_Queue;

import java.util.Stack;

public class stack_file {
    public static void main(String args[]){
        Stack <Integer> stack = new Stack<>();

        stack.push(4);
        stack.pop();

         if (!stack.isEmpty()) {
            System.out.println(stack.peek());
        } else {
            System.out.println("Stack is empty");
        }

        stack.push(5);
        stack.push(6);
        stack.push(10);
        
        System.out.println("Size: " + stack.size());

        System.out.println("Top element: " + stack.peek());

        System.out.println(stack);
    }
    
}
