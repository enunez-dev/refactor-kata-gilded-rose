package edu.alenasoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GildedRoseV2 {
    public static List<Item> items = new ArrayList<>();
    private static Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("default", new NormalItemStrategy());
        strategies.put("Aged Brie", new AgedBrieStrategy());
        strategies.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesStrategy());
        strategies.put("Sulfuras, Hand of Ragnaros", new SulfurasStrategy());
        strategies.put("Conjured Mana Cake", new ConjuredItemStrategy());
    }

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();

        System.out.println(items);
    }

    public static void updateQuality() {
        for (Item item : items) {
            Strategy strategy = strategies.getOrDefault(item.getName(), strategies.get("default"));
            strategy.update(item);
        }
    }
}
