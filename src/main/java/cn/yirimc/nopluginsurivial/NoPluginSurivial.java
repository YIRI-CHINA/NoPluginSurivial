package cn.yirimc.nopluginsurivial;

import cn.yirimc.nopluginsurivial.event.onPlayerDeath;
import cn.yirimc.nopluginsurivial.event.onPlayerJoinQuit;
import cn.yirimc.nopluginsurivial.event.onPlayerSleep;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoPluginSurivial extends JavaPlugin {
    private String firstLine;
    private String secondLine;

    @Override
    public void onEnable() {
        getLogger().info("NoPluginSurivial 已成功加载。");
        loadConfiguration();
        registerLISTEN();
    }

    @Override
    public void onDisable() {
        getLogger().info("NoPluginSurivial 已成功卸载。");
    }

    @EventHandler
    public void registerLISTEN () {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new onPlayerDeath(), this);
        pm.registerEvents(new onPlayerJoinQuit(), this);
        pm.registerEvents(new onPlayerSleep(), this);
    }
    private void loadConfiguration() {
        saveDefaultConfig();
        reloadConfig();
        FileConfiguration config = getConfig();
    }
}

