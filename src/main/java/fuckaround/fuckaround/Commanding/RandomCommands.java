package fuckaround.fuckaround.Commanding;

import fuckaround.fuckaround.Eventing.Wtf;
import fuckaround.fuckaround.FuckAround;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

import static org.bukkit.Bukkit.broadcast;
import static org.bukkit.Bukkit.broadcastMessage;

public class RandomCommands extends FuckAround.AllINeed implements CommandExecutor {
    public static FuckAround getInstance() {
        Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("MathRandom");
        if (plugin == null) {
            throw new RuntimeException("'MathRandom' not found. 'MathRandom' plugin disabled?");
        }

        return ((FuckAround) plugin);
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equalsIgnoreCase("mathrandom")) {
            Math1 = ThreadLocalRandom.current().nextInt(1000);
            Math2 = ThreadLocalRandom.current().nextInt(1000);
            MathAnswer = (Math1 + Math2);
            Bukkit.getLogger().info(MathAnswer + "");
            Component Message = Component.text(ChatColor.RED + "[MathRandom] " + ChatColor.AQUA + "What is " + Math1 + " + " + Math2);
            broadcast(Message);
            IsActive = true;
            Bukkit.getLogger().info(IsActive + "");
            Bukkit.getServer().getScheduler().runTaskLater(getInstance(), new Wtf(), 60000);
        }
        return false;
    }
}
