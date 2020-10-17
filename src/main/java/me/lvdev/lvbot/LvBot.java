package me.lvdev.lvbot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class LvBot {

    private static final String TOKEN = "{BOT_TOKEN}";

    public static void main(String[] args) {
        JDA jda;
        try {
            jda = new JDABuilder(TOKEN).build();
        } catch (LoginException e) {
            System.out.println("Bot Failed to login!");
            return;
        }
    }
}
