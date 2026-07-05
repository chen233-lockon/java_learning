package Stringbuilder;

public class StringBuilderExercise02 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(show(arr));
    }
    public static String show(int[] arr){
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            }else sb.append(arr[i]).append( ",");
        }
        return sb.toString();
    }
}
