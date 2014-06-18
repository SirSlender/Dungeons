package me.SirSlender.Dungeons;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

public class EventHandler implements Listener {
	private Dungeons plugin;
	
	@SuppressWarnings("static-access")
	public void onEntityDeath(EntityDeathEvent e)
	{
		if(e instanceof LivingEntity)
		{
			if (e.getEntityType().PLAYER != null)
			{
				
			}
			else
			{
				
			}
		}
	}
	
	public void onEntityDamage(EntityDamageEvent e)
	{
		
	}

}
