package BotLogic;

public class Skills {

    private static String toCommands(){
        return "Bot\s commands:\n" +
                "/start - start the bot \n" +
                "/help  - show commands\n" +
                "/format - select file format\n" +
                "/convert - converts the file to the selected format\n" +
                "\n" +
                "Команды\s бота:\n" +
                "/start - запускает бота\n" +
                "/help  - показать команды бота\n" +
                "/format - выбрать формат файла\n" +
                "/convert - конвертировать файл в выбранный формат\n";
    }
    public static String toDefaultAnswer(){
        return "Я тебя не понимаю, напиши /help, чтобы увидеть список команд\n" +
                "I don't understand you, type /help to see a list of commands\n";
    }
    private static String toStart(){
        return "Hi,I'm a converter bot. I can convert files from one extension to another. Type /help to see a list of commands\n" +
                "\n" +
                "Привет, я Бот-конвертер. Я умею конвертировать файлы из одного расширения в другое. Напиши /help, чтобы увидеть список команд";
    }
    private static String CommandComingSoon(){
        return "Command Coming Soon\n" +
                "\n" +
                "Команда скоро появится";
    }
    public static String useCommand(String command){
        return switch (command){
            case "/start" -> toStart();
            case "/help" -> toCommands();
            case "/format",
                 "/convert" -> CommandComingSoon();
            default -> toDefaultAnswer();
        };
        }

    }

