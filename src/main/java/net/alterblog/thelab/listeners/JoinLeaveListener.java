package net.alterblog.thelab.listeners;

import net.alterblog.thelab.TheLab;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {


    TheLab plugin;
    public JoinLeaveListener(TheLab plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){
        e.setQuitMessage("");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        e.setJoinMessage("");
    }
}
