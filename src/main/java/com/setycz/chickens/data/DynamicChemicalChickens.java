package com.setycz.chickens.data;

import com.setycz.chickens.ChickensRegistryItem;

import java.util.List;
import java.util.Map;

/**
 * Auto-registration of chemical chickens has been removed.
 * Chemical chickens are now defined exclusively via static data.
 */
final class DynamicChemicalChickens {
    private DynamicChemicalChickens() {}

    static void register(List<ChickensRegistryItem> chickens, Map<String, ChickensRegistryItem> byName) {}

    static void refresh() {}
}