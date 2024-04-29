package leetcode.medium;

// https://leetcode.com/problems/container-with-most-water/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        // Two pointers : left & right
        // max = 0
        // leftP = 0
        // rightP = height.lenght-1
        // while(leftP < rightP)
        // leftP = 1 & height[left] = 8
        // rightP = 8 & height[right] = 7
        // max =  min(8,7) * rightP-leftP = 7 * (8-1) = 49
        // if(height[leftP] >= height[rightP]) rightP --;
        // else leftP++
        // return max

        int leftP = 0;
        int rightP = height.length - 1;
        int res = 0;

        while (leftP < rightP) {
            int leftHeight = height[leftP];
            int rightHeight = height[rightP];
            int max = Math.min(leftHeight, rightHeight) * (rightP - leftP);

            if (max > res) res = max;

            if (leftHeight >= rightHeight) rightP--;
            else leftP++;
        }
        return res;
    }
}
