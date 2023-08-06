package de.bernhardbmx.fastfood.core.init;

import de.bernhardbmx.fastfood.Fastfood;
import de.bernhardbmx.fastfood.world.item.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class Iteminit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fastfood.MODID);

    public static final RegistryObject<Item> CHICKEN_NUGGET = ITEMS.register("chicken_nugget", () -> new Item(new Item.Properties().tab(CreativeTab.FASTFOOD_TAB)));

    public static final RegistryObject<Item> BURGER = ITEMS.register("burger", () -> new Item(new Item.Properties().tab(CreativeTab.FASTFOOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
