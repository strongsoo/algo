package me.soo.algo.hash

import org.amshove.kluent.shouldBe
import org.junit.jupiter.api.Test

/**
 * https://leetcode.com/problems/jewels-and-stones/
 * https://leetcode.com/problems/jewels-and-stones/submissions/
 */
internal class `771` {

    @Test
    fun test() {
        numJewelsInStones("aA", "aAAbbbb") shouldBe 3
        numJewelsInStonesTwo("aA", "aAAbbbb") shouldBe 3
    }

    // simple
    fun numJewelsInStones(J: String, S: String): Int {
        return S.count { J.contains(it) }
    }

    // hash
    fun numJewelsInStonesTwo(J: String, S: String): Int {
        val map = J.map { it to 0 }.toMap(mutableMapOf())

        S.forEach {
            map[it]?.let { value -> map[it] = value + 1 }
          }

        return map.values.sum()
    }
}
