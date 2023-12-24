package io.github.tunafishyy.opuzen;

import io.github.tunafishyy.opuzen.events.BlocksEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Opuzen extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlocksEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
