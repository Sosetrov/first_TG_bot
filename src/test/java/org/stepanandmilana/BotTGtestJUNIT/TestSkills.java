package org.stepanandmilana.BotTGtestJUNIT;

import BotLogic.Skills;
import junit.framework.TestCase;
import org.junit.Test;

public class TestSkills extends TestCase {
        private Skills skills = new Skills();
        @Test
        public void testUseCommand(){
            assertEquals("Я тебя не понимаю, напиши /help, чтобы увидеть список команд\n" +
                    "\n" +
                    "I don't understand you, type /help to see a list of commands\n", skills.useCommand("прерпререререр"));
            assertEquals("Hi,I'm a converter bot. I can convert files from one extension to another. Type /help to see a list of commands\n" +
                    "\n" +
                    "Привет, я Бот-конвертер. Я умею конвертировать файлы из одного расширения в другое. Напиши /help, чтобы увидеть список команд",skills.useCommand("/start"));
            assertEquals("Bot\s commands:\n" +
                    "/start - start the bot \n" +
                    "/help  - show commands\n" +
                    "/format - select file format\n" +
                    "/convert - converts the file to the selected format\n" +
                    "\n" +
                    "Команды\s бота:\n" +
                    "/start - запускает бота\n" +
                    "/help  - показать команды бота\n" +
                    "/format - выбрать формат файла\n" +
                    "/convert - конвертировать файл в выбранный формат\n",skills.useCommand("/help"));
            assertEquals("Command Coming Soon\n" +
                    "\n" +
                    "Команда скоро появится",skills.useCommand("/format"));
            assertEquals("Command Coming Soon\n" +
                    "\n" +
                    "Команда скоро появится",skills.useCommand("/convert"));
        }
}

