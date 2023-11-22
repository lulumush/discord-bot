package com.discordbot;


import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordBotApplication {
    public static final String TOKEN = System.getenv("TOKEN");
    public static void main(String[] args) {
        JDA jda = JDABuilder.createDefault(TOKEN).build();
    }
}
