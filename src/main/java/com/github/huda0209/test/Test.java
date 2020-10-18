package com.github.huda0209.test;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCommand());
        getServer().getPluginManager().registerEvents(new Joinevent(), this);
        getLogger().info("プラグインが有効になりました。");
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが無効になりました。");
    }


}