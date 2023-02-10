package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;


public class Wtf extends FuckAround.AllINeed implements Runnable {

    @Override
    public void run() {
        if (IsActive) {
            IsActive = false;
            Bukkit.getLogger().info(IsActive + "");
            Bukkit.broadcastMessage(ChatColor.RED + "[MathRandom] " + ChatColor.DARK_AQUA + "Noone got the correct answer," + " The correct answer was " + MathAnswer);
        }
    }
}
