package bot;

import domain.*;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

public class Bot extends TelegramLongPollingBot {
    private static LongPollingBot bot;
    private String lastmessage = "";

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()){
            if (message.getText().equals("/help")){
                sendMsg(message, "Привет, нужна помощь, иди в библтотеку");
            }
            if (message.getText().equals("/start")){
                sendMsg(message, "Я бот-библиотекарь, добро пожаловать");
            }
            if(message.getText().equals("/library")){
                sendMsg(message, "Выберете нужный раздел или направление:" +  "\n" +
                                    "1.Все разделы" + "\n" +
                                    "2.Направления ОГЭ" + "\n" +
                                    "3.Направления ЕГЭ" + "\n" +
                                    "4.Направления итогового сочинения");
                lastmessage = message.getText();
            }
            if (lastmessage.equals("/library")) {
                if (message.getText().equals("Все разделы") || message.getText().equals("1")) {
                    sendMsg(message, "Все разделы:" + "\n");
                }
                if (message.getText().equals("Направления ОГЭ") || message.getText().equals("2")) {
                    sendMsg(message, "Все направления ОГЭ:" + "\n");
                }
                if (message.getText().equals("Направления ЕГЭ") || message.getText().equals("3")) {
                    sendMsg(message, "Все направления ЕГЭ:" + "\n");
                }
                if (message.getText().equals("Направления итогового сочинения") || message.getText().equals("4")) {
                    sendMsg(message, "Все направления итогового сочинения:" + "\n");
                }
            }else {
                if (lastmessage.equals("Все разделы") || lastmessage.equals("Направления ОГЭ") ||
                        lastmessage.equals("Направления ЕГЭ") || lastmessage.equals("Направления итогового сочинения")) {
                    sendMsg(message, "Книги по запросу:" + "\n");
                }
            }
        }
    }

    /**
     * Метод для настройки сообщения и его отправки.
     * @paramchatId id чата
     * @params Строка, которую необходимот отправить в качестве сообщения.
     */
    private void sendMsg(Message message, String s) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setReplyToMessageId(message.getMessageId());
        sendMessage.setText(s);
        int i = 1;
        if (lastmessage.equals("/library")) {
            if (message.getText().equals("Все разделы") || message.getText().equals("1")) {
                for (Section section : Section.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + section.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Все разделы";
            }
            if (message.getText().equals("Направления ОГЭ") || message.getText().equals("2  ")) {
                for (OGEDirection oge : OGEDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + oge.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления ОГЭ";
            }
            if (message.getText().equals("Направления ЕГЭ") || message.getText().equals("3")) {
                for (EGEDirection ege : EGEDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + ege.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления ЕГЭ";
            }
            if (message.getText().equals("Направления итогового сочинения") || message.getText().equals("4")) {
                for (EssayDirection essay : EssayDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + essay.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления итогового сочинения";
            }
        }
        else {
            if (lastmessage.equals("Все разделы")){
                sendMessage.setText(Parsing.parsingSection(message, sendMessage));
            }
        }

        try{
            sendMessage(sendMessage);
        }
        catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "librarybot";
    }

    @Override
    public String getBotToken() {
        return "593500687:AAGxEilR74BRiYEWxKHk2QImZONdUroD4T4";
    }

}