package org.example;

import java.util.*;

public class TopKElement {

    public static void main(String[] args) {
        // Example usage
        int[] result = helper();  // Call the static helper method
        System.out.println(Arrays.toString(result));
    }

    // Make helper method static
    public static int[] helper() {
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        // Just an example: You can insert logic here to populate the priority queue
        Map<Integer, Integer> data = new HashMap<>();
        data.put(1, 5);
        data.put(2, 3);
        data.put(3, 8);
        pq.addAll(data.entrySet());

        // For the sake of returning an array, assuming we're pulling the top element
        int[] result = new int[pq.size()];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = pq.poll().getKey();
        }

        return result;
    }
}
