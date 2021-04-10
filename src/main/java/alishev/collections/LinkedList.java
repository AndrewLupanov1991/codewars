package alishev.collections;

import java.util.Arrays;

public class LinkedList {

    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            size++;
            return;

        }else {
            Node tmp = head;
            while (tmp.getNext()!=null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(value));
            size++;
        }
    }

    public int get(int index) {
        int counter = 0;
        Node tmp = head;
        while (tmp!=null) {
            if(counter==index) {
               return tmp.getValue();
            }else {
                tmp = tmp.getNext();
                counter++;
            }
        }
       throw new IllegalArgumentException();
    }

    public void remove(int index) {
        if(index == 0) {
            head = head.getNext();
            size--;
            return;
        }
        int counter = 0;
        Node tmp = head;
        while (tmp!=null) {
            if(counter + 1 == index) {
                tmp.setNext(tmp.getNext().getNext());
                size--;
                return;
            }else {
                tmp = tmp.getNext();
                counter++;
            }
        }
    }

    @Override
    public String toString() {
        int[] array = new int[size];
        int index = 0;
        Node tmp = head;
        while (tmp!= null) {
            array[index++] = tmp.value;
            tmp = tmp.next;
        }
        return Arrays.toString(array);
    }

    private static class Node {
       private int value;
       private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }



    }
}
