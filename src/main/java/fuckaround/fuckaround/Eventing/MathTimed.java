package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.concurrent.ThreadLocalRandom;
import fuckaround.fuckaround.Commanding.RandomCommands;

import static fuckaround.fuckaround.Commanding.RandomCommands.*;
import static org.bukkit.Bukkit.broadcast;

public class MathTimed implements Runnable {
public int Math1 = RandomCommands.Math1;
public int Math2 = RandomCommands.Math2;
public int MathAnswer = RandomCommands.MathAnswer;
    @Override
    public void run() {
        Math1 = ThreadLocalRandom.current().nextInt(1000);
        Math2 = ThreadLocalRandom.current().nextInt(1000);
        MathAnswer = (Math1 + Math2);
        Bukkit.getLogger().info(MathAnswer + "");
        Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + Math1 + " + " + Math2);
        broadcast(Message);
        IsActive = true;
        Bukkit.getServer().getScheduler().runTaskLaterAsynchronously(new FuckAround(), new Wtf(), 60000);
    }
}
