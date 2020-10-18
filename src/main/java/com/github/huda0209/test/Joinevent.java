package com.github.huda0209.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class Joinevent implements Listener {

    @EventHandler
    public void JoinPlayer (PlayerLoginEvent e){

    e.disallow(PlayerLoginEvent.Result.KICK_OTHER,"&cあなたはこののサーバーに入ってはいけません\n\n&rby test server");

    }
}
