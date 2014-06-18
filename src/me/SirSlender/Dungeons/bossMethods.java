package me.SirSlender.Dungeons;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class bossMethods {
	private Dungeons plugin;
	
	public double getBossMaxHealth(Entity boss)
	{
		if (boss instanceof Damageable)
		{
			return ((Damageable) boss).getMaxHealth();
		}
		else
		{
			return 0.0;
		}
	}
	
	public void setBossMaxHealth(Entity boss, double amount)
	{
		if (boss instanceof LivingEntity)
		{
			((LivingEntity) boss).setMaxHealth(amount);
		}
		
	}
	
	public void setBossHelm(Entity boss, ItemStack helm, Enchantment enchant)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment();
			if (getBossHelm(boss) == null)
			{
				ee.setHelmet(helm);
			}
		}
		
	}
	
	public ItemStack getBossHelm(Entity boss)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getHelmet();
			return (ItemStack) ee;
		}
		else
		{
			return null;
		}
	}
	
	public void setBossChest(Entity boss, ItemStack chest, Enchantment enchant)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment();
			if (getBossHelm(boss) == null)
			{
				ee.setChestplate(chest);
			}
		}
		
	}
	
	public ItemStack getBossChest(Entity boss)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getChestplate();
			return (ItemStack) ee;
		}
		else
		{
			return null;
		}
	}
	
	public void setBossLegs(Entity boss, ItemStack legs, Enchantment enchant)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment();
			if (getBossHelm(boss) == null)
			{
				ee.setLeggings(legs);
			}
		}
		
	}
	
	public ItemStack getBossLegs(Entity boss)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getLeggings();
			return (ItemStack) ee;
		}
		else
		{
			return null;
		}
	}
	
	public void setBossBoots(Entity boss, ItemStack boots, Enchantment enchant)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment();
			if (getBossHelm(boss) == null)
			{
				ee.setBoots(boots);
			}
		}
		
	}
	
	public ItemStack getBossBoots(Entity boss)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getBoots();
			return (ItemStack) ee;
		}
		else
		{
			return null;
		}
	}
	
	public void setBossWeapon(Entity boss, ItemStack wep, Enchantment enchant)
	{
		
	}
	
	public ItemStack getBossWeapon(Entity boss)
	{
		if (boss instanceof LivingEntity)
		{
			EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getItemInHand();
			return (ItemStack) ee;
		}
		else
		{
			return null;
		}
	}
	
	public void setBossPower(Entity boss, String power, int level)
	{
		
	}
	

}
