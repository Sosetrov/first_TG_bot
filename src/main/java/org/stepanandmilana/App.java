package org.stepanandmilana;

import BotLogic.BotLogic;
import cmd.kek;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * Hello world!
 *
 */
public class App
{
    public static  void main(String[] args){

        String TELEGRAM_BOT_USERNAME = System.getenv("TELEGRAM_BOT_USERNAME");
        String TELEGRAM_BOT_TOKEN = System.getenv("TELEGRAM_BOT_TOKEN");
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BotLogic(TELEGRAM_BOT_USERNAME,TELEGRAM_BOT_TOKEN));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        System.out.println("Hello, i'm bot converter\n" + "\n" + "Привет, я бот-конвертер");
        kek cmd = new kek();
        cmd.responseForCMD();
    }
}
