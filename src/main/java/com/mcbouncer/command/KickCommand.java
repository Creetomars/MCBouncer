package com.mcbouncer.command;

import com.mcbouncer.plugin.BaseCommand;
import com.mcbouncer.util.ChatColor;
import com.mcbouncer.plugin.MCBouncerPlugin;
import com.mcbouncer.util.config.MCBConfiguration;
import com.mcbouncer.util.MCBouncerUtil;

public class KickCommand extends BaseCommand {

    public KickCommand(MCBouncerPlugin parent) {
        this.parent = parent;
    }

    public boolean runCommand() {
        if (args.length < 1) {
            return false;
        }
        String name = this.getPlayerName(args[0]);
        
        if (name != null && this.isPlayerOnline(name)) {
            
            String reason = MCBouncerUtil.getReasonOrDefault(args, MCBouncerUtil.implodeWithoutFirstElement(args, " "), MCBConfiguration.getDefaultKickMessage());

            this.sendMessageToMods(ChatColor.RED + name + " was kicked for " + reason);
            MCBouncerPlugin.log.info(this.getSenderName() + " kicked " + name + " - " + reason);

            this.kickPlayer(name, "Kicked: " + reason);
            return true;
        }
        else {
            this.sendMessageToSender(ChatColor.RED + "No such player.");
        }
        return true;
    }
}
