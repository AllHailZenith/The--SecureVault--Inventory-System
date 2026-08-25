package com.securevault.core;

public class VaultManager {

    public static void sortItems(VaultItem[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < items.length; j++) {
                if (items[j].getItemValue() < items[smallest].getItemValue()) {
                    smallest = j;
                }
            }

            VaultItem temp = items[i];
            items[i] = items[smallest];
            items[smallest] = temp;
        }
    }
}