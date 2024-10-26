package com.natamus.mooshroomtweaks.config;

import com.natamus.collective.config.DuskConfig;
import com.natamus.mooshroomtweaks.util.Reference;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConfigHandler extends DuskConfig {
	public static HashMap<String, List<String>> configMetaData = new HashMap<String, List<String>>();

	@Entry(min = 0, max = 1.0) public static double becomeBrownChance = 0.5;

	public static void initConfig() {
		configMetaData.put("becomeBrownChance", Arrays.asList(
			"The chance of a Red Mooshroom becoming a Brown Mooshroom."
		));

		DuskConfig.init(Reference.NAME, Reference.MOD_ID, ConfigHandler.class);
	}
}