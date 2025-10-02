package dsa;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Parent {

    public void increment(int... args2) {


    }
}

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Apple","orange","banana","Umbrella");

        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        List<String> res = list.stream()
                .filter(s -> set.contains(s.toLowerCase().charAt(0)))
                .collect(Collectors.toList());

        res.forEach(System.out::println);
    }
}

class Employee {

      String name;
      int salary;
}

