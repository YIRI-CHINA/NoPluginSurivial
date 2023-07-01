package cn.yirimc.nopluginsurivial.event;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class onPlayerDeath implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Location deathLocation = player.getLocation();

        String message = "您的死亡坐标：X: " + deathLocation.getBlockX() + ", Y: " +
                deathLocation.getBlockY() + ", Z: " + deathLocation.getBlockZ();

        player.sendMessage(message);
    }
}
