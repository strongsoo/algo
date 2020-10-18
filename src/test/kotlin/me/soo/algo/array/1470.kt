package me.soo.algo.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
internal class `1470` {

    @Test
    fun test() {
        shuffle(intArrayOf(2, 5, 1, 3, 4, 7), 3) shouldBeEqualTo intArrayOf(2, 3, 5, 4, 1, 7)
        shuffle(intArrayOf(1, 2, 3, 4, 4, 3, 2, 1), 4) shouldBeEqualTo intArrayOf(1, 4, 2, 3, 3, 2, 4, 1)
        shuffle(intArrayOf(1, 1, 2, 2), 2) shouldBeEqualTo intArrayOf(1, 2, 1, 2)
    }

    fun shuffle(nums: IntArray, n: Int): IntArray {
        val newNums = IntArray(nums.size)

        for (i in 0 until n) {
            val index = i * 2
            newNums[index] = nums[i]
            newNums[index + 1] = nums[n + i]
        }

        return newNums
    }
}
