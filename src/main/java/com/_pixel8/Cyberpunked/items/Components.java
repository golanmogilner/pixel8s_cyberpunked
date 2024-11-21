package com._pixel8.Cyberpunked.items;

import com._pixel8.Cyberpunked.Cyberpunked;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Components {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cyberpunked.MODID);
    public static final DeferredItem<Item> common_component = ITEMS.registerItem(
        "common_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> uncommon_component = ITEMS.registerItem(
        "uncommon_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
};
