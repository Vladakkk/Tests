package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    public static int maxNumberOfBalloons(String text){
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : text.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
         int maxInstances = Integer.MAX_VALUE;
        maxInstances = Math.min(maxInstances, charCount.getOrDefault('b', 0));
        maxInstances = Math.min(maxInstances, charCount.getOrDefault('a', 0));
        maxInstances = Math.min(maxInstances, charCount.getOrDefault('l', 0) / 2);
        maxInstances = Math.min(maxInstances, charCount.getOrDefault('o', 0) / 2);
        maxInstances = Math.min(maxInstances, charCount.getOrDefault('n', 0));

        return maxInstances;
    }

    public static void main(String[] args){
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(maxNumberOfBalloons("leetcode"));
    }
}
