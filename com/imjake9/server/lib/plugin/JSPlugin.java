package com.imjake9.server.lib.plugin;

import org.bukkit.plugin.java.JavaPlugin;


public abstract class JSPlugin extends JavaPlugin {
    
    private static JSPlugin instance;
    
    protected Messager messager;
    protected PermissionsManager permissionsManager;
    
    @Override
    public final void onEnable() {
        
        instance = this;
        
        messager = new Messager(this);
        permissionsManager = new PermissionsManager(this);
        
        onJSEnable();
        
    }
    
    @Override
    public final void onDisable() {
        
        onJSDisable();
        
    }
    
    public static Messager getMessager() {
        return instance.messager;
    }
    
    public static PermissionsManager getPermissionsManager() {
        return instance.permissionsManager;
    }
    
    public void onJSEnable() {};
    public void onJSDisable() {};
    
}
