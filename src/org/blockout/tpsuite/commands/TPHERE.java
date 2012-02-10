package org.blockout.tpsuite.commands;

import org.blockout.tpsuite.Message;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPHERE implements CommandExecutor {
	
	public boolean onCommand(CommandSender s, Command c, String l, String [] args) {
		if(l.equalsIgnoreCase("tphere")) {
			if(args.length < 1) return false;
			if(!(s instanceof Player)) return false;
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(!(s.hasPermission("BTS.tphere"))) {
				Message.noPermission((Player) s);
				return true;
			}
			if(target == null) {
				Message.playerOffline((Player) s);
				return true;
			}
			target.teleport(((Player) s).getLocation());
		}
		return true;
	}

}
