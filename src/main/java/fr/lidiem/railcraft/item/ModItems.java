package fr.lidiem.railcraft.item;

import fr.lidiem.railcraft.RailCraft;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RailCraft.MODID);

    public static final RegistryObject<Item> CONCRETE = ITEMS.register("concrete",
            () -> new Item(new Item.Properties().setId(ITEMS.key("concrete"))));
    public static final RegistryObject<Item> DUST_VOID = ITEMS.register("dust_void",
            () -> new Item(new Item.Properties().setId(ITEMS.key("dust_void"))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}
