package dev.thestaticvoid.statech;

import dev.thestaticvoid.statech.ad_astra.entity.ModEntityTypes;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StaTechCompanionMod implements ModInitializer {
    public static final String MOD_ID = "statech_companion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.debug("Initializing mod: " + MOD_ID);

        ModEntityTypes.onInitialize();
    }
}
