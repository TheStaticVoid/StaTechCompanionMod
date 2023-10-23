package dev.thestaticvoid.statech.ad_astra.entity;

import dev.thestaticvoid.statech.StaTechCompanionMod;
import dev.thestaticvoid.statech.ad_astra.rocket.RocketTier5;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
    public static final EntityType<RocketTier5> ROCKET_TIER_5_ENTITY_TYPE = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(StaTechCompanionMod.MOD_ID, "tier_5_rocket"),
            FabricEntityTypeBuilder.create(MobCategory.MISC, RocketTier5::new).dimensions(EntityDimensions.fixed(1.1f, 7.0f)).build()
    );

    public static void onInitialize() {
        StaTechCompanionMod.LOGGER.debug("Registering entity types for " + StaTechCompanionMod.MOD_ID);
    }
}
