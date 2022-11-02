package net.alterblog.thelab.listeners;

import net.alterblog.thelab.TheLab;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class NoFoodListener implements Listener {

    TheLab plugin;

    public NoFoodListener(TheLab plugin) {
        this.plugin = plugin;
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onFoodLevelChange(FoodLevelChangeEvent e){
        if(e.getEntityType() != EntityType.PLAYER) return;
        e.setCancelled(true);
    }
}
