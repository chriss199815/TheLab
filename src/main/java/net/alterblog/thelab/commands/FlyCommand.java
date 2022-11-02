package net.alterblog.thelab.commands;

import net.alterblog.thelab.NameUtil;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    private ArrayList<Player> list = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(sender instanceof Player){
            Player p = (Player) sender;
            if(p.hasPermission(NameUtil.PERMISSIONCOMMAND + "fly")){
                if(list.contains(p)){
                    p.setAllowFlight(false);
                    list.remove(p);
                    p.sendMessage(ChatColor.RED + "No more Fly!");
                }else{
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.AQUA + "Fly!");
                    list.add(p);
                }
            }
        }

        return true;
    }
}
