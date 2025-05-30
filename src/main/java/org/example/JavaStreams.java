package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
/*
        List<Integer> list = Arrays.asList(1,3,4,5,6,12,14,17,19,20);
        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        List<Integer> myList = Arrays.asList(10,15,8,49,25,18,10);
        myList.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(System.out::println);*/

        List<Integer> findDuplicates = Arrays.asList(10,15,8,49,25,98,98,32,15);

        HashSet<Integer> hs = new HashSet<>();

        //findDuplicates.stream().filter(n -> !hs.add(n)).forEach(System.out::println);

        //findDuplicates.stream().distinct().forEach(System.out::println);
/*
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max =  myList.stream()
                .max(Integer::compare)
                .get();

        myList.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);
        //System.out.println(max);*/

        List<Student> list = new ArrayList<>();
        list.add(new Student("Prakash",78,"M"));
        list.add(new Student("Subham",87,"M"));
        list.add(new Student("Naina",46,"F"));
        list.add(new Student("Shruti",74,"F"));

        list.stream().sorted(
                (s1,s2) -> {
                    if(s1.gender != s2.gender){
                        return s1.gender.equals("F") ? -1 : 1;
                    }
                    return s2.marks - s1.marks;
                }
        ).forEach((s) -> System.out.println(s.name));
    }
}

class Student{

       String name;
       int marks;
       String gender;

       public Student(String name,int marks,String gender){
              this.name = name;
              this.marks = marks;
              this.gender = gender;
       }
}


