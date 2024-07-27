package edu.alenasoft;

public class ConjuredItemStrategy implements Strategy {
    @Override
    public void update(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 2);
        }
        item.setSellIn(item.getSellIn() - 1);
        if (item.getSellIn() < 0 && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 2);
        }
    }
}
