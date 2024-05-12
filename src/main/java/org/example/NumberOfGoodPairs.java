package org.example;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums){
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int count : countMap.values()){
            goodPairs += count * (count - 1) / 2;
        }

        return goodPairs;
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        System.out.println(numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        System.out.println(numIdenticalPairs(nums3));
    }
}
