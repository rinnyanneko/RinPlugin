package com.rinnyanneko.rinplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class about implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try {
            if (label.equalsIgnoreCase("about")) {
                sender.sendMessage(ChatColor.AQUA + "[About]");
                sender.sendMessage(ChatColor.AQUA + "Rin's Plugin");
                sender.sendMessage(ChatColor.AQUA + "This server is running RinPlugin v1.0.0");
                sender.sendMessage(ChatColor.AQUA + "Developed by Rinnyanneko");
                return true;
            }
        } catch (Exception e) {
            sender.sendMessage(ChatColor.RED + "An error occurred while executing this command.%n" + String.valueOf(e));
            e.printStackTrace();
            return false;
        }
        return false;
    }
}
