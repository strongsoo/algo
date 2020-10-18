package me.soo.algo.hash

import org.amshove.kluent.shouldBe
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/number-of-good-pairs/
 * https://leetcode.com/problems/number-of-good-pairs/submissions/
 */
internal class `1512` {

    @Test
    fun test() {
        numIdenticalPairs(intArrayOf(1, 2, 3, 1, 1, 3)) shouldBe 4
        numIdenticalPairsTwo(intArrayOf(1, 2, 3, 1, 1, 3)) shouldBe 4
        numIdenticalPairsTwo(intArrayOf(1,1,1,1)) shouldBe 6
    }

    // basic
    fun numIdenticalPairs(nums: IntArray): Int {
        var count = 0
        val size = nums.size

        for (i in 0 until size - 1) {
            val start = i + 1

            for (j in start until size) {
                if (nums[i] == nums[j]) {
                    count++
                }
            }
        }

        return count
    }

    // O(N)
    fun numIdenticalPairsTwo(nums: IntArray): Int {
        val numsArray = IntArray(101) { 0 }
        var sum = 0

        for (num in nums) {
            sum += numsArray[num]++
        }

        return sum
    }
}
