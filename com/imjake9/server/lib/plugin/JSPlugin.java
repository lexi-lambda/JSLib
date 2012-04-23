package com.imjake9.server.lib.plugin;

import org.bukkit.plugin.java.JavaPlugin;


public abstract class JSPlugin extends JavaPlugin {
    
    protected Messager messager;
    protected PermissionsManager permissionsManager;
    
    @Override
    public final void onEnable() {
        
        messager = new Messager(this);
        permissionsManager = new PermissionsManager(this);
        
        onJSEnable();
        
    }
    
    @Override
    public final void onDisable() {
        
        onJSDisable();
        
    }
    
    public Messager getMessager() {
        return messager;
    }
    
    public PermissionsManager getPermissionsManager() {
        return permissionsManager;
    }
    
    public void onJSEnable() {};
    public void onJSDisable() {};
    
}
