package icu.kevin557.eq.bots.manager.command;

import icu.kevin557.eq.api.bot.EqBot;
import icu.kevin557.eq.api.command.Command;

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
