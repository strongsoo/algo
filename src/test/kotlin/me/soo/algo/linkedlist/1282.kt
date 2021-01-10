package me.soo.algo.linkedlist

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

// https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
internal class `1282` {
    @Test
    fun test() {
        groupThePeople(intArrayOf(3, 3, 3, 3, 3, 1, 3)) shouldBeEqualTo mutableListOf(
            mutableListOf(0, 1, 2),
            mutableListOf(5),
            mutableListOf(3, 4, 6)
        )
    }

    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val groupList = mutableListOf<List<Int>>()
        val map = mutableMapOf<Int, MutableList<Int>>()

        groupSizes.forEachIndexed { i, v ->
            var group = map.getOrDefault(v, mutableListOf())
            group.add(i)

            if (group.size == v) {
                groupList.add(group)
                group = mutableListOf()
            }

            map[v] = group
        }

        return groupList
    }
}
