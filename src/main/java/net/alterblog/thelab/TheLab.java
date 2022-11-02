package net.alterblog.thelab;

import net.alterblog.thelab.commands.FlyCommand;
import net.alterblog.thelab.listeners.GoodWetherListener;
import net.alterblog.thelab.listeners.JoinLeaveListener;
import net.alterblog.thelab.listeners.NoFoodListener;
import net.alterblog.thelab.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class TheLab extends JavaPlugin {

    @Override
    public void onEnable(){
        Bukkit.getLogger().info(ChatColor.GREEN + "Enabled " + this.getName());

        //Register Listeners
        getServer().getPluginManager().registerEvents(new GoodWetherListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(this), this);
        getServer().getPluginManager().registerEvents(new NoFoodListener(this), this);
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(this), this);

        //Setup Config
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        //Commands
        getCommand("fly").setExecutor(new FlyCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info(ChatColor.GREEN + "Disabled " + this.getName());
    }
}
