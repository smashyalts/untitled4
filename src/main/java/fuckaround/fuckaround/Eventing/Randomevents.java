package fuckaround.fuckaround.Eventing;

import io.papermc.paper.event.player.AsyncChatEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.concurrent.ThreadLocalRandom;

public class Randomevents implements Listener {
    int MathAnswer = ThreadLocalRandom.current().nextInt();
    @EventHandler
    public void WhatAmIDoing (AsyncChatEvent e) {
        Player winner = e.getPlayer();
        if (e.message().toString().equals(String.valueOf(MathAnswer)))
            winner.giveExp(100);
            
    }
}
