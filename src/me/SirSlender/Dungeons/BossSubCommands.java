package me.SirSlender.Dungeons;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.SirSlender.Dungeons.Boss;

public class BossSubCommands implements CommandInterface 
{
	private Dungeons plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) 
	{
		Player p = (Player) sender;
		
		if (args.length < 1)
		{
			p.sendMessage(plugin.prefix + ChatColor.RED + "Invalid arguments!");
		}
		else
		{
			
			
		}
		
		return false;
	}

}
