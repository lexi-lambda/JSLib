package com.imjake9.server.lib;

import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;


public class EconomyManager {
    
    private static boolean usingEconomy = false;
    private static Economy economy = null;
    
    public static void setupEconomy() {
        
        Plugin vault = Bukkit.getServer().getPluginManager().getPlugin("Vault");
        if (vault == null) return;
        
        RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
        if (rsp == null) return;
        
        economy = rsp.getProvider();
        usingEconomy = true;
        
    }
    
    public static boolean isUsingEconomy() {
        return usingEconomy;
    }
    
    public static Economy getEconomy() {
        return economy;
    }

}
