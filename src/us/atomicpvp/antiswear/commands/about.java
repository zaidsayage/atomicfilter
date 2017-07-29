package us.atomicpvp.antiswear.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class about implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String cmdLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("ERROR You are not a player.");
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage(ChatColor.BOLD + "AtomicFilter developed and maintained by zfyre."
				+ "The swear filter is ACTIVE. All likely words are now filtered.");
		return true;

	}
}
