package me.SirSlender.Dungeons;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DungeonCommandBase implements CommandInterface 
{
	private Dungeons plugin;

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) 
	{
		Player p = (Player) sender;
		//Base command, input help/info here/how to use plugin.
		
		
		return false;
	}

}
