package com.rustik.metallurgy;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Metallurgy.MODID)
public class Metallurgy {
    public static final String MODID = "metallurgy";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Metallurgy() {
            LOGGER.debug("Hello from Example Mod!");
    }
}
