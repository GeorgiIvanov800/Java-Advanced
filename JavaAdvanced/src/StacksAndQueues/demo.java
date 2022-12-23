package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>(); // create a stack
        // there are no indices in an ArrayDeque

        stack.push(13); // with 'push' we add some elements it the stack
        stack.push(42);
        stack.push(69);
        stack.push(73);

        //int stackElement = stack.pop(); // remove the element that is on the top of the stack

//        System.out.println(stackElement);
//        stackElement = stack.pop();
//
//        System.out.println(stackElement);
//        stackElement = stack.pop();
//
//        System.out.println(stackElement);
//        stackElement = stack.pop();

        while (!stack.isEmpty()) {      // remove and print elements from the stack until the stack gets empty
            int topElement = stack.pop();
            System.out.println(topElement);
        }
        int element = 42;
        //stack.contains(element);
        //stack.remove(element);

        for (Integer integer : stack) {
            System.out.println(integer);  // print the elements without removing them from the stack
        }

//        for (int i = 0; i < ; i++) {  will not work with normal for loop because the stack had no indices

        ArrayDeque<Integer> secondStack = new ArrayDeque<>();

        secondStack.push(23);
        secondStack.push(3);
        secondStack.push(23);
        secondStack.push(7);
        secondStack.push(23);
        secondStack.push(16);
        secondStack.push(23);
        secondStack.push(23);
        secondStack.remove(23); // this will remove only the first occurrence of the element which is given
        for (Integer integer : secondStack) {
            System.out.print(integer + " ");
        }

        System.out.println();

        secondStack.removeAll(Arrays.asList(23)); // this will remove all the given elements in the stack
        for (Integer integer : secondStack) {
            System.out.print(integer + " ");
        }

    }
}
