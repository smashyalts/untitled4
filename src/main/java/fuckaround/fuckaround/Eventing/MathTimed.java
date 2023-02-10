package fuckaround.fuckaround.Eventing;

import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.concurrent.ThreadLocalRandom;
import fuckaround.fuckaround.Commanding.RandomCommands;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import static fuckaround.fuckaround.Commanding.RandomCommands.*;
import static org.bukkit.Bukkit.broadcast;

public class MathTimed extends FuckAround.AllINeed implements Runnable{
    private JavaPlugin plugin;

    public void Scheduler (JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public static FuckAround getInstance() {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MathRandom");
        if (plugin == null) {
            throw new RuntimeException("'MathRandom' not found. 'MathRandom' plugin disabled?");
        }

        return ((FuckAround) plugin);
    }
    @Override
    public void run() {
        if (!IsActive) {
            Math1 = ThreadLocalRandom.current().nextInt(1000);
            Math2 = ThreadLocalRandom.current().nextInt(1000);
            MathAnswer = (Math1 + Math2);
            Bukkit.getLogger().info(MathAnswer + "");
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + Math1 + " + " + Math2);
            broadcast(Message);
            IsActive = true;
            Bukkit.getLogger().info(IsActive + "");
            Bukkit.getServer().getScheduler().runTaskLater(getInstance(), new Wtf(), 60000); }
    }
}

    class Fish extends BukkitRunnable {
        public static FuckAround getInstance() {
            Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MathRandom");
            if (plugin == null) {
                throw new RuntimeException("'MathRandom' not found. 'MathRandom' plugin disabled?");
            }

            return ((FuckAround) plugin);
        }
        @Override
        public void run() {
            if (!IsActive) {
                Math1 = ThreadLocalRandom.current().nextInt(1000);
                Math2 = ThreadLocalRandom.current().nextInt(1000);
                MathAnswer = (Math1 + Math2);
                Bukkit.getLogger().info(MathAnswer + "");
                Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + Math1 + " + " + Math2);
                broadcast(Message);
                IsActive = true;
                Bukkit.getLogger().info(IsActive + "");
                Bukkit.getServer().getScheduler().runTaskLater(getInstance(), new Wtf(), 60000); }
        }
    }

