package com.rinnyanneko.rinplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Rinplugin implements org.bukkit.command.CommandExecutor{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("rinplugin")||command.getName().equalsIgnoreCase("rp")) {
            commandSender.sendMessage("RinPlugin v1.0.0");
            commandSender.sendMessage("Developed by Rinnyanneko");
            try{
                //commands
                if (strings[0].equalsIgnoreCase("sayhi")){
                    commandSender.sendMessage("Hi!");
                }
            } catch (Exception e) {
                commandSender.sendMessage("An error occurred while executing the command.%n"+e.getMessage());
            }
            return true;
        }
        return false;
    }
}
