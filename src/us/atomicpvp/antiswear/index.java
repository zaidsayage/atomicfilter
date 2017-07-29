package us.atomicpvp.antiswear;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import us.atomicpvp.antiswear.commands.about;
import us.atomicpvp.antiswear.event.PlayerChat;


public class index extends JavaPlugin {

	public void onEnable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();
		registerCommands();
		registerEvents();
		registerConfig();
		logger.info(pdfFile.getName() + "plugin activated (Version " + pdfFile.getVersion() + ")");
	}

	public void onDisable() {
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = getLogger();

		logger.info(pdfFile.getName() + "plugin deactivated");
	}
	
	public void registerCommands() {
		getCommand("about").setExecutor(new about());
	}
	public void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new PlayerChat(this), this);

	}
	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
