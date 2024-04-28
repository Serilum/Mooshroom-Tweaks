package com.natamus.mooshroomtweaks.forge.events;

import com.natamus.mooshroomtweaks.events.MooshroomEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeMooshroomEvent {
	@SubscribeEvent
	public void onEntityJoin(EntityJoinLevelEvent e) {
		MooshroomEvent.onEntityJoin(e.getLevel(), e.getEntity());
	}
}
