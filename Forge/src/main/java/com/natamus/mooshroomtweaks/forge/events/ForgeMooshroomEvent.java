package com.natamus.mooshroomtweaks.forge.events;

import com.natamus.mooshroomtweaks.events.MooshroomEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeMooshroomEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		MooshroomEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
