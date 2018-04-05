package com.sequencelist;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    private ArrayList<String> arrayList = new ArrayList(10);

    public void addSample() {
        arrayList.add("hello world");
        arrayList.add("hello python");
        arrayList.add("hello ruby");
    }

    @Test
    public void addTest() {
        addSample();
        arrayList.display();
    }

    @Test
    public void removeTest() {
        addSample();
        arrayList.display();

        System.out.println("------");

        arrayList.remove("hello world");
        arrayList.display();

        System.out.println("------");

        System.out.println(arrayList.size());
        arrayList.remove(null);
        arrayList.display();
    }

    @Test
    public void indexOfTest() {
        addSample();
        int index = arrayList.indexOf("hello ruby");
        System.out.println(index);
    }

    @Test
    public void cloneTest() {
        addSample();
        ArrayList<String> cloneArray = (ArrayList<String>) arrayList.clone();
        System.out.println(cloneArray);
    }

    @Test
    public void getTest() {
        addSample();
        String temp = arrayList.get(2);
        System.out.println(temp);
    }

    @Test
    public void setTest() {
        addSample();
        arrayList.set(2, "hello Kotlin");
        arrayList.display();
    }

    @Test
    public void iteratorTest() {
        addSample();
        for (Iterator<String> iterable = arrayList.iterator(); iterable.hasNext(); ) {
            System.out.println(iterable.next());
        }

        Iterator<String> iterator = arrayList.iterator();
        iterator.next();  // hello world
        iterator.remove(); // hello world被删除
        /* 新创建的一个iterator与原来iterator对比 */
        assertEquals(arrayList.iterator().next(), iterator.next());
    }
}
