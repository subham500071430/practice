package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test {
    public static void main(String[] args) {

        List<String> list2 = Arrays.asList("tree", "lamp", "milk");
        Map<String,Integer> map = list2.stream().collect(Collectors.toMap(Function.identity(),(s) -> s.length()));
        map.forEach((k,v) -> System.out.println(k+" "+v));

        list2.stream().distinct().collect(Collectors.toList());

        String[] str  = {
        "a", "b", "x",
        "hi", "on", "go",
        "cat", "sun", "red",
        "tree", "lamp", "milk",
        "apple", "grass", "stone"
         };
        groupStrings(str);

        List<Object> list = Arrays.asList(Arrays.asList(1,2,4),3,Arrays.asList(5,6));

        list.stream().flatMap(
                (obj) -> {
                    if(obj instanceof Integer)
                        return Stream.of((Integer) obj);
                    else if (obj instanceof List<?>)
                        return  (((List<?>) obj).stream().map( o -> (Integer)o));
                    else
                        return Stream.empty();
                }
        ).collect(Collectors.toList());
    }
    public static int findMaxConsecutiveOnes(int[] nums) {

          int i = 0, j = 0,res = 0,zero_count = 0;

          while(i < nums.length) {

                while(i < nums.length && zero_count < 2){
                      if(nums[i] == 0)
                         zero_count++;
                      if(zero_count < 2) {
                          res = Math.max(res,i-j+1);
                      }
                      i++;
                }

                while(j < nums.length && zero_count >1){
                      if(nums[j] == 0)
                          zero_count--;
                      j++;
                }

                if(zero_count <2)
                    res = Math.max(res,i-j+1);
          }

          return res;
    }

    public static void groupStrings(String[] str) {

           Map<Integer,Long> map =  Arrays.asList(str)
                   .stream()
                   .collect(Collectors.groupingBy(
                           String::length,
                           Collectors.counting()
           ));

           map.forEach((key,value) -> System.out.println(key + " " + value));
    }

    public static int minSubArraySumToTargetOrMore(int[] nums,int target) {

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while(i < nums.length) {

            sum+=nums[i];

            while(sum >= target){
                  min = Math.min(min,i-j+1);
                  sum -= nums[j];
                  j++;
            }

            i++;
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}