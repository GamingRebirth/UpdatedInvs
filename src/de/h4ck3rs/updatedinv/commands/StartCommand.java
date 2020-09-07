package de.h4ck3rs.updatedinv.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import de.h4ck3rs.updatedinv.UpdatedInv;

public class StartCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

		Player player = (Player)sender;
		Inventory inv = Bukkit.createInventory(null, 27, "§0Test Inv");
		ItemStack item = new ItemStack(Material.QUARTZ);
		player.openInventory(inv);
		for(int i = 0; i<27; i++) {
			int finalI = i;
			new BukkitRunnable() {
				
				@Override
				public void run() {
					inv.setItem(finalI, item);
					
				}
			}.runTaskLater(UpdatedInv.instance, i*2);
		}
		return false;
	}

}
