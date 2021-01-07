package me.soo.algo.array

import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

internal class `728` {

    @Test
    fun test() {
        selfDividingNumbers(1, 22) shouldBeEqualTo listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22)
    }

    private fun selfDividingNumbers(left: Int, right: Int): List<Int> {
        return (left..right)
            .filter { isSelfDividingNumber(it) }
            .toList()
    }

    private fun isSelfDividingNumber(number: Int): Boolean {
        var numberValue = number

        while (numberValue != 0) {
            val dividingNumber = numberValue % 10

            if (dividingNumber == 0 || number % dividingNumber != 0) {
                return false
            }

            numberValue /= 10
        }

        return true
    }
}
