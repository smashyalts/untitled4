package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static org.bukkit.Bukkit.broadcast;

public class Randomevents implements Listener {
    private final int MathAnswer = RandomCommands.MathAnswer;
    public boolean IsActive = RandomCommands.IsActive;
    @EventHandler
    public void WhatAmIDoing (AsyncPlayerChatEvent e) {
        Player winner = e.getPlayer();
        if (e.getMessage().equals(String.valueOf(MathAnswer)) && IsActive) {
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.DARK_AQUA + winner.getName() + " Has answered correctly" + " The correct was " + MathAnswer);
            broadcast(Message);
            winner.giveExp(100);
            IsActive = false;
        }
    }
}