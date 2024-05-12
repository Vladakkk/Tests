package org.example;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {
    @Test
    public void testCountJewelsInStones(){
        Assert.assertEquals(3, JewelsAndStones.countJewelsInStones("aA", "aAAbbbb"));
        Assert.assertEquals(0, JewelsAndStones.countJewelsInStones("z", "ZZ"));
    }
}
