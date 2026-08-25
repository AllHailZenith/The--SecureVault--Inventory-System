package com.securevault.app;

import com.securevault.core.InvalidItemValueException;
import com.securevault.core.VaultItem;
import com.securevault.specialty.FragileItem;

public class Main {
    public static void main(String[] args) {
        try {
            VaultItem item1 = new VaultItem("Diamond", 50000);
            System.out.println(item1);

            VaultItem item2 = new VaultItem("Broken Item", 0);
            System.out.println(item2);
        } catch (InvalidItemValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}