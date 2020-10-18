package com.github.huda0209.test;

import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("プラグインが有効になりました。");
    }

    @Override
    public void onDisable() {
        getLogger().info("プラグインが無効になりました。");
    }
}
