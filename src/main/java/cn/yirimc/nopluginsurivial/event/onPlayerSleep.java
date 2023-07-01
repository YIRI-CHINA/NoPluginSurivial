package cn.yirimc.nopluginsurivial.event;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class onPlayerSleep implements Listener {
    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();

        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            if (world.getTime() >= 12541 && world.getTime() <= 23458) { // 夜晚时间范围
                world.setTime(0); // 设置时间为白天
                Bukkit.broadcastMessage(player.getName() + " §7睡了过去，夜晚已被跳过。");
            }
        }
    }
}
