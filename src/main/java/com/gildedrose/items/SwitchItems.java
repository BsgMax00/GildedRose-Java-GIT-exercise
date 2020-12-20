package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItems extends Item {


    public SwitchItems(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor = 1;

        if (this.sellIn >= 0){
            this.quality = Math.min(this.quality + factor, 50);
        } else {
            this.quality = Math.max(this.quality - factor, 0);
        }
    }
}