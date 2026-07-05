package oo_07Generics;

import java.util.Arrays;

public class MyArrayList<E> implements  MyList<E>{
private final Object[] elementData = new Object[1];
    @Override
    public boolean add(E e) {
        elementData[0] = e;
        return true;
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E remove(int index) {
        Object o = elementData[index];
        elementData[index] = null;
        return (E)o;
    }

    @Override
    public E set(int index, E e) {
//        拿到老数据
        Object o = elementData[0];
        elementData[0] = e;
        return (E) o;
    }

    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(elementData) +
                '}';
    }
}
