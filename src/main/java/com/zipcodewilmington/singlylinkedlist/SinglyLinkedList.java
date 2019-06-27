package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<T extends Comparable<T>> {

    private SinglyLinkedListNode<T> firstNode;
    private Integer size;

    public SinglyLinkedList() {
        this.firstNode = null;
        this.size = o;
    }

    public void add(T) {
        SinglyLinkedList<T> node = new SinglyLinkedList<>();
        if (firstNode == null) {
            firstNode = node;
        } else {
            SinglyLinkedList<T> lastNode = firstNode;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(node);
        }
        size++;
    }

    public void remove(Integer index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        SinglyLinkedList<T> node = firstNode;
        SinglyLinkedList<T> previousNode = firstNode;

        Integer count = 1;
        while (count <= index) {
            previousNode.setNextNode(node.getNextNode());
            size--;
            return;
        }

        prevNode = node;
        count++;
    }

}

public Boolean contains(T) {
    return find(o) != -1;

}

public Integer size() {
    return size;
}

public void sort () {
    if (size<2) {
        return;
    }

    public SinglyLinkedList<T> copy(){
        SinglyLinkedList<T> list = new SinglyLinkedList<>();

        SinglyLinkedListNode<T> node = firstNode;

        while(node != null){
            list.add(node.getStoredObject());
            node = node.getNextNode();
        }
        return list;

}

//add -- add an element to the list
//        remove -- remove an element (specified by numeric index) from the list
//        contains -- returns true if the element is in the list, false otherwise
//        find -- returns the element's index if it is in the list, -1 otherwise
//        size -- returns the current size of the list
//        get -- returns the element at the specified index
//        copy -- returns a new linked list containing the same values (look up deep versus shallow copy)
//        sort -- sorts the list using your algorithm of choice. You must perform the sorting yourself (no fair using someone else's library)