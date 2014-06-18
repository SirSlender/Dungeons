package me.SirSlender.Dungeons;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DungeonCommands implements CommandExecutor 
{
	private String prefix;
	private String noPerm;
	
	public DungeonCommands(Dungeons plugin)
	{
		plugin = new Dungeons().getInstance();
		prefix = plugin.prefix;
		noPerm = plugin.noPerm;
	}

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		
		
		
		return false;
	}

}
