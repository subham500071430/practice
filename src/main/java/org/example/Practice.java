package org.example;

public class Practice {

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hello";
        System.out.println(s1 == s2);  // False
// (1)
        System.out.println(s1 == s3); // True
// (2)
        System.out.println(s1.equals(s2)); // True

    }
}
