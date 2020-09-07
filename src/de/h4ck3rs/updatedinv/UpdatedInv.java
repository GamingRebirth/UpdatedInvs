package de.h4ck3rs.updatedinv;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.h4ck3rs.updatedinv.commands.StartCommand;
import de.h4ck3rs.updatedinv.listener.InventoryClickListener;

public class UpdatedInv extends JavaPlugin{
	public static UpdatedInv instance;
	public void onEnable() {
		getCommand("Start").setExecutor(new StartCommand());
		Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
		instance = this;
	}
	
}
