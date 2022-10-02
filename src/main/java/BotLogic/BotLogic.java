package BotLogic;
import BotLogic.Skills;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class BotLogic extends TelegramLongPollingBot {
        private final String BotUsername;
        private final String BotToken;
        //  private final
        public BotLogic(String BotUsername, String BotToken){
         this.BotUsername = BotUsername;
         this.BotToken = BotToken;
        }

        @Override
        public String getBotUsername() {
            return BotUsername;
        }

        @Override
        public String getBotToken() {
            return BotToken;
        }

    @Override
    public void onUpdateReceived(Update update) {
        // Проверка на сообщение или на текст в сообщении
        SendMessage message = new SendMessage();
        message.setChatId(update.getMessage().getChatId());
        if (update.hasMessage() && update.getMessage().hasText()) {
            StringBuilder answer = new StringBuilder("");
            String userTextMessage;
            message.setText(update.getMessage().getText());
            String messageString = update.getMessage().getText();
            String[] messageWords = messageString.split(" ");
            if (messageWords[0].charAt(0) == '/') {
                answer.append(Skills.useCommand(messageWords[0]));
            } else {
                // формируем ответ на сообщение
                answer.append(Skills.toDefaultAnswer());
            }
            message.setText(answer.toString());

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}