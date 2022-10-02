package BotLogic;

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
            public void onUpdateReceived(Update update) {
                // We check if the update has a message and the message has text
                if (update.hasMessage() && update.getMessage().hasText()) {
                    SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
                    message.setChatId(update.getMessage().getChatId().toString());
                    message.setText(update.getMessage().getText());

                    try {
                        execute(message); // Call method to send the message
                    } catch (TelegramApiException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
