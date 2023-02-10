package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class IsGameActive extends FuckAround.AllINeed implements Listener {

    @EventHandler
    public void isGameActive (PlayerJoinEvent e) {
        Bukkit.getLogger().info(IsActive + "");
        if (IsActive) {
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + Math1 + " + " + Math2);
            e.getPlayer().sendMessage(Message);
        }
    }
}
