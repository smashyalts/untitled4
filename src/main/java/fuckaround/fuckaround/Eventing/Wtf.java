package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;

import static fuckaround.fuckaround.Commanding.RandomCommands.MathAnswer;
import static org.bukkit.Bukkit.broadcast;

public class Wtf implements Runnable {
    public boolean IsActive = RandomCommands.IsActive;

    @Override
    public void run() {
        if (IsActive) {
            IsActive = false;
            Bukkit.broadcastMessage(ChatColor.RED + "[MathRandom] " + ChatColor.DARK_AQUA + "Noone got the correct answer," + " The correct answer was " + MathAnswer);
        }
    }
}
