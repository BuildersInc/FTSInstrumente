package fts.instrumente.main;

import fts.instrumente.listeners.CheckHoldingItemListner;
import fts.instrumente.listeners.CheckKlavierItemListner;
import fts.instrumente.listeners.KlavierGUI;
import fts.instrumente.util.RecipeLoader;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        (new RecipeLoader()).registerRecipes();
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents((Listener)new CheckHoldingItemListner(), (Plugin)getPlugin());
        pluginManager.registerEvents((Listener)new CheckKlavierItemListner(), (Plugin)getPlugin());
        pluginManager.registerEvents((Listener)new KlavierGUI(), (Plugin)getPlugin());
    }

    public static Main getPlugin() {
        return plugin;
    }
}