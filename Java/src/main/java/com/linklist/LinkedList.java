package com.linklist;

// https://github.com/dmlloyd/openjdk/blob/jdk8u/jdk8u/jdk/src/share/classes/java/util/LinkedList.java

import java.io.Serializable;

public class LinkedList<E> implements Serializable, Cloneable {

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }

    transient int size = 0;

    transient Node<E> first;

    transient Node<E> last;

    public LinkedList() {
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<E>(l, e, null);
        last = newNode;

        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }

        size++;
    }

    void linkBefore(E e) {
        final Node<E> pred = first;
        final Node<E> newNode = new Node<E>(null, e, pred);

        if (pred == null) {
            first = newNode;
        } else {
            newNode.next = first;
        }

        this.first = newNode;
        size++;
    }

    // ------------------------------------->|

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index <= size;
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size:" + size;
    }

    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
        return element;
    }

    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
            return x;
        }
    }

    // |<-------------------------------------
    // ------------------------------------->|

    public boolean add(E e) {
        linkLast(e);
//        linkBefore(e);
        return true;
    }

    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }

    public int indexOf(Object o) {
        int index = 0;
        if(o == null) {
            for(Node<E> x = first; x!= null; x = x.next) {
                if(x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for(Node<E> x = first; x!= null; x=x.next) {
                if(o.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }

        return -1;
    }

    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> x = node(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }

    // |<-------------------------------------
    // ------------------------------------->|

    public void display() {
        for (Node<E> a = this.first; a != null; a = a.next) {
            System.out.println(a.item);
        }
    }

    // |<-------------------------------------

    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Hello World");
        linkedList.add("Hello Python");
        linkedList.add("Hello Java");

        linkedList.remove(1);
        linkedList.display();
    }
}
