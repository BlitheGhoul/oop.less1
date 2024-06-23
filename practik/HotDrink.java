package practik;

import java.time.LocalDate;

public class HotDrink extends Product {
    private int temperature;


    public HotDrink(String name, double price, LocalDate releaseDate, int temp, float volume) {
        super(name, price, releaseDate, volume);
        this.temperature = temp;


    }
    public HotDrink(String name, double price, LocalDate releaseDate, float volume) {
        super(name, price, releaseDate, volume);
        this.temperature = 50;

    }
    public int getTemperature(){ return temperature;}


    @Override
    public String toString() {
        return "HotDrink{ " +
                " name ='" + name + '\'' +
                ", pirce= " + price +
                ", temperature= " + temperature + "C" +
                "volume=" + volume +
                '}';
    }
}
