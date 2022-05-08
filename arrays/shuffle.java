package arrays;
/*
1470. Shuffle the Array
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
*/

public class shuffle {
    static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];

        for(int i = 0; i<n;i++){
            res[2*i] = nums[i];
            res[2*i + 1] = nums[i+1];

        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}
