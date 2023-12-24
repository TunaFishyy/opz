package io.github.tunafishyy.opuzen.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlocksEvent implements Listener {

    @EventHandler
    public void onAndesitePlace(BlockPlaceEvent e) {
        if (!e.getBlock().getType().toString().toLowerCase().contains("andesite")) return;

        Bukkit.broadcastMessage(ChatColor.BOLD.toString() + ChatColor.GRAY + "Cerlek je peder.");
    }

}