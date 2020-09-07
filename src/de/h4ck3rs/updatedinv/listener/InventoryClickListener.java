package de.h4ck3rs.updatedinv.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener{
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		if(event.getClickedInventory() != null && event.getView().getTitle().equals("§0Test Inv")) {
			event.getClickedInventory().setItem(event.getRawSlot(), new ItemStack(Material.TORCH));
			event.setCancelled(true);
		}
	}

}
