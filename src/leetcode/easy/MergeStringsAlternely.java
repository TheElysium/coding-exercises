package leetcode.easy;

// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class MergeStringsAlternely {
    public String mergeAlternately(String word1, String word2) {
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <lenWord1 || i < lenWord2; i++) {
            if(i < lenWord1) {
                sb.append(word1.charAt(i));
            }
            if(i < lenWord2) {
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
