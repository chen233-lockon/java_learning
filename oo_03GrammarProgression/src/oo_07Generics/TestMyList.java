package oo_07Generics;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyArrayList<>();
        myList.add(1);
        Integer i = myList.get(0);
        System.out.println( i);
        Integer i1 = myList.set(0, 2);
        System.out.println( i1);
        Integer remove = myList.remove(0);
        System.out.println( remove);
        myList.add(3);
        System.out.println(myList);
    }
}
