package flower.store;

public class FlowerPack {
    /**
     * Flower pack.
     * consists of number of flower of one type
     */
    private Flower flower;
    private int amount;

    private double packetPrice;

    public FlowerPack(Flower newFlower, int newAmount) {
        this.flower = newFlower;
        this.amount = newAmount;
    }

    public double getPrice() {
        packetPrice = flower.getPrice() * amount;
        return packetPrice;
    }
}