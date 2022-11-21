package icu.kevin557.eq.bots.manager.command;

import icu.kevin557.eq.api.bot.EqBot;
import icu.kevin557.eq.api.command.Command;
import icu.kevin557.eq.bots.minecraft.image.hypixel.HypixelImage;
import icu.kevin557.eq.utils.ChatUtils;

import net.mamoe.mirai.event.events.MessageEvent;

/**
 * @author 557
 */
public class TestCommand extends Command {

    public TestCommand(EqBot bot) {
        super(bot);
    }

    @Override
    public void execute(MessageEvent event, String[] args) {
//        HypixelImage image = new HypixelImage();
//        ChatUtils.replay(event, image.get(), "test");
    }

    @Override
    public String description() {
        return "test";
    }

    @Override
    public String[] usages() {
        return new String[0];
    }
}
