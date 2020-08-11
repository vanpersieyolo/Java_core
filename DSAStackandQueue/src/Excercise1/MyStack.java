package Excercise1;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack myStack = new Stack();
        Stack myStack1 = new Stack();
        myStack.push("one");
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.push("five");
        System.out.println("mảng trước khi đảo ngược là : " + myStack);

        myStack1.push(myStack.peek());
        myStack.pop();
        myStack1.push(myStack.peek());
        myStack.pop();
        myStack1.push(myStack.peek());
        myStack.pop();
        myStack1.push(myStack.peek());
        myStack.pop();
        myStack1.push(myStack.peek());
        myStack.pop();
        System.out.println(" mảng sau khi đảo ngược là: "+myStack1);

    }
}
