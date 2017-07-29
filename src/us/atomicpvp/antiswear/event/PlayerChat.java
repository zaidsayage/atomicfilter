package us.atomicpvp.antiswear.event;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import us.atomicpvp.antiswear.index;

public class PlayerChat implements Listener {
	private index plugin;
	public PlayerChat(index pl) {
		plugin = pl;
	}
	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		String message = event.getMessage().toLowerCase();
		if(message.contains("nigger")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("fuck")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("shit")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("bitch")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("asshole")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("cunt")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("kike")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("n i g g e r")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("n.i.g.g.er")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("fag")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("thot")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("retard")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("cock")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("dick")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("penis")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("vagina")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		else if(message.contains("hoe")) {
			event.setCancelled(true);
			String warningMessage = ChatColor.translateAlternateColorCodes('&',plugin.getConfig().getString("warningMessage"));
			player.sendMessage(warningMessage);
		}
		
	}

}
