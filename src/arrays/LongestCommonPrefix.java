package arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];

        String prefix = strs[0];
        for(int k=1; k<strs.length; k++) {
            String cur = strs[k];
            int i=0, j=0;
            while(i < prefix.length() && j < cur.length()) {
                if(prefix.charAt(i) != cur.charAt(j)) {
                    break;
                }
                i++;
                j++;
            }
            prefix = prefix.substring(0, j);
        }

        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"aaa", "aa", "aaa"}));
    }
}
