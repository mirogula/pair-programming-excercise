package com.gildedrose

class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        items.forEach {
            when (it.name) {
                "Aged Brie" -> {
                    it.sellIn--
                    if (it.quality < 50) it.quality++
                }
                "Backstage passes to a TAFKAL80ETC concert" -> {
                    it.sellIn--
                    if (it.quality < 50) it.quality++
                    if (it.sellIn < 11 && it.quality < 50) it.quality++
                    if (it.sellIn < 6 && it.quality < 50) it.quality++
                }
                "Sulfuras, Hand of Ragnaros" -> {}
                "Conjured Mana Cake" -> {
                    it.sellIn--
                    if (it.quality > 0) it.quality--
                    if (it.quality > 0) it.quality--
                }
                else -> {
                    it.sellIn--
                    if (it.quality > 0) it.quality--
                }
            }
        }
    }
}
