package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static org.bukkit.Bukkit.broadcast;

public class Randomevents extends FuckAround.AllINeed implements Listener {
    @EventHandler
    public void WhatAmIDoing (AsyncPlayerChatEvent e) {
        Player winner = e.getPlayer();
        Bukkit.getLogger().info(MathAnswer + "");
        Bukkit.getLogger().info(IsActive + "");
        if (e.getMessage().equals(String.valueOf(MathAnswer)) && IsActive) {
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.DARK_AQUA + winner.getName() + ChatColor.AQUA + " has answered correctly," + " the answer was " + MathAnswer);
            broadcast(Message);
            winner.giveExp(100);
            IsActive = false;
        }
    }
}