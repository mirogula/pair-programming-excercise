package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun testElixir() {
        val items = arrayOf(Item("Elixir of the Mongoose", 5, 7))

        val app = GildedRose(items)

        printItems(0, items)

        app.updateQuality()
        printItems(1, items)
        assertEquals(6, app.items[0].quality)

        app.updateQuality()
        printItems(2, items)
        assertEquals(5, app.items[0].quality)
    }

    @Test
    fun testConjured() {
        val items = arrayOf(Item("Conjured Mana Cake", 3, 6))

        val app = GildedRose(items)

        printItems(0, items)

        app.updateQuality()
        printItems(1, items)
        assertEquals(4, app.items[0].quality)

        app.updateQuality()
        printItems(2, items)
        assertEquals(2, app.items[0].quality)
    }

    @Test
    fun testBackstage() {
        val items = arrayOf(Item("Backstage passes to a TAFKAL80ETC concert", 5, 49))

        val app = GildedRose(items)

        printItems(0, items)

        app.updateQuality()
        printItems(1, items)
        assertEquals(50, app.items[0].quality)

        app.updateQuality()
        printItems(2, items)
        assertEquals(50, app.items[0].quality)
    }

    @Test
    fun testSulfures() {
        val items = arrayOf(Item("Sulfuras, Hand of Ragnaros", 0, 80))

        val app = GildedRose(items)

        printItems(0, items)
        app.updateQuality()
        printItems(1, items)
        assertEquals(80, app.items[0].quality)
        app.updateQuality()
        printItems(2, items)
        assertEquals(80, app.items[0].quality)
    }

    @Test
    fun testAgedBrie() {
        val items = arrayOf(Item("Aged Brie", 2, 0))

        val app = GildedRose(items)

        printItems(0, items)
        app.updateQuality()
        printItems(1, items)
        assertEquals(1, app.items[0].quality)
        app.updateQuality()
        printItems(2, items)
        assertEquals(2, app.items[0].quality)
    }

    private fun printItems(i: Int, items: Array<Item>) {
        println("-------- day $i --------")
        println("name, sellIn, quality")
        for (item in items) {
            println(item)
        }
        println()
    }
}
