package java8;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Q1 {

    public static void main(String[] args) {

        String s = "hello";


        String res = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList())
                .stream().collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream().sorted((e1, e2) ->
                        (int) (e2.getValue() - e1.getValue())).map(
                        (entry) -> {
                            String temp = "";
                            for (int i = 0; i < entry.getValue(); i++) {
                                temp += entry.getKey();
                            }
                            return temp;
                        }
                ).collect(Collectors.joining());

        System.out.println(res);
    }
}
