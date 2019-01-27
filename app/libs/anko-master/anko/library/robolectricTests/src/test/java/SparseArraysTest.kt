package com.example.android_test

import android.util.SparseArray
import android.util.SparseBooleanArray
import android.util.SparseIntArray
import org.jetbrains.anko.collections.forEach
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config


@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class)
public class SparseArraysTest {

    @Test
    fun testGenericForEachRandomNumbers() {
        val sa = SparseArray<String>()

        sa.put(2, 2.toString())
        sa.put(8, 8.toString())
        sa.put(5, 5.toString())
        sa.put(10, 10.toString())
        sa.put(7, 7.toString())
        sa.put(4, 4.toString())
        sa.put(9, 9.toString())
        sa.put(1, 1.toString())
        sa.put(3, 3.toString())
        sa.put(6, 6.toString())

        var invokeCount = 0
        sa.forEach { k, v ->
            invokeCount++
            Assert.assertEquals(k.toString(), v)
        }

        Assert.assertEquals(invokeCount, sa.size())
    }

    @Test
    fun testGenericEmptyArray() {
        val sa = SparseArray<String>()
        sa.forEach { k, v -> throw IllegalStateException("should not be called on an empty array") }
    }

    @Test
    fun testBooleanArrayForEach() {
        val sa = SparseBooleanArray()

        for (i in 1..101) {
            sa.put(i, i % 2 == 0)
        }

        var invokeCount = 0
        sa.forEach { k, v ->
            invokeCount++
            Assert.assertEquals(k % 2 == 0, v )
        }

        Assert.assertEquals(invokeCount, sa.size())
    }

    @Test
    fun testBooleanEmptyArray() {
        val sa = SparseBooleanArray()
        sa.forEach { k, v -> throw IllegalStateException("should not be called on an empty array") }
    }

    @Test
    fun testIntArrayForEach() {
        val sa = SparseIntArray()

        for (i in 1..101) {
            sa.put(i, i * 10)
        }

        var invokeCount = 0
        sa.forEach { k, v ->
            invokeCount++
            Assert.assertEquals(k * 10, v )
        }

        Assert.assertEquals(invokeCount, sa.size())
    }

    @Test
    fun testIntEmptyArray() {
        val sa = SparseIntArray()
        sa.forEach { k, v -> throw IllegalStateException("should not be called on an empty array") }
    }
}