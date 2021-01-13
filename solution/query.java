package solution;

import java.util.*;


public class query {
    
    public int find(String s1,String s2) {
        int count = 0;
        for (int i = 0; i + s2.length() <= s1.length();i++) {
            if (compare(s1.substring(i,i+s2.length()),s2)) count++;
        }        
        
        return count;
    }

    public boolean compare(String s1,String s2) {
        return helper(s1).equals(helper(s2));

    }

    public Map <Character,Integer> helper(String s1) {
        HashMap <Character,Integer> s1_char = new HashMap<>();
        for (int i = 0; i < s1.length();i++) {
            if (s1_char.containsKey(s1.charAt(i))) s1_char.replace(s1.charAt(i), s1_char.get(s1.charAt(i))+1);
            else s1_char.put(s1.charAt(i),1);
        }
        return s1_char;


    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        String[] mn = scanner.nextLine().split(" ");

        query check = new query();
        System.out.println(check.find(mn[0],mn[1]));
    }
}
