package domain;

public enum Section {
    BiographiesofRussiancelebrities("Биографии российских знаменитостей"),//0
    Militaryliterature("Военная литература"),//1
    Housekeeping("Домоводство"),//2
    Additionaltutorial("Дополнительное учебное пособие"),//3
    Foreignliterature("Зарубежная литература"),//4
    Historicalprose("Историческая проза"),//5
    Historicalnovels("Исторические романы"),//6
    Historyandtheoryofliterature("История и теория литературы"),//7
    HistoryArcheologyEthnography("История. Археология. Этнография"),//8
    Classicalandcontemporaryprose("Классическая и современная проза"),//9
    Literatureforchildren("Литература для детей"),//10
    Literatureforschoolchildren("Литература для школьников"),//11
    Literarycriticism("Литературная критика"),//12
    Storiesandstoriesaboutanimals("Повести и рассказы о животных"),//13
    CognitiveLiterature("Познавательная литература"),//14
    Poetry("Поэзия"),//15
    Adventurenovels("Приключенческие романы"),//16
    Publicism("Публицистика"),//17
    TravelsHobbyAphotoSport("Путешествия. Хобби. Фото. Спорт"),//18
    ShortStories("Рассказы"),//19
    Transport("Транспорт"),//20
    FantasticFantasyMystic("Фантастика. Фэнтези. Мистика");//21

    private final String title;

    /**
     * @param title - название раздела
     */
    Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return title;
    }
}
