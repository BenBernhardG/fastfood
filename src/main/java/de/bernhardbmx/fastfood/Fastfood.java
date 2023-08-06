package de.bernhardbmx.fastfood;

import com.mojang.logging.LogUtils;
import de.bernhardbmx.fastfood.core.init.Iteminit;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod("fastfood")
public class Fastfood {

    public static final String MODID = "fastfood";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Fastfood() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        Iteminit.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
