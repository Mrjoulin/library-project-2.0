package com.example.bot;

import com.example.domain.*;
import com.example.repository.BookRepository;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.LongPollingBot;

public class Bot extends TelegramLongPollingBot {
    private static LongPollingBot bot;

    private String lastmessage = "";

    private BookRepository bookRepository;

    public Bot(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        if (message != null && message.hasText()){
            if (message.getText().equals("/start") || message.getText().equals("/help") || message.getText().equals("/sait") || message.getText().equals("/library") || lastmessage.equals("/library") || lastmessage.equals("Все разделы") || lastmessage.equals("Направления ОГЭ") || lastmessage.equals("Направления ЕГЭ") || lastmessage.equals("Направления итогового сочинения")) {
                if (message.getText().equals("/start")) {
                    sendMsg(message, "Я бот-библиотекарь МОУ«Лицей №4» г.Саратова, добро пожаловать!" + "\n" +
                            "Введите /help для получения помощи в использовании бота" + "\n" +
                            "Введите /library , чтобы начать работу со справочником" + "\n" +
                            "Введите /sait , чтобы получить ссылку на сайт со справочником");
                }
                if (message.getText().equals("/help")) {
                    sendMsg(message, "Для начала работы, отправьте мне сообщение «/library» и далее " +
                            "выберайте нужные вам пункты, отправляя мне его полное название " +
                            "(без номера), либо номер пункта(одно число)");
                }
                if (message.getText().equals("/sait")) {
                    sendMsg(message, "Ссылка на сайт со справочником:" + "\n" +
                            "https://sarlicey4library.herokuapp.com/");
                }
                if (lastmessage.equals("/library") || lastmessage.equals("Все разделы") || lastmessage.equals("Направления ОГЭ") ||
                        lastmessage.equals("Направления ЕГЭ") || lastmessage.equals("Направления итогового сочинения")){
                    sendMsg(message, "Не корректный запрос, проверьте правильность написния сообщения и наличие его в списке моих команд" + "\n" +
                            "Для получения помощи в использовании бота, введите «/help»" + "\n");
                }
                if (message.getText().equals("/library")) {
                    sendMsg(message, "Выберете нужный раздел или направление:" + "\n" +
                            "1.Все разделы" + "\n" +
                            "2.Направления ОГЭ" + "\n" +
                            "3.Направления ЕГЭ" + "\n" +
                            "4.Направления итогового сочинения" + "\n" + "\n" +
                            "Для получения помощи в использовании бота, введите «/help»" + "\n");
                    lastmessage = message.getText();
                }

            }else {
                sendMsg(message, "Не корректный запрос, проверьте правильность написния сообщения и наличие его в списке моих команд" + "\n" +
                                    "Для получения помощи в использовании бота, введите «/help»" + "\n");
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
                sendMessage.setText("Все разделы:" + "\n");
                for (Section section : Section.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + section.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Все разделы";
            }
            if (message.getText().equals("Направления ОГЭ") || message.getText().equals("2")) {
                sendMessage.setText("Все направления ОГЭ:" + "\n");
                for (OGEDirection oge : OGEDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + oge.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления ОГЭ";
            }
            if (message.getText().equals("Направления ЕГЭ") || message.getText().equals("3")) {
                sendMessage.setText("Все направления ЕГЭ:" + "\n");
                for (EGEDirection ege : EGEDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + ege.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления ЕГЭ";
            }
            if (message.getText().equals("Направления итогового сочинения") || message.getText().equals("4")) {
                sendMessage.setText("Все направления итогового сочинения:" + "\n");
                for (EssayDirection essay : EssayDirection.values()) {
                    sendMessage.setText(sendMessage.getText() + i + "." + essay.getTitle() + "\n");
                    i++;
                }
                lastmessage = "Направления итогового сочинения";
            }
        } else {
                if (lastmessage.equals("Все разделы") && (message.getText().equals(Section.BiographiesofRussiancelebrities) || message.getText().equals(Section.Militaryliterature) || message.getText().equals(Section.Housekeeping) || message.getText().equals(Section.Additionaltutorial) || message.getText().equals(Section.Foreignliterature) || message.getText().equals(Section.Historicalprose) || message.getText().equals(Section.Historicalnovels) || message.getText().equals(Section.Historyandtheoryofliterature) || message.getText().equals(Section.HistoryArcheologyEthnography) || message.getText().equals(Section.Classicalandcontemporaryprose) || message.getText().equals(Section.Literatureforchildren) || message.getText().equals(Section.Literatureforschoolchildren) || message.getText().equals(Section.Literarycriticism) || message.getText().equals(Section.Storiesandstoriesaboutanimals) || message.getText().equals(Section.CognitiveLiterature) || message.getText().equals(Section.Poetry) || message.getText().equals(Section.Adventurenovels) || message.getText().equals(Section.Publicism) || message.getText().equals(Section.TravelsHobbyAphotoSport) || message.getText().equals(Section.ShortStories) || message.getText().equals(Section.Transport) || message.getText().equals(Section.FantasticFantasyMystic) || message.getText().equals("1") || message.getText().equals("2") || message.getText().equals("3") || message.getText().equals("4") || message.getText().equals("5") || message.getText().equals("6") || message.getText().equals("7") || message.getText().equals("8") || message.getText().equals("9") || message.getText().equals("10") || message.getText().equals("11") || message.getText().equals("12") || message.getText().equals("13") || message.getText().equals("14") || message.getText().equals("15") || message.getText().equals("16") || message.getText().equals("17") || message.getText().equals("18") || message.getText().equals("19") || message.getText().equals("20") || message.getText().equals("21") || message.getText().equals("22"))) {
                    sendMessage.setText("Книги по запросу:" + "\n");
                    sendMessage = Parsing.parsingSection(message, sendMessage, bookRepository);
                    if (message.getText().equals("Классическая и современная проза") || message.getText().equals("10") ||
                            message.getText().equals("Литература для детей") || message.getText().equals("11")){
                        sendMessage.setText(sendMessage.getText() + "..." + "\n" + "Чтобы получить полный список книг, по данному разделу, перейдите на сайт сайт со справочником" + "\n");
                        sendMessage.setText(sendMessage.getText() + "\n" + " Вы можете получить ссылку на сайт со справочником, введя /sait");
                    }else {
                        sendMessage.setText(sendMessage.getText() + "\n" + "Для получения большей информации, можете перейти на сайт со справочником, введя /sait");
                    }
                    lastmessage = "";
                }
                if (lastmessage.equals("Направления ОГЭ") && (message.getText().equals(OGEDirection.Devotion) || message.getText().equals(OGEDirection.Humanity) || message.getText().equals(OGEDirection.Love) || message.getText().equals(OGEDirection.Realart) || message.getText().equals(OGEDirection.Compassion) || message.getText().equals(OGEDirection.Kindness) || message.getText().equals(OGEDirection.Selfeducation) || message.getText().equals(OGEDirection.Feat) || message.getText().equals(OGEDirection.Conscience) || message.getText().equals("1") || message.getText().equals("2") || message.getText().equals("3") || message.getText().equals("4") || message.getText().equals("5") || message.getText().equals("6") || message.getText().equals("7") || message.getText().equals("8") || message.getText().equals("9"))) {
                    sendMessage.setText("Книги по запросу:" + "\n");
                    sendMessage = Parsing.parsingOGE(message, sendMessage, bookRepository);
                    sendMessage.setText(sendMessage.getText() + "\n" + "Для получения большей информации, можете перейти на сайт со справочником, введя /sait");
                    lastmessage = "";
                }
                if (lastmessage.equals("Направления ЕГЭ") && (message.getText().equals(EGEDirection.Humanandnature) || message.getText().equals(EGEDirection.Familyproblems) || message.getText().equals(EGEDirection.Problemsassociatedwithnegativepersonalitytraits) || message.getText().equals(EGEDirection.Problemsassociatedwithpositivemoralqualitiesofaperson) || message.getText().equals(EGEDirection.Problemsrelatedtotheroleofartandliteratureinhumanlife) || message.getText().equals(EGEDirection.Humanandsociety) || message.getText().equals(EGEDirection.Militaryissues) || message.getText().equals(EGEDirection.Socialresponsibilityofscientistsfortheirinventions) || message.getText().equals(EGEDirection.Theproblemofloneliness) || message.getText().equals(EGEDirection.Manandstatepower) || message.getText().equals("1") || message.getText().equals("2") || message.getText().equals("3") || message.getText().equals("4") || message.getText().equals("5") || message.getText().equals("6") || message.getText().equals("7") || message.getText().equals("8") || message.getText().equals("9") || message.getText().equals("10"))) {
                    sendMessage.setText("Книги по запросу:" + "\n");
                    sendMessage = Parsing.parsingEGE(message, sendMessage, bookRepository);
                    sendMessage.setText(sendMessage.getText() + "\n" + "Для получения большей информации, можете перейти на сайт со справочником, введя /sait");
                    lastmessage = "";
                }
                if (lastmessage.equals("Направления итогового сочинения") && (message.getText().equals(EssayDirection.Loyaltyandbetrayal) || message.getText().equals(EssayDirection.Indifferenceandresponsiveness) || message.getText().equals(EssayDirection.Goalsandmeans) || message.getText().equals(EssayDirection.Courageandcowardice) || message.getText().equals(EssayDirection.Humanandsociety) || message.getText().equals("1") || message.getText().equals("2") || message.getText().equals("3") || message.getText().equals("4") || message.getText().equals("5"))) {
                    sendMessage.setText("Книги по запросу:" + "\n");
                    sendMessage = Parsing.parsingEssay(message, sendMessage, bookRepository);
                    sendMessage.setText(sendMessage.getText() + "\n" + "Для получения большей информации, можете перейти на сайт со справочником, введя /sait");
                    lastmessage = "";
                }
        }
        try {
            sendMessage(sendMessage);

        } catch (TelegramApiException e) {
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
/*
    private SendMessage debag1(String debug10, BookRepository bookRepository, SendMessage sendMessage){
        if (debug10.equals("true")) {
            int l = 1;
            SendMessage sendMessagenamin = new SendMessage();
            sendMessagenamin.setText("");
            for (Book book : bookRepository.findAll()) {
                if (sendMessagenamin.getText().length() < 3800) {
                    if (book.getSection() != null && book.getSection().equals(Section.Classicalandcontemporaryprose)) {
                        if (book.getDirectionOGE() == null) {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        } else {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                            "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        }
                        l++;
                    }
                } else {
                    if (book.getSection() != null && book.getSection().equals(Section.Classicalandcontemporaryprose)) {
                        if (book.getDirectionOGE() == null) {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        } else {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                            "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        }
                        l++;
                    }
                }
            }
            sendMessagenamin.setText("");
        }
        debug10 = "false";
        return sendMessage;
    }
    private SendMessage debag2(String debug11, BookRepository bookRepository, SendMessage sendMessage){
        if (debug11.equals("true")) {
            int l = 1;
            SendMessage sendMessagenamin = new SendMessage();
            sendMessagenamin.setText("");
            for (Book book : bookRepository.findAll()) {
                if (sendMessagenamin.getText().length() < 3800) {
                    if (book.getSection() != null && book.getSection().equals(Section.Literatureforchildren)) {
                        if (book.getDirectionOGE() == null) {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        } else {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                                } else {
                                    sendMessagenamin.setText(sendMessagenamin.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                            "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        }
                        l++;
                    }
                } else {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: нет" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: нет" + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: нет" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: нет" + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        debug   11 = "false";
        return sendMessage;
    }
*/
}