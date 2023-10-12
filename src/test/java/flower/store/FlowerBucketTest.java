package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());

        int price2 = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity2 = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower2 = new Tulip();
        flower2.setPrice(price2);
        FlowerPack flowerPack2 = new FlowerPack(flower2, quantity2);
        flowerBucket.add(flowerPack2);
        Assertions.assertEquals(price * quantity + price2 * quantity2, flowerBucket.getPrice());
    }
}
