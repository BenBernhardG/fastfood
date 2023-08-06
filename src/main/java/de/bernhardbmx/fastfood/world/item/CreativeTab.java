package de.bernhardbmx.fastfood.world.item;

import de.bernhardbmx.fastfood.core.init.Iteminit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab FASTFOOD_TAB = new CreativeModeTab("FastFoodTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Iteminit.BURGER.get());
        }
    };
}
