package edu.alenasoft;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class GildedRoseTestV2 {

  @Test
  public void testNormalItemDecrementQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 10, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = inputQuality - 1;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemDoubleDecrementQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = inputQuality - 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testNormalItemZeroQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 0;
    Item item = new Item("+5 Dexterity Vest", 0, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemSufurasLegendary() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 80;
    Item item = new Item("Sulfuras, Hand of Ragnaros", 15, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = 80;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testItemNoMayor50() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 50;
    Item item = new Item("Aged Brie", 20, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = 50;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageIncrementsQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = inputQuality + 1;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testbackstageDoubleIncrementQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = inputQuality + 2;

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageTripleIncrementQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = inputQuality + 3;
    System.out.println(item.getQuality());

    assertEquals(expectedQuality, item.getQuality());
  }

  @Test
  public void testBackstageZeroQuality() {
    // Contexto
    GildedRoseV2.items = new ArrayList<>();
    int inputQuality = 20;
    Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, inputQuality);

    GildedRoseV2.items.add(item);
    GildedRoseV2.updateQuality();

    int expectedQuality = 0;

    assertEquals(expectedQuality, item.getQuality());
  }
}
