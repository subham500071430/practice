package coreJava;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {
/*
        List<String> list = Arrays.asList("Apple", "Mango", "Banana", "Lichi");
        List<List<String>> list2 = Arrays.asList(Arrays.asList("Apple", "Mango"),Arrays.asList("Apple", "Mango", "Banana", "Lichi"));

        list.stream().map((a) -> a + " is a fruit").forEach(System.out::println);
        list2.stream().flatMap(List::stream)
                .collect(Collectors.toList()).forEach(System.out::println);

        List<String> list3 = Arrays.asList("Subham","Aman","","Amandeep","Prakash");
        list3.stream().filter( (s) -> !s.isEmpty()).forEach(System.out::println);

        Object[] obj = {1,2,3,new Object[]{4,5,6,new Object[]{7,8,9}}};

        List<Object> list = Arrays.asList(obj);

        list.stream().collect(Collectors.toMap(x -> x, x -> x));

        List<Person> people = Arrays.asList(
                new Person(1, "Alice"),
                new Person(2, "Bob"),
                new Person(3, "Charlie"),
                new Person(1, "Alice")
        );


        Map<Integer, String> personMap = people.stream()
                .collect(Collectors.toMap(
                        Person::getId,
                        Person::getName,
                        (name1, name2) -> name1  // handle duplicates
                ));

        personMap.forEach((id,name) -> System.out.println(id +" "+name));

        List<String> list3 = Arrays.asList("Subham","Ritik","Amandeep","Prakash","Subham");

        Map<String,Long> map = list3.stream()
                               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       // Map<String, List<String>> map ;
       // List<String> ;

        Map<String,List<String>> map1 = new HashMap<>();

        List<String> res = map1.values().stream().flatMap(List::stream).collect(Collectors.toList());

        map.forEach((a,b) -> System.out.println(a +" "+b));

        List<String> list1 = Arrays.asList("apple", "banana", "orange");
        List<String> list2 = Arrays.asList("banana", "kiwi", "apple");

        Stream.concat(list1.stream(),list2.stream()).distinct().toList();
        Stream<Integer> stream = Stream.of(1,2,3,4);

        List<String> list3 = Arrays.asList("Subham","Ritik","Amandeep","Prakash","Subham");

        Map<String,List<String>> map = list3.stream().collect(Collectors.groupingBy(Function.identity()));

        Map<Integer,List<String>> res = list3.stream().collect(Collectors.groupingBy(String :: length));

        // Write a Java 8 program to reverse a string using Stream API.
        String a = "subhamsubhsubh";

        String reversed = IntStream.rangeClosed(1,a.length()).mapToObj(
                i -> String.valueOf(a.charAt(a.length()-i))
        ).collect(Collectors.joining());


        Map<Character , Long> freq = a.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new , Collectors.counting()));

        Character ch = freq.entrySet().stream().filter((e) -> e.getValue() == 1).findFirst().get().getKey();

        System.out.println(ch);*/

        List<List<Integer>> list = Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4,5,6,7,8,9,10));

        List list4 = list.stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(list4);
    }
}

