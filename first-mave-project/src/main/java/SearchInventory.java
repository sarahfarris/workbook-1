import Week_3.OOP.Book_Object;

import java.util.ArrayList;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Products> inventory = getInventory();
        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++)
            System.out.println(inventory.get(i).getProductName() +  ": " + inventory.get(i).getProductPrice() + ", " + inventory.get(i).getQuantity());
    }

    public static ArrayList<Products> getInventory() {
        ArrayList<Products> inventory = new ArrayList<Products>();
        inventory.add(new Products("hammer", 12.99, 5));
        inventory.add(new Products("coffee", 5.99, 10));
        inventory.add(new Products("tea", 8.99, 5));
        inventory.add(new Products("windex", 4.99, 3));
        inventory.add(new Products("cups", 6.99, 10));

        return inventory;
    }
}
