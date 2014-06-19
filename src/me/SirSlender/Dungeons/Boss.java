package me.SirSlender.Dungeons;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;

public class Boss 
{
	private Dungeons plugin;
	
	public double getBossMaxHealth(LivingEntity boss)
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
	
	public void setBossName(LivingEntity boss, String name)
	{
		boss.setCustomName(name);
	}
	
	public String getBossName(LivingEntity boss)
	{
		final String bossName = boss.getCustomName();
		return bossName;
	}
	
	public void setBossMaxHealth(LivingEntity boss, double amount)
	{
			boss.setMaxHealth(amount);
		
	}
	
	public void setBossHelm(LivingEntity boss, ItemStack helm, Enchantment enchant)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment();
		ee.setHelmet(helm);
		
	}
	
	public ItemStack getBossHelm(LivingEntity boss)
	{
		EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment().getHelmet();
		return (ItemStack) ee;
	}
	
	public void setBossChest(LivingEntity boss, ItemStack chest, Enchantment enchant)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment();
		ee.setChestplate(chest);
		
	}
	
	public ItemStack getBossChest(LivingEntity boss)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment().getChestplate();
		return (ItemStack) ee;
	}
	
	public void setBossLegs(LivingEntity boss, ItemStack legs, Enchantment enchant)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment();
		ee.setLeggings(legs);
		
	}
	
	public ItemStack getBossLegs(LivingEntity boss)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment().getLeggings();
		return (ItemStack) ee;
	}
	
	public void setBossBoots(LivingEntity boss, ItemStack boots, Enchantment enchant)
	{
		EntityEquipment ee = (EntityEquipment) ((LivingEntity)boss).getEquipment();
		ee.setBoots(boots);
	}
	
	public ItemStack getBossBoots(LivingEntity boss)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment().getBoots();
		return (ItemStack) ee;
	}
	
	public void setBossWeapon(LivingEntity boss, ItemStack wep, Enchantment enchant)
	{
		if (enchant != null)
		{
			wep.addEnchantment(enchant, 1);
			boss.getEquipment().setItemInHand(wep);
		}
		else
		{
			boss.getEquipment().setItemInHand(wep);
		}
	}
	
	public ItemStack getBossWeapon(LivingEntity boss)
	{
		EntityEquipment ee = (EntityEquipment) boss.getEquipment().getItemInHand();
		return (ItemStack) ee;
	}
	
	public void setBossPower(LivingEntity boss, String power, int level)
	{
		
	}
}
