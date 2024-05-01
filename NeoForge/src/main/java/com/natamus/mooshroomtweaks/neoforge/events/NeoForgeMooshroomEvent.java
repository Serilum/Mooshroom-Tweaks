package com.natamus.mooshroomtweaks.neoforge.events;

import com.natamus.mooshroomtweaks.events.MooshroomEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeMooshroomEvent {
	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		MooshroomEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
