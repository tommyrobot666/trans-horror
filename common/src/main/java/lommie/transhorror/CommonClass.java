package lommie.transhorror;

import lommie.transhorror.block.ModBlocks;
import lommie.transhorror.entity.ModEntities;
import lommie.transhorror.item.ModItems;
import net.minecraft.resources.Identifier;

public class CommonClass {

    public static void init() {
        ModItems.init();
        ModBlocks.init();
        ModEntities.init();
    }

    public static Identifier identifier(String name) {
        return Identifier.fromNamespaceAndPath(Constants.MOD_ID,name);
    }
}