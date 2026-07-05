package oo_07Generics;

public interface MyList<E> {
    boolean add(E e);
    E get(int index);
    E remove(int index);
    E set(int index,E e);
}
