package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        // - add 4 as the first element of the list
        // - then add 5, 6, 8, 2, 9 to the list
        // - add another 2 as the last element of the list
        // - add 4 as the 3rd element of the list
        // - invoke the method element() on the list and print the result on the screen
        // - return the list
        // throw new RuntimeException("Not implemented");
        LinkedList<Integer> integer = new LinkedList<>();
        integer.addFirst(4);
        integer.add(5);
        integer.add(6);
        integer.add(8);
        integer.add(2);
        integer.add(9);
        integer.addLast(2);
        integer.add(2, 4);
        System.out.println(integer.element());

        return integer;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        // - add 5, 6, 8, 9 to the stack
        // - print the first element of the stack on the screen
        // - print the last element of the stack on the screen
        // - invoke the method pop() on the stack and print the result on the screen
        // - invoke the push(4) method on the stack
        // - return the stack
        // throw new RuntimeException("Not implemented");
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        System.out.print(stack.getFirst());
        System.out.print(stack.getLast());
        System.out.print(stack.pop());
        stack.push(4);
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        // - add 5, 6, 8, 9 to the queue
        // - print the first element of the queue on the screen
        // - print the last element of the queue on the screen
        // - invoke the method poll() on the queue and print the result on the screen
        // - invoke the element() method on the queue and print the result on the screen
        // - return the queue
        // throw new RuntimeException("Not implemented");
        // Stack<Integer> stack = new Stack<>();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);
        System.out.print(deque.getFirst());
        System.out.print(deque.getLast());
        System.out.print(deque.poll());
        System.out.print(deque.element());
        return deque;
    }

    public HashMap<Integer, String> useHashMap() {

        // TODO: create an empty hash map
        // - add {1, TypeScript} entry to the map
        // - add {2, Kotlin} entry to the map
        // - add {3, Python} entry to the map
        // - add {4, Java} entry to the map
        // - add {5, JavaScript} entry to the map
        // - add {6, Rust} entry to the map
        // - determine the set of keys from the map and print it on the screen
        // - determine the set of values from the map and print it on the screen
        // - determine whether the map contains "English" as a language and print the
        // result on the screen
        // - return the map
        // throw new RuntimeException("Not implemented");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");
        System.out.print(map.keySet());
        System.out.print(map.values());
        System.out.print(map.containsValue("English"));
        return map;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
