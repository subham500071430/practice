package dsa;

public class LargestSubstring {

    public static void main(String[] args) {

         int res = help("ababacb" , 3,0,6);
         System.out.println(res);
        // str = "aabbba", K = 3
    }

    public static int help(String s, int k, int start, int end) {

        if (start > end || end - start < k - 1) return 0;

        int[] freq = new int[26];

        for (int i = start; i <= end; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = start; i <= end; i++) {
            if (freq[s.charAt(i) - 'a'] != 0 && freq[s.charAt(i) - 'a'] < k) {
                return Math.max(help(s, k, start, i-1), help(s, k, i + 1, end));
            }
        }

        return end - start + 1;
    }
    
}
