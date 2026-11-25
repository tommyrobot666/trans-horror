package lommie.transhorror.block;

import lommie.transhorror.CommonClass;
import lommie.transhorror.platform.Services;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static Block register(String id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        return Services.BLOCKS.register(
                ResourceKey.create(Registries.BLOCK, CommonClass.identifier(id)),
                blockFactory,
                properties);
    }

    public static Block registerWithItem(String id, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties properties) {
        return Services.BLOCKS.register(
                BlockItemId.create(CommonClass.identifier(id),CommonClass.identifier(id)),
                blockFactory,
                properties);
    }

    public static final Block TEST = registerWithItem("test-block",Block::new, BlockBehaviour.Properties.of());

    public static void init(){}
}
