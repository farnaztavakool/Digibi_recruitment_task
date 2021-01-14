package solution;

import java.util.*;

public class query {

    /**
     * @param s1
     * @param s2
     * @return int
     */
    public int find(String s1, String s2) {

        if (s1.length() == 0 || s2.length() == 0 || s1.length() < s2.length()) return 0;

        int[] s1_map = helper(s1.substring(0, s2.length()));
        int[] s2_map = helper(s2);

        int count = 0;
        for (int i = 0; i + s2.length() <= s1.length(); i++) {
            if (compare(s1_map,s2_map))
                count++;
            int val = 'a';
            if (s1.charAt(i) < 'a') val = 'A'-26;
            s1_map[s1.charAt(i)-val]--;
            int j = i + s2.length();
            if (j < s1.length()) {
                val = 'a';
                if (s1.charAt(j) < 'a') val = 'A'-26;
                s1_map[s1.charAt(j)-val]++;
            }
        }

        return count;
    }

    /**
     * checks if two arrays are equal
     * 
     * @param s1,s2
     */

    public boolean compare(int[] s1, int [] s2) {
        for (int i = 0; i < s1.length;i++) {
            if (s1[i] != s2[i]) return false;
        }
         return true;

    }

    /**
     * fill an array with the number of occurrence of each alphabet in the string
     * 
     * @param s1
     * @return in[]
     */
    public int[] helper(String s1) {
        int[] chars = new int[52];
        Arrays.fill(chars, 0);
        
        for (int i = 0; i < s1.length(); i++) {
            int val = 'a';
            if (s1.charAt(i) < 'a') val = 'A'-26;
            chars[s1.charAt(i) - val]++;

        }
        return chars;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String[] mn = scanner.nextLine().split(" ");

        query check = new query();
        System.out.println(check.find(mn[0], mn[1]));
    }
}
