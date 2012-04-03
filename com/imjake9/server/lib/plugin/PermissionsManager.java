package com.imjake9.server.lib.plugin;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public class PermissionsManager {
    
    private final Plugin plugin;
    
    public PermissionsManager(Plugin plugin) {
        this.plugin = plugin;
    }
    
    /**
     * Gets a plugin-specific node.
     * 
     * @param node
     * @return 
     */
    public String getPermission(String node) {
        return plugin.getDescription().getName().toLowerCase() + "." + node;
    }
    
    /**
     * Checks if a player has a plugin-specific node.
     * 
     * @param sender
     * @param node
     * @return 
     */
    public boolean hasPermission(CommandSender sender, String node) {
        if (!(sender instanceof Player))
            return true;
        return sender.hasPermission(getPermission(node));
    }
    
}
