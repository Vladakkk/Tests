package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBalloonsTest {
    @Test
    public void testMaxNumberOfBalloons(){
        Assert.assertEquals(1, MaximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko"));
        Assert.assertEquals(2, MaximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon"));
        Assert.assertEquals(0, MaximumNumberOfBalloons.maxNumberOfBalloons("leetcode"));
    }
}
