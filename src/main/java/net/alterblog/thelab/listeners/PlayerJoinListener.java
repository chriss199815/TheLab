package net.alterblog.thelab.listeners;

import net.alterblog.thelab.TheLab;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    TheLab plugin;

    public PlayerJoinListener(TheLab plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        if(plugin.getConfig().getBoolean("motd")){
            for(int i = 0; i<plugin.getConfig().getList("motd-message").size(); i++){
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getList("motd-message").get(i).toString()));
            }
        }
        if(plugin.getConfig().getBoolean("god-join")){
            p.setInvulnerable(true);
        }
    }
}
