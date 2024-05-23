package com.rinnyanneko.rinplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        try {
                if (args[0].equalsIgnoreCase("about")) {
                    sender.sendMessage(ChatColor.AQUA + "[About]");
                    sender.sendMessage(ChatColor.AQUA + "Rin's Plugin");
                    sender.sendMessage(ChatColor.AQUA + "This server is running RinPlugin v1.0.0");
                    sender.sendMessage(ChatColor.AQUA + "Developed by Rinnyanneko");
                    return true;
                }
                if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.AQUA + "[Help]");
                    sender.sendMessage(ChatColor.AQUA + "Commands:");
                    sender.sendMessage(ChatColor.AQUA + "/rinplugin about - Displays information about the plugin");
                    sender.sendMessage(ChatColor.AQUA + "/rinplugin help - Displays this message");
                    return true;
                }
            }catch (Exception e){
                sender.sendMessage(ChatColor.RED + "An error occurred while executing this command.%n" + e.getMessage());
                return false;
            }
            return false;
        }
}
