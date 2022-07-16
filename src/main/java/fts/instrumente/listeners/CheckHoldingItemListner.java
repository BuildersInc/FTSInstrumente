package fts.instrumente.listeners;

import fts.instrumente.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public class CheckHoldingItemListner implements Listener {
    @EventHandler
    public void onPlayerHeldItem(PlayerItemHeldEvent event) {
        startRunnable();
    }

    public void spawnParticles() {
        FileConfiguration config = Main.getPlugin().getConfig();
        if (config.getString("ArnesFTSStuff2.settings.Weihrauch") == "true") {
            for (Player player : Bukkit.getOnlinePlayers()) {
                Location playerLoc = player.getLocation();
                ItemStack item = player.getInventory().getItemInMainHand();
                if (item.getType() != Material.AIR) {
                    if (item.getType() == Material.TORCH) {
                        if (item.getItemMeta().getDisplayName().contains("Weihrauch Laterne")) {
                            String itemDisplay = item.getItemMeta().getDisplayName();
                            if (itemDisplay.contains("Weihrauch Laterne")) {
                                player.spawnParticle(Particle.CAMPFIRE_COSY_SMOKE, playerLoc, 3, 0.0D, 1.0D, 0.0D, 0.01D);
                                continue;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            return;
        }
    }

    public void startRunnable() {
        Bukkit.getScheduler().runTaskTimer((Plugin)Main.getPlugin(), new Runnable() {
            public void run() {
                CheckHoldingItemListner.this.spawnParticles();
            }
        },  20L, 12L);
    }
}