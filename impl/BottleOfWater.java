package impl;

import practik.Product;

import java.time.LocalDate;

public class BottleOfWater extends Product {

    private String pack;
    private boolean isSpark;

    public BottleOfWater(String name, double price, LocalDate releaseDate, float volume) {
        super(name, price, releaseDate, volume);
        this.isSpark = false;
        this.pack = EPackage.PLASTIC.getMaterial();
    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, float volume) {
        super(name, price, releaseDate, volume);
        this.isSpark = false;
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                "volume=" + volume +
                '}';
    }
}
