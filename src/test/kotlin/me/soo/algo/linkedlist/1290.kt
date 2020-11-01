package me.soo.algo.linkedlist

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

internal class `1290` {
    @Test
    fun test() {
        val list01 = ListNode(1).apply {
            next = ListNode(0).apply {
                next = ListNode(1)
            }
        }

        getDecimalValue(list01) shouldBeEqualTo 5
    }

    fun getDecimalValue(head: ListNode?): Int {
        return loop(head).toInt(2)
    }

    private tailrec fun loop(head: ListNode?, value: String = ""): String {
        if (head == null) return value

        val nodeValue = value + head.`val`
        val next = head.next ?: return nodeValue

        return loop(next, nodeValue)
    }
}
