package fuckaround.fuckaround;

import fuckaround.fuckaround.Commanding.RandomCommands;
import fuckaround.fuckaround.Eventing.MathTimed;
import fuckaround.fuckaround.Eventing.Randomevents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class FuckAround extends JavaPlugin {

    public static class AllINeed
    {
        public static int Math1;
        public static int Math2;
        public static int MathAnswer;
        public static boolean IsActive = false;
    }

    @Override
    public void onEnable() {
        Bukkit.getServer().getScheduler().runTaskTimer( this, new MathTimed(), 5000L, 30000L);
        Bukkit.getPluginManager().registerEvents(new Randomevents(), this);
        Objects.requireNonNull(getCommand("mathrandom")).setExecutor(new RandomCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
