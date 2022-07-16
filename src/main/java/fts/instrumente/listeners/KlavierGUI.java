package fts.instrumente.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryView;

public class KlavierGUI implements Listener {
    @EventHandler
    private void inventoryClick(InventoryClickEvent e) {
        InventoryView view = e.getView();
        Player p = (Player)e.getWhoClicked();
        World world = p.getWorld();
        Location ploc = p.getLocation();
        if (view.getTitle().contains("Schlagzeug")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null)
                return;
            if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Kick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 10.0F, 0.529732F);
            } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Click/Stick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HAT, 10.0F, 0.529732F);
            } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Snare")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_SNARE, 10.0F, 0.529732F);
            } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Kick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 10.0F, 0.943874F);
            } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Click/Stick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HAT, 10.0F, 0.943874F);
            } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Snare")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_SNARE, 10.0F, 0.943874F);
            } else if (e.getSlot() == 20 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Kick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASEDRUM, 10.0F, 1.189207F);
            } else if (e.getSlot() == 22 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Click/Stick")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HAT, 10.0F, 1.189207F);
            } else if (e.getSlot() == 24 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Snare")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_SNARE, 10.0F, 1.189207F);
            } else {
                return;
            }
        }
        if (view.getTitle().contains("Glockenspiel")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null)
                return;
            if (e.getCurrentItem().getType() == Material.AIR)
                return;
            if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.529732F);
            } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.5F);
            } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.561231F);
            } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.594604F);
            } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.629961F);
            } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.66742F);
            } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.707107F);
            } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.707107F);
            } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.749154F);
            } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.793701F);
            } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.840896F);
            } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.890899F);
            } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.943874F);
            } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 0.943874F);
            }
            if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.0F);
            } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.059463F);
            }
            if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.059463F);
            } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.0F);
            } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.122462F);
            } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.189207F);
            } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.259921F);
            } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.33484F);
            } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.414214F);
            } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.414214F);
            } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.498307F);
            } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.587401F);
            } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.681793F);
            } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.781797F);
            } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.887749F);
            } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 1.887749F);
            }
            if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BELL, 10.0F, 2.0F);
            } else {
                return;
            }
        }
        if (view.getTitle().contains("Klavier")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null)
                return;
            if (e.getCurrentItem().getType() == Material.AIR)
                return;
            if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.529732F);
            } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.5F);
            } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.561231F);
            } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.594604F);
            } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.629961F);
            } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.66742F);
            } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.707107F);
            } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.707107F);
            } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.749154F);
            } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.793701F);
            } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.840896F);
            } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.890899F);
            } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.943874F);
            } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 0.943874F);
            }
            if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.0F);
            } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.059463F);
            }
            if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.059463F);
            } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.0F);
            } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.122462F);
            } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.189207F);
            } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.259921F);
            } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.33484F);
            } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.414214F);
            } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.414214F);
            } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.498307F);
            } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.587401F);
            } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.681793F);
            } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.781797F);
            } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.887749F);
            } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 1.887749F);
            }
            if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
                world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_HARP, 10.0F, 2.0F);
            } else {
                return;
            }
        }
        if (view.getTitle().contains("Flöte")) {
                e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Chimes")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_CHIME, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Kuhglocke")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_COW_BELL, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Knochen Xylophon")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_XYLOPHONE, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Eisen Xylophon")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Gitarre")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_GUITAR, 10.0F, 2.0F);
        } else {
            return;
        }
    }
    if (view.getTitle().contains("Bass")) {
        e.setCancelled(true);
        if (e.getCurrentItem() == null)
            return;
        if (e.getCurrentItem().getType() == Material.AIR)
            return;
        if (e.getSlot() == 9 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.529732F);
        } else if (e.getSlot() == 0 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.5F);
        } else if (e.getSlot() == 1 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.561231F);
        } else if (e.getSlot() == 10 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.594604F);
        } else if (e.getSlot() == 2 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.629961F);
        } else if (e.getSlot() == 11 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.66742F);
        } else if (e.getSlot() == 12 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.707107F);
        } else if (e.getSlot() == 3 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.707107F);
        } else if (e.getSlot() == 4 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.749154F);
        } else if (e.getSlot() == 13 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.793701F);
        } else if (e.getSlot() == 5 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.840896F);
        } else if (e.getSlot() == 14 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.890899F);
        } else if (e.getSlot() == 15 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.943874F);
        } else if (e.getSlot() == 6 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 0.943874F);
        }
        if (e.getSlot() == 7 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.0F);
        } else if (e.getSlot() == 16 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.059463F);
        }
        if (e.getSlot() == 36 && e.getCurrentItem().getItemMeta().getDisplayName().contains("G")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.059463F);
        } else if (e.getSlot() == 27 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.0F);
        } else if (e.getSlot() == 28 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Gis/As")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.122462F);
        } else if (e.getSlot() == 37 && e.getCurrentItem().getItemMeta().getDisplayName().contains("A")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.189207F);
        } else if (e.getSlot() == 29 && e.getCurrentItem().getItemMeta().getDisplayName().contains("B/Ais")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.259921F);
        } else if (e.getSlot() == 38 && e.getCurrentItem().getItemMeta().getDisplayName().contains("H")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.33484F);
        } else if (e.getSlot() == 39 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.414214F);
        } else if (e.getSlot() == 30 && e.getCurrentItem().getItemMeta().getDisplayName().contains("C")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.414214F);
        } else if (e.getSlot() == 31 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Cis/Des")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.498307F);
        } else if (e.getSlot() == 40 && e.getCurrentItem().getItemMeta().getDisplayName().contains("D")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.587401F);
        } else if (e.getSlot() == 32 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Dis/Es")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.681793F);
        } else if (e.getSlot() == 41 && e.getCurrentItem().getItemMeta().getDisplayName().contains("E")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.781797F);
        } else if (e.getSlot() == 42 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.887749F);
        } else if (e.getSlot() == 33 && e.getCurrentItem().getItemMeta().getDisplayName().contains("F")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 1.887749F);
        }
        if (e.getSlot() == 34 && e.getCurrentItem().getItemMeta().getDisplayName().contains("Fis/Ges")) {
            world.playSound(ploc, Sound.BLOCK_NOTE_BLOCK_BASS, 10.0F, 2.0F);
        } else {
            return;
        }
    }
}
}
