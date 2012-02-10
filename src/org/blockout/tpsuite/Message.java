package org.blockout.tpsuite;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Message {

	public static void noPermission(Player p) {
		p.sendMessage(ChatColor.RED + "[BTS] You have no permission to issue this teleport command.");
	}
	
	public static void playerOffline(Player p) {
		p.sendMessage(ChatColor.RED + "[BTS] Cannot teleport because player is currently offline");
	}
	
	public static void teleportSuccess(Player p) {
		p.sendMessage(ChatColor.GREEN + "[BTS] Teleported to destination!");
	}
}
