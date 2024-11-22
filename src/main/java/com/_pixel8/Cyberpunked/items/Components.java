package com._pixel8.Cyberpunked.items;

import com._pixel8.Cyberpunked.Cyberpunked;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Components {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Cyberpunked.MODID);
    public static final DeferredItem<Item> zeta_component = ITEMS.registerItem(
        "zeta_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> epsilon_component = ITEMS.registerItem(
        "epsilon_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );    public static final DeferredItem<Item> delta_component = ITEMS.registerItem(
        "delta_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> gamma_component = ITEMS.registerItem(
        "gamma_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );    public static final DeferredItem<Item> beta_component = ITEMS.registerItem(
        "beta_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> alpha_component = ITEMS.registerItem(
        "alpha_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );    public static final DeferredItem<Item> zeta_chip = ITEMS.registerItem(
        "zeta_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> epsilon_chip = ITEMS.registerItem(
        "epsilon_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );    public static final DeferredItem<Item> delta_chip = ITEMS.registerItem(
        "delta_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> gamma_chip = ITEMS.registerItem(
        "gamma_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );    public static final DeferredItem<Item> beta_chip = ITEMS.registerItem(
        "beta_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> alpha_chip = ITEMS.registerItem(
        "alpha_chip",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> wiring = ITEMS.registerItem(
        "wiring",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> circut_board = ITEMS.registerItem(
        "circut_board",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );
    public static final DeferredItem<Item> incomplete_component = ITEMS.registerItem(
        "incomplete_component",
    Item::new, // The factory that the properties will be passed into.
    new Item.Properties() // The properties to use.
    );


    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
};
