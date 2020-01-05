package aldrigos.mc.craftplus.listeners;

import org.bukkit.Material;
import org.bukkit.event.*;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShovelListener implements Listener {
    private final static List<Material> shovels = new ArrayList<>( Arrays.asList
        (Material.STONE_SHOVEL, Material.WOODEN_SHOVEL, Material.IRON_SHOVEL, Material.GOLDEN_SHOVEL, Material.DIAMOND_SHOVEL));

    @EventHandler
    public void onShovel(PlayerInteractEvent e){
        var item = e.getPlayer().getInventory().getItemInMainHand();

        switch(e.getAction()){
            case RIGHT_CLICK_BLOCK:
                if(e.getClickedBlock().getType() != Material.GRASS_BLOCK
                    || item == null || !shovels.contains(item.getType()))
                    return;

                e.getClickedBlock().setType(Material.GRASS_PATH);
                item.setDurability((short)(item.getDurability() -1));
        }
    }
}
