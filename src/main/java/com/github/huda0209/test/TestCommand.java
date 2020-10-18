package com.github.huda0209.test;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("コマンドを受け付けました。");
        if(!(sender instanceof Player)) return false;
        Player player = (Player)sender;
        ItemStack item = new ItemStack(Material.DIAMOND);
        player.getInventory().addItem(item);
        return true;
    }
}
