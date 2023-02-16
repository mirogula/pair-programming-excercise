package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun foo() {
        val items = arrayOf(Item("fixme", 0, 0))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("fixme", app.items[0].name)

    }

    @Test
    fun testQuality() {
        println("OMGHAI!")

        val items = arrayOf(Item("+5 Dexterity Vest", 10, 20), //
            Item("Aged Brie", 2, 0), //
            Item("Elixir of the Mongoose", 5, 7), //
            Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            Item("Sulfuras, Hand of Ragnaros", -1, 80),
            Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            // this conjured item does not work properly yet
            Item("Conjured Mana Cake", 3, 6))

        val app = GildedRose(items)

        printItems(0, items)
        app.updateQuality()
        printItems(1, items)
        assertEquals(4, app.items.findLast { it.name === "Conjured Mana Cake" }?.quality)
        assertEquals(1, app.items.findLast { it.name === "Aged Brie" }?.quality)
        assertEquals(6, app.items.findLast { it.name === "Elixir of the Mongoose" }?.quality)
        assertEquals(50, app.items.findLast { it.name === "Backstage passes to a TAFKAL80ETC concert" }?.quality)
        assertEquals(80, app.items.findLast { it.name === "Sulfuras, Hand of Ragnaros" }?.quality)
        app.updateQuality()
        printItems(2, items)
        assertEquals(2, app.items.findLast { it.name === "Conjured Mana Cake" }?.quality)
        assertEquals(2, app.items.findLast { it.name === "Aged Brie" }?.quality)
        assertEquals(5, app.items.findLast { it.name === "Elixir of the Mongoose" }?.quality)
        assertEquals(50, app.items.findLast { it.name === "Backstage passes to a TAFKAL80ETC concert" }?.quality)
        assertEquals(80, app.items.findLast { it.name === "Sulfuras, Hand of Ragnaros" }?.quality)
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


