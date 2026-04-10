package com.natamus.mooshroomtweaks.forge.events;

import com.natamus.mooshroomtweaks.events.MooshroomEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeMooshroomEvent {
	public static void registerEventsInBus() {
		// BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeMooshroomEvent.class);

		EntityJoinLevelEvent.BUS.addListener(ForgeMooshroomEvent::onEntityJoin);
	}

	@SubscribeEvent
	public static void onEntityJoin(EntityJoinLevelEvent e) {
		MooshroomEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
