package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int[] vowelsCount = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
                vowelsCount[i] = 1;
            }
            else {
                vowelsCount[i] = 0;
            }
        }
        // s = "abciiidef"
        // vowelsCount = [1,0,0,1,1,1,0,1,0]

        int maxVowels = 0;
        for(int i = 0; i < k; i++){
            maxVowels += vowelsCount[i];
        }

        int res = maxVowels;
        // k = 3
        // maxVowels = 1
        // i = 5
        for(int i = k; i<s.length(); i++){
            maxVowels += vowelsCount[i] - vowelsCount[i-k];
            if(maxVowels>res) res = maxVowels;
        }

        return res;
    }

/*    final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int maxVowels(String s, int k) {
        char[] sCharArray = s.toCharArray();
        int maxVowels = 0;
        for(int i = 0; i < k; i++){
            if(vowels.contains(sCharArray[i])) {
                maxVowels++;
            }
        }

        int res = maxVowels;
        for(int i = k; i<s.length(); i++){
            maxVowels += isVowel(sCharArray[i]);
            maxVowels -= isVowel(sCharArray[i-k]);
            if(maxVowels>res) res = maxVowels;
        }

        return res;
    }

    public int isVowel(char c){
        return this.vowels.contains(c) ? 1:0;
    }*/
}
