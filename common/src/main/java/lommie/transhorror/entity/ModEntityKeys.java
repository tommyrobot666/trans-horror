package lommie.transhorror.entity;

import lommie.transhorror.CommonClass;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public class ModEntityKeys {
    public static ResourceKey<EntityType<?>> create(String name) {
        return ResourceKey.create(Registries.ENTITY_TYPE, CommonClass.identifier(name));
    }
}
