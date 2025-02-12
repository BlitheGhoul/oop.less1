package practik;

import impl.HotDrinkVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        /*
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();



        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());
*/
        HotDrink hotDrink1 = new HotDrink("Americano", 2, LocalDate.of(2024, 06, 23), 60, 30);
        HotDrink hotDrink2 = new HotDrink("Capuchino", 3, LocalDate.of(2024, 06, 23), 50, 40);

        HotDrinkVendingMachine vm1 = new HotDrinkVendingMachine();

        vm1.addHotDrinks(List.of(hotDrink1, hotDrink2, hotDrink2, hotDrink1));

        System.out.println(vm1.getHotDrinks());

        vm1.getProducts("Capuchino", 40, 50);

        System.out.println(vm1.getHotDrinks());
    }
}
