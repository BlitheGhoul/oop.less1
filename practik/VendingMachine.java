package practik;

import java.util.ArrayList;
import java.util.List;

public abstract class VendingMachine {

    protected List<Product> products;
    protected List<HotDrink> hotDrinks;


    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public void addProducts (List<Product> products){
        this.products.addAll(products);
    };
    public void addHotDrinks(List<HotDrink> products) {this.hotDrinks.addAll(products);
    }

    public Product getProduct(String name) {

//        products.stream().filter(product -> product.getName().equals(name)).findFirst().orElse(null);

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }

        System.out.println("No such product: " + name);
        return null;
    }

    public HotDrink getProducts(String name, float volume, int temperature) {
        for (HotDrink hotDrink : hotDrinks){
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature){
                hotDrinks.remove(hotDrink);
                return hotDrink;
            }
        }
        System.out.println("No such product: " + name);
        return null;
    }

    public List<Product> getProducts() {
        return products;
    }
    public List<HotDrink> getHotDrinks(){
        return hotDrinks;
    }

}
