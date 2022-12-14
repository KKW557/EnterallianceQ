package icu.kevin557.eq.bot.minecraft;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import icu.kevin557.eq.EnterallianceQ;
import icu.kevin557.eq.bot.minecraft.command.hypixel.BedwarsCommand;
import icu.kevin557.eq.bot.minecraft.command.hypixel.HypixelCommand;
import icu.kevin557.eq.bot.minecraft.command.ModelCommand;
import icu.kevin557.eq.bot.minecraft.command.hypixel.PunishmentsCommand;
import icu.kevin557.eq.bot.minecraft.command.hypixel.SkywarsCommand;
import icu.kevin557.eq.utils.Logger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author 557
 */
public class MinecraftBot extends EnterallianceQ {

    public String hypixelKey = "";
    public String antisniperKey = "";

    @Override
    public void loadConfigs() {
        super.loadConfigs();

        File file = new File(dir(), "MC.json");

        if (file.exists()) {
            try {
                JSONObject jsonObject = JSON.parseObject(FileUtils.readFileToString(file, "UTF-8"));

                if (jsonObject.get("hypixelKey") != null) {
                    this.hypixelKey = jsonObject.getString("hypixelKey");
                }

                if (jsonObject.get("antisniperKey") != null) {
                    this.antisniperKey = jsonObject.getString("antisniperKey");
                }

            } catch (IOException e) {
                Logger.info("Failed to load config.");
            }
        }
    }

    @Override
    public void registerCommands() {
        super.registerCommands();

        this.registerCommand(new HypixelCommand(this), "hypixel", "hyp");
        this.registerCommand(new BedwarsCommand(this), "bedwars", "bw");
        this.registerCommand(new SkywarsCommand(this), "skywars", "sw");
        this.registerCommand(new PunishmentsCommand(this), "punishments", "bans", "ban");

        this.registerCommand(new ModelCommand(this), "model");
    }

    @Override
    public String getName() {
        return "MC";
    }
}
