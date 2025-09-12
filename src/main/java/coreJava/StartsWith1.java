package coreJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class StartsWith1 {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(10);
        list.add(111);

        Thread th = new Thread();
        th.start();

        Executors.newFixedThreadPool(10);

        List<String> res = list.stream().map( i -> Integer.toString(i))
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());

        List<Integer> ans = res.stream().map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());

        ans.forEach(e -> System.out.println(e));
    }
}
