package atividades_resolvidas.adapter;

import java.util.List;

public class UserInterface {
    public void displayItemList(List<Item> itemList) {
        for (Item item : itemList) {
            System.out.println("Name: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println();
        }
    }
}
