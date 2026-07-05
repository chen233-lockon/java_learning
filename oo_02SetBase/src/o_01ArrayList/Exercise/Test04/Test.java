package o_01ArrayList.Exercise.Test04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Movie m1 = new Movie("唐山大地震", "冯小刚", "灾难");
        Movie m2 = new Movie("羞羞的铁拳", "宋阳", "喜剧");
        Movie m3 = new Movie("集结号", "冯小刚", "历史");
        ArrayList<Movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        for (Movie movie : list) {
            if ("冯小刚".equals(movie.getDirector())) {
                System.out.println( movie);
            }
        }
    }
}
