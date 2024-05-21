package com.rinnyanneko.rinplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class About implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
            if (label.equalsIgnoreCase("about")) {
                sender.sendMessage(ChatColor.AQUA + "[About]");
                sender.sendMessage(ChatColor.AQUA + "Rin's Plugin");
                sender.sendMessage(ChatColor.AQUA + "This server is running RinPlugin v1.0.0");
                sender.sendMessage(ChatColor.AQUA + "Developed by rinnyanneko");
                return true;
            }
        return false;
    }
}
