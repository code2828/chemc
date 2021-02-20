package com.byethost8.code2828.mcmods.chemc;

import com.byethost8.code2828.mcmods.chemc.items.Chlorine;
import com.byethost8.code2828.mcmods.chemc.items.Hydrogen;
import com.byethost8.code2828.mcmods.chemc.items.HydrogenChloride;
import com.byethost8.code2828.mcmods.chemc.items.Lithium;
import com.byethost8.code2828.mcmods.chemc.items.Nitrogen;
import com.byethost8.code2828.mcmods.chemc.items.Oxygen;
import com.byethost8.code2828.mcmods.chemc.tools.LithiumPickaxe;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.ToolItem;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CheMC.modid)
public class CheMC {
    public static final String modid = "chemc";
    public static final Properties ItemPropertiesGas = new Properties().group(ItemGroup.MATERIALS);
    public static final Properties ItemPropertiesIngot = new Properties().group(ItemGroup.MATERIALS);
    public static Item i_h = new Hydrogen(ItemPropertiesGas).setRegistryName("chemc", "hydrogen");
    public static Item i_o = new Oxygen(ItemPropertiesGas).setRegistryName("chemc", "oxygen");
    public static Item i_n = new Nitrogen(ItemPropertiesGas).setRegistryName("chemc", "nitrogen");
    public static Item i_cl = new Chlorine(ItemPropertiesGas).setRegistryName("chemc", "chlorine");
    public static Item i_hcl = new HydrogenChloride(ItemPropertiesGas).setRegistryName("chemc", "hydrogen_chloride");
    public static Item i_li = new Lithium(ItemPropertiesIngot).setRegistryName("chemc", "lithium_ingot");
    public static ToolItem pickaxe_lithium = (ToolItem) new LithiumPickaxe(
            new Properties().addToolType(ToolType.PICKAXE, ItemTier.GOLD.getHarvestLevel()).maxDamage(70).group(ItemGroup.TOOLS))
                    .setRegistryName("chemc", "lithium_pickaxe");

    public CheMC() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    // You can use EventBusSubscriber to automatically subscribe events on the
    // contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            // blockRegistryEvent.getRegistry().registerAll();
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
            // register a new item here
            itemRegistryEvent.getRegistry().registerAll(i_h, i_o, i_n, i_cl, i_hcl, i_li,pickaxe_lithium);
        }
    }
}
