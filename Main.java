package com.securevault.app;

import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;
import com.securevault.core.VaultManager;
import com.securevault.specialty.FragileItem;

public class Main {
    public static void main(String[] args) {
        try {
            VaultItem item1 = new VaultItem("Diamond", 50000);
            VaultItem item2 = new VaultItem("Gold Bar", 25000);
            FragileItem item3 = new FragileItem("Painting", 75000, true);
            FragileItem item4 = new FragileItem("Glass Vase", 5000, true);

            VaultItem[] items = {item1, item2, item3, item4};

            VaultManager.sortItems(items);

            for (VaultItem item : items) {
                System.out.println(item);
            }

        } catch (InvalidItemValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}