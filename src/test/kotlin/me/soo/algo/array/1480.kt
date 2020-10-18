package me.soo.algo.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
internal class `1480` {

    @Test
    fun test() {
        runningSum(intArrayOf(1, 2, 3, 4)) shouldBeEqualTo intArrayOf(1, 3, 6, 10)
    }

    fun runningSum(nums: IntArray): IntArray {
        val size = nums.size

        for (i in 1 until size) {
            nums[i] = nums[i] + nums[i - 1]
        }

        return nums
    }
}
