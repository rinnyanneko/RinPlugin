package com.rinnyanneko.rinplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements org.bukkit.event.Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(ChatColor.AQUA + "Welcome " + event.getPlayer().getName() + "!");
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(ChatColor.AQUA + "Bye bye " + event.getPlayer().getName() + "!");
    }
}
