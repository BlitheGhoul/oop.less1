package impl;


import practik.HotDrink;
import practik.Product;
import practik.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {

    public HotDrinkVendingMachine() {this.hotDrinks = new ArrayList<HotDrink>();}

    @Override
    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }


}
