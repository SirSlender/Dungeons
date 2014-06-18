package me.SirSlender.Dungeons;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Dungeons extends JavaPlugin 
{
	String prefix;
	String noPerm;
	File config;
	File dungeons;
	File bosses;
	FileConfiguration configFile;
	FileConfiguration dungeonFile;
	FileConfiguration bossFile;
	
	@Override
	public void onEnable()
	{
		prefix = ChatColor.translateAlternateColorCodes('&', this.getConfig().getString("Prefix"));
		noPerm = prefix + ChatColor.RED + "You don't have permission to perform this action!";		
	}
	
	@Override
	public void onDisable()
	{
		
	}


	public Dungeons getInstance()
	{
		return this;
	}
}
