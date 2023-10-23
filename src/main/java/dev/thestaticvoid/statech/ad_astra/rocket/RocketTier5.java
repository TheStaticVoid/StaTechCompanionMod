package dev.thestaticvoid.statech.ad_astra.rocket;

import dev.thestaticvoid.statech.ad_astra.entity.ModEntityTypes;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class RocketTier5 extends Rocket {
    public RocketTier5(Level level) {
        super(ModEntityTypes.ROCKET_TIER_5_ENTITY_TYPE, level, 5);
    }

    public RocketTier5(EntityType<?> type, Level level) {
        super(type, level, 5);
    }
}
