package com.example.controller;

import com.example.bot.Bot;
import com.example.domain.*;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiRequestException;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    public String bot() {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot(bookRepository));
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
        return "book";
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("section", Section.values());
        model.addAttribute("oge", OGEDirection.values());
        model.addAttribute("ege", EGEDirection.values());
        model.addAttribute("essay", EssayDirection.values());
        return "index";
    }

    @GetMapping("/books")
    public String book(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "book";
    }

    @GetMapping("/oge/Преданность")
    public String ogeDevotion(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Devotion)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Человечность")
    public String ogeHumanity(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Humanity)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Любовь")
    public String ogeLove(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Love)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Настоящее искусство")
    public String ogeRealart(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Realart)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Сострадание")
    public String ogeCompassion(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Compassion)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Доброта")
    public String ogeKindness(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Kindness)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Самовоспитание")
    public String ogeSelfeducation(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Selfeducation)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Подвиг")
    public String ogeFeat(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Feat)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/oge/Совесть")
    public String ogeConscience(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionOGE() != null && book.getDirectionOGE().equals(OGEDirection.Conscience)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Человек и природа")
    public String egeHumanandnature(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Humanandnature)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Проблемы семьи")
    public String egeFamilyproblems(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Familyproblems)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Проблемы, связанные с отрицательными качествами личности")
    public String egeProblemsassociatedwithnegativepersonalitytraits(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsassociatedwithnegativepersonalitytraits)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Проблемы, связанные с положительными нравственными качествами личности")
    public String egeProblemsassociatedwithpositivemoralqualitiesofaperson(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsassociatedwithpositivemoralqualitiesofaperson)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Проблемы, связанные с ролью искусства и литературы в жизни человека")
    public String egeProblemsrelatedtotheroleofartandliteratureinhumanlife(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Problemsrelatedtotheroleofartandliteratureinhumanlife)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Человек и общество")
    public String egeHumanandsociety(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Humanandsociety)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Военная проблематика")
    public String egeMilitaryissues(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Militaryissues)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Социальной ответственности ученых за их изобретения")
    public String egeSocialresponsibilityofscientistsfortheirinventions(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Socialresponsibilityofscientistsfortheirinventions)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Проблема одиночества")
    public String egeTheproblemofloneliness(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Theproblemofloneliness)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/ege/Человек и государственная власть (политическая)")
    public String egeManandstatepower(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEGE() != null && book.getDirectionEGE().equals(EGEDirection.Manandstatepower)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }


    @GetMapping("/essay/«Верность и измена»")
    public String essayLoyaltyandbetrayal(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Loyaltyandbetrayal)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/essay/«Равнодушие и отзывчивость»")
    public String essayIndifferenceandresponsiveness(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Indifferenceandresponsiveness)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/essay/«Цели и средства»")
    public String essayGoalsandmeans(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Goalsandmeans)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/essay/«Смелость и трусость»")
    public String essayCourageandcowardice(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Courageandcowardice)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/essay/«Человек и общество»")
    public String essayHumanandsociety(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getDirectionEssay() != null && book.getDirectionEssay().equals(EssayDirection.Humanandsociety)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }


    @GetMapping("/section/Биографии российских знаменитостей")
    public String sectionBiographiesofRussiancelebrities(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.BiographiesofRussiancelebrities)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Военная литература")
    public String sectionMilitaryliterature(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Militaryliterature)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Домоводство")
    public String sectionHousekeeping(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Housekeeping)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Дополнительное учебное пособие")
    public String sectionAdditionaltutorial(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Additionaltutorial)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Зарубежная литература")
    public String sectionForeignliterature(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Foreignliterature)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Историческая проза")
    public String sectionHistoricalprose(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Historicalprose)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Исторические романы")
    public String sectionHistoricalnovels(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Historicalnovels)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/История и теория литературы")
    public String sectionHistoryandtheoryofliterature(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Historyandtheoryofliterature)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/История. Археология. Этнография")
    public String sectionHistoryArcheologyEthnography(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.HistoryArcheologyEthnography)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Классическая и современная проза")
    public String sectionClassicalandcontemporaryprose(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Classicalandcontemporaryprose)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Литература для детей")
    public String sectionLiteratureforchildren(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Literatureforchildren)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Литература для школьников")
    public String sectionLiteratureforschoolchildren(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Literatureforschoolchildren)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Литературная критика")
    public String sectionLiterarycriticism(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Literarycriticism)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Повести и рассказы о животных")
    public String sectionStoriesandstoriesaboutanimals(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Storiesandstoriesaboutanimals)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Познавательная литература")
    public String sectionCognitiveLiterature(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.CognitiveLiterature)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Поэзия")
    public String sectionPoetry(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Poetry)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Приключенческие романы")
    public String sectionAdventurenovels(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Adventurenovels)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Публицистика")
    public String sectionPublicism(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Publicism)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Путешествия. Хобби. Фото. Спорт")
    public String sectionTravelsHobbyAphotoSport(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.TravelsHobbyAphotoSport)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Рассказы")
    public String sectionShortStories(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.ShortStories)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Транспорт")
    public String sectionTransport(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.Transport)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }

    @GetMapping("/section/Фантастика. Фэнтези. Мистика")
    public String sectionFantasticFantasyMystic(Model model) {
        List<Book> devotionBook = new ArrayList<>();
        for (Book book : bookRepository.findAll()) {
            if (book.getSection().equals(Section.FantasticFantasyMystic)) {
                devotionBook.add(book);
            }
        }
        model.addAttribute("books", devotionBook);
        return "book";
    }
}
