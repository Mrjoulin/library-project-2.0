package com.example.bot;

import com.example.domain.*;
import com.example.repository.BookRepository;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;

public class Parsing {
    public static SendMessage  parsingSection(Message message, SendMessage sendMessage, BookRepository bookRepository){
        int l = 1;
        if (message.getText().equals("Биографии российских знаменитостей") || message.getText().equals("1")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.BiographiesofRussiancelebrities)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Военная литература") || message.getText().equals("2")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Militaryliterature)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Домоводство") || message.getText().equals("3")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Housekeeping)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Дополнительное учебное пособие") || message.getText().equals("4")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Additionaltutorial)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Зарубежная литература") || message.getText().equals("5")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Foreignliterature)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Историческая проза") || message.getText().equals("6")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Historicalprose)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Исторические романы") || message.getText().equals("7")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Historicalnovels)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("История и теория литературы") || message.getText().equals("8")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Historyandtheoryofliterature)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("История. Археология. Этнография") || message.getText().equals("9")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.HistoryArcheologyEthnography)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Классическая и современная проза") || message.getText().equals("10")) {
            for (Book book : bookRepository.findAll()) {
                if (sendMessage.getText().length() < 3850) {
                    if (book.getSection() != null && book.getSection().equals(Section.Classicalandcontemporaryprose)) {
                        if (book.getDirectionOGE() == null) {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        } else {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                            "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        }
                        l++;
                    }
                }
                else {
                    break;
                }
            }
        }
        if (message.getText().equals("Литература для детей") || message.getText().equals("11")) {
            for (Book book : bookRepository.findAll()) {
                if (sendMessage.getText().length() < 3850) {
                    if (book.getSection() != null && book.getSection().equals(Section.Literatureforchildren)) {
                        if (book.getDirectionOGE() == null) {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        } else {
                            if (book.getDirectionEGE() == null) {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            } else {
                                if (book.getDirectionEssay() == null) {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                                } else {
                                    sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                            "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                            "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                                }
                            }
                        }
                        l++;
                    }
                }
                else {
                    break;
                }
            }
        }
        if (message.getText().equals("Литература для школьников") || message.getText().equals("12")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Literatureforschoolchildren)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Литературная критика") || message.getText().equals("13")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Literarycriticism)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Повести и рассказы о животных") || message.getText().equals("14")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Storiesandstoriesaboutanimals)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Познавательная литература") || message.getText().equals("15")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.CognitiveLiterature)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Поэзия") || message.getText().equals("16")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Poetry)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Приключенческие романы") || message.getText().equals("17")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Adventurenovels)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Публицистика") || message.getText().equals("18")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Publicism)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Путешествия. Хобби. Фото. Спорт") || message.getText().equals("19")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.TravelsHobbyAphotoSport)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Рассказы") || message.getText().equals("20")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.ShortStories)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Транспорт") || message.getText().equals("21")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.Transport)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Фантастика. Фэнтези. Мистика") || message.getText().equals("22")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getSection() != null && book.getSection().equals(Section.FantasticFantasyMystic)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        return sendMessage;
    }
    public static SendMessage  parsingOGE(Message message, SendMessage sendMessage, BookRepository bookRepository){
        int l = 1;
        if (message.getText().equals("Преданность") || message.getText().equals("1")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Devotion)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Человечность") || message.getText().equals("2")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Humanity)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Любовь") || message.getText().equals("3")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Love)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Настоящее искусство") || message.getText().equals("4")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Realart)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Сострадание") || message.getText().equals("5")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Compassion)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Доброта") || message.getText().equals("6")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Kindness)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Самовоспитание") || message.getText().equals("7")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Selfeducation)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Подвиг") || message.getText().equals("8")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Feat)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Совесть") || message.getText().equals("9")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Conscience)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        return sendMessage;
    }
    public static SendMessage  parsingEGE(Message message, SendMessage sendMessage, BookRepository bookRepository){
        int l = 1;
        if (message.getText().equals("Человек и природа") || message.getText().equals("1")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Humanandnature)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Проблемы семьи") || message.getText().equals("2")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Familyproblems)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Проблемы, связанные с отрицательными качествами личности") || message.getText().equals("3")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsassociatedwithnegativepersonalitytraits)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Проблемы, связанные с положительными нравственными качествами личности") || message.getText().equals("4")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsassociatedwithpositivemoralqualitiesofaperson)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Проблемы, связанные с ролью искусства и литературы в жизни человека") || message.getText().equals("5")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsrelatedtotheroleofartandliteratureinhumanlife)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Человек и общество") || message.getText().equals("6")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Humanandsociety)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Военная проблематика") || message.getText().equals("7")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Militaryissues)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Социальной ответственности ученых за их изобретения") || message.getText().equals("8")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Socialresponsibilityofscientistsfortheirinventions)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Проблема одиночества") || message.getText().equals("9")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Theproblemofloneliness)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("Человек и государственная власть (политическая)") || message.getText().equals("10")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Manandstatepower)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        return sendMessage;
    }
    public static SendMessage  parsingEssay(Message message, SendMessage sendMessage, BookRepository bookRepository){
        int l = 1;
        if (message.getText().equals("«Верность и измена»") || message.getText().equals("Верность и измена") || message.getText().equals("1")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Loyaltyandbetrayal)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("«Равнодушие и отзывчивость»") || message.getText().equals("Равнодушие и отзывчивость") || message.getText().equals("2")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Indifferenceandresponsiveness)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("«Цели и средства»") || message.getText().equals("Цели и средства") || message.getText().equals("3")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Goalsandmeans)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("«Смелость и трусость»") || message.getText().equals("Смелость и трусость") || message.getText().equals("4")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Courageandcowardice)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        if (message.getText().equals("«Человек и общество»") || message.getText().equals("Человек и общество") || message.getText().equals("5")) {
            for (Book book : bookRepository.findAll()) {
                if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Humanandsociety)) {
                    if (book.getDirectionOGE() == null) {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    } else {
                        if (book.getDirectionEGE() == null) {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        } else {
                            if (book.getDirectionEssay() == null) {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() + "\n");
                            } else {
                                sendMessage.setText(sendMessage.getText() + l + ". Название: " + book.getTitle() + "\n" + "Автор: " + book.getAuthors() + "\n" +
                                        "Раздел:" + book.getSection() + "\n" + " Направления:" + "\n" + "ОГЭ: " + book.getDirectionOGE() + "\n" + "ЕГЭ: " + book.getDirectionEGE() +
                                        "\n" + "Итогового сочинения: " + book.getDirectionEssay() + "\n");
                            }
                        }
                    }
                    l++;
                }
            }
        }
        return sendMessage;
    }
}
