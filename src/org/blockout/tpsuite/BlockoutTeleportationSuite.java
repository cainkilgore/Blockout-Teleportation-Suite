package org.blockout.tpsuite;

import java.util.logging.Logger;

import org.blockout.tpsuite.commands.TP;
import org.blockout.tpsuite.commands.TPALL;
import org.blockout.tpsuite.commands.TPHERE;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockoutTeleportationSuite extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		log.info("[BlockoutTeleportationSuite] BlockoutTeleportationSuite has been successfully enabled!");
		getServer().getPluginCommand("tp").setExecutor(new TP());
		getServer().getPluginCommand("tpall").setExecutor(new TPALL());
		getServer().getPluginCommand("tphere").setExecutor(new TPHERE());
	}
	
	public void onDisable() {
		/* Nothing Here */
	}

}
