package lommie.transhorror.item;

import lommie.transhorror.CommonClass;
import lommie.transhorror.platform.Services;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static Item register(String id, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        return Services.ITEMS.register(
                ResourceKey.create(Registries.ITEM, CommonClass.identifier(id)),
                itemFactory,
                settings
                );
    }

    public static final Item TEST = register("test",Item::new, new Item.Properties());

    public static void init(){}
}
