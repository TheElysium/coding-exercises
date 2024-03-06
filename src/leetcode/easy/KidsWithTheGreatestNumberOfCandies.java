package leetcode.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandyNbr = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj(c -> c + extraCandies >= maxCandyNbr).collect(Collectors.toList());
    }

}
