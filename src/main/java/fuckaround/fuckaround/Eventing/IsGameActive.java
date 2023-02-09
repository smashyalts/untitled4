package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.Commanding.RandomCommands;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import fuckaround.fuckaround.Commanding.RandomCommands.*;
public class IsGameActive implements Listener {
    public void isGameActive (PlayerJoinEvent e) {
        if (RandomCommands.IsActive) {
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + RandomCommands.Math1 + " + " + RandomCommands.Math2);
            e.getPlayer().sendMessage(Message);
        }
    }
}
