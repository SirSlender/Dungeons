package me.SirSlender.Dungeons;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;

public class EventHandler implements Listener 
{
	private Dungeons plugin;
	
	@SuppressWarnings("static-access")
	public void onEntityDeath(EntityDeathEvent e)
	{
		if(e instanceof LivingEntity)
		{
			if (e.getEntityType() != EntityType.PLAYER)
			{
				
			}
			else
			{
				
			}
		}
	}
	
	public void onEntityDamage(EntityDamageEvent e, LivingEntity boss, Player player)
	{
		
	}
	
	public void bossSpawn(CreatureSpawnEvent e, LivingEntity boss, String name, EntityType type)
	{
		
	}

}
