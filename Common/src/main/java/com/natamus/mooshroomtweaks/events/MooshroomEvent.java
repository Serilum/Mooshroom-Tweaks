package com.natamus.mooshroomtweaks.events;

import com.natamus.collective.functions.EntityFunctions;
import com.natamus.mooshroomtweaks.config.ConfigHandler;
import com.natamus.mooshroomtweaks.util.Reference;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.MushroomCow;
import net.minecraft.world.level.Level;

import java.util.Set;

public class MooshroomEvent {
	public static void onEntityJoin(Level level, Entity entity) {
		if (level.isClientSide()) {
			return;
		}
		
		if (!(entity instanceof MushroomCow)) {
			return;
		}
		
		Set<String> tags = entity.getTags();
		if (tags.contains(Reference.MOD_ID + ".checked")) {
			return;
		}
		entity.addTag(Reference.MOD_ID + ".checked");
		
		double num = Math.random();
		if (num < ConfigHandler.becomeBrownChance) {
			EntityFunctions.chargeEntity(entity);
		}	
	}
}
