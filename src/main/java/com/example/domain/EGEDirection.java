package com.example.domain;

public enum EGEDirection {
    Humanandnature("Человек и природа"),//0
    Familyproblems("Проблемы семьи"),//1
  /*2*/  Problemsassociatedwithnegativepersonalitytraits("Проблемы, связанные с отрицательными качествами личности"),
  /*3*/  Problemsassociatedwithpositivemoralqualitiesofaperson("Проблемы, связанные с положительными нравственными качествами личности"),
  /*4*/  Problemsrelatedtotheroleofartandliteratureinhumanlife("Проблемы, связанные с ролью искусства и литературы в жизни человека"),
    Humanandsociety("Человек и общество"),//5
    Militaryissues("Военная проблематика"),//6
  /*7*/  Socialresponsibilityofscientistsfortheirinventions("Социальной ответственности ученых за их изобретения"),
    Theproblemofloneliness("Проблема одиночества"),//8
    Manandstatepower("Человек и государственная власть (политическая)");//9

    private final String title;

    /**
     * @param title - название направления ЕГЭ
     */
    EGEDirection(String title) {
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
