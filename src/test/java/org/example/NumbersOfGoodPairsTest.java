package org.example;

import org.junit.Assert;
import org.junit.Test;

public class NumbersOfGoodPairsTest {
    @Test
    public void testNumIdenticalPairs(){
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        Assert.assertEquals(4, NumberOfGoodPairs.numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        Assert.assertEquals(6, NumberOfGoodPairs.numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        Assert.assertEquals(0, NumberOfGoodPairs.numIdenticalPairs(nums3));
    }
}
