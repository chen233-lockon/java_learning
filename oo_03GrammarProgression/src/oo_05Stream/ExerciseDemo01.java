package oo_05Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExerciseDemo01 {
    public static void main(String[] args) {
        List<String>list_male = new ArrayList<>();
        List<String>list_female = new ArrayList<>();
        list_male.add("张艺谋");
        list_male.add("冯小刚");
        list_male.add("王宝强");
        list_male.add("沈腾");
        list_male.add("韩寒");
        list_male.add("姜文");
        list_female.add("贾玲");
        list_female.add("林志玲");
        list_female.add("林允");
        list_female.add("林黛玉");
        list_female.add("刘亦菲");
        list_female.add("赵丽颖");
        Stream<String> male = list_male.stream().filter(actor -> actor.length() == 3).limit(2);
        Stream<String> female = list_female.stream().filter(actor -> actor.startsWith("林")).skip(1);
        List<Actor> listActors = Stream.
                concat(male, female).
                map(Actor::new)
                .toList();
        System.out.println(listActors);

    }
}
