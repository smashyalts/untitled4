package fuckaround.fuckaround;

import fuckaround.fuckaround.Commanding.RandomCommands;
import fuckaround.fuckaround.Eventing.MathTimed;
import fuckaround.fuckaround.Eventing.Randomevents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class FuckAround extends JavaPlugin {
    Long dinf = 10000L;
    @Override
    public void onEnable() {
        Bukkit.getServer().getScheduler().runTaskTimerAsynchronously( this, new MathTimed(), 60000L, 600000L);
        Bukkit.getPluginManager().registerEvents(new Randomevents(), this);
        Objects.requireNonNull(getCommand("mathrandom")).setExecutor(new RandomCommands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
