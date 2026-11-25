package lommie.transhorror.dimension;

import lommie.transhorror.CommonClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.dimension.DimensionType;

public class DimensionKeys {
    // for the custom dimensions
    public static final ResourceKey<DimensionType> DIM_NAME = ResourceKey.create(Registries.DIMENSION_TYPE,CommonClass.identifier("idk"));
}
