package network.themc.helloworld;

import net.fabricmc.api.ModInitializer;

import network.themc.helloworld.item.ModItemGroups;
import network.themc.helloworld.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld implements ModInitializer {
	public static final String MOD_ID = "helloworld";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
	}
}