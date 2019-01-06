package com.dianathedev;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by DianaGalvan on 1/5/19.
 */
public class RemoveDuplicatesTest {
    @Test
    public void allUnique() {
        int[] nums = {1, 2, 3};
        Assert.assertEquals(3, Solution.uniqueCount(nums));
    }

    @Test
    public void allTheSame() {
        int[] nums = {2, 2, 2, 2};
        Assert.assertEquals(1, Solution.uniqueCount(nums));
    }

    @Test
    public void oneTheSame() {
        int[] nums = {1, 1, 2};
        Assert.assertEquals(2, Solution.uniqueCount(nums));
    }
}
