package Excercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Mylist<E> {
    public int size = 0;
    public static int DEAULT_CAPACITY = 10;
    private  Object elements[] ;

    public Mylist(){
        elements = new Object[DEAULT_CAPACITY];
    }

    public Mylist(int capacity){
        elements = new Object[DEAULT_CAPACITY];
    }
    public void add (int index, E element){
        for (int i = size; i > index ; i--) {
            elements[i] = elements[i-1];
        }
        size ++;
        elements[index] = element;
    }
    public E remove (int index){
        Object holder = elements[index];
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i+1];

        }
        elements[size-1] = null;
        size--;
        return (E) holder;
    }
    public int size(){
        int count = 0;
        for (int i = 0; i <elements.length ; i++) {
            if (elements[i] != null){
                count++;
            }
        }
        return count;
    }  public Mylist<E> clone(){
        Object[] clone1 = elements;
        Mylist<E> e = new Mylist(elements.length);
        e.elements = clone1;
        e.size = size;
        return  e;
    }
    public boolean contains(E o){
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == o){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i] == o){
                return i;
            }
        }
        return -1;
    }
    public void ensureCapacityy(int minCapacity){
        if (size >= elements.length){
           Object[] elements1 = new  Object[minCapacity];
           System.arraycopy(elements,0,elements1,0,elements.length);
           elements = elements1;
        }
    }
//    public boolean add(E o){
//
//    }

    public E get(int i){
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i < elements.length ; i++) {
            elements[i] = null;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements) +" ";

    }


}
