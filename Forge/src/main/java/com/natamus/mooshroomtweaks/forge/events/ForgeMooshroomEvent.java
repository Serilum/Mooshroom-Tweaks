package com.natamus.mooshroomtweaks.forge.events;

import com.natamus.mooshroomtweaks.events.MooshroomEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeMooshroomEvent {
	@SubscribeEvent
	public void onEntityJoin(EntityJoinWorldEvent e) {
		MooshroomEvent.onEntityJoin(e.getWorld(), e.getEntity());
	}
}
