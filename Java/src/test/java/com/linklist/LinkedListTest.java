package com.linklist;


import org.junit.Test;

public class LinkedListTest {
    private LinkedList<String> linkedList = new LinkedList<String>();

    public void addSample() {
        linkedList.add("hello world");
        linkedList.add("hello python");
        linkedList.add("hello ruby");
    }

    @Test
    public void addTest() {
        linkedList.add("Hello Python");
        linkedList.add("Hello World");
        linkedList.add("Hello Ruby");
        linkedList.display();
    }

    @Test
    public void removeTest() {
        addSample();
        linkedList.display();

        System.out.println("-------------------");
        linkedList.remove(1);

        linkedList.display();
    }

    @Test
    public void indexOfTest() {
        addSample();
        int index = linkedList.indexOf("hello python");
        System.out.println(index);
    }

    @Test
    public void setTest() {
        addSample();
        String temp = linkedList.set(2, "Hello Kotlin");
        System.out.println(temp);
        System.out.println("-------------------");
        linkedList.display();
    }

    @Test
    public void getTest() {
        addSample();
        String temp = linkedList.get(2);
        System.out.println(temp);
    }
}
