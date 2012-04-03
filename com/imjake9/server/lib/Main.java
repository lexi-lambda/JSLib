package com.imjake9.server.lib;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
        
        EconomyManager.setupEconomy();
        
    }

}
