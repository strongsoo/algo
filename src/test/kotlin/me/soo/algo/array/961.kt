package me.soo.algo.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
internal class `961` {

    @Test
    fun test() {
        repeatedNTimes(intArrayOf(1, 2, 3, 3)) shouldBeEqualTo 3
        repeatedNTimes(intArrayOf(2, 1, 2, 5, 3, 2)) shouldBeEqualTo 2
        repeatedNTimes(intArrayOf(5, 1, 5, 2, 5, 3, 5, 4)) shouldBeEqualTo 5
    }

    fun repeatedNTimes(A: IntArray): Int {
        val counterArray = IntArray((A.size / 2) + 1) { 0 }

        A.forEachIndexed { _, v ->
            if (++counterArray[v - 1] >= 2) {
                return v
            }
        }

        return 0
    }
}
