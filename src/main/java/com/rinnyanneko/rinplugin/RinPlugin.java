package com.rinnyanneko.rinplugin;

import com.rinnyanneko.rinplugin.commands.Commands;
import com.rinnyanneko.rinplugin.events.Events;
import org.bukkit.plugin.java.JavaPlugin;

public final class RinPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new Events(), this);
        this.getCommand("rinplugin").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
