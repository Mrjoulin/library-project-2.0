package com.example.domain;

public enum OGEDirection {
    Devotion("Преданность"),//0
    Humanity("Человечность"),//1
    Love("Любовь"),//2
    Realart("Настоящее искусство"),//3
    Compassion("Сострадание"),//4
    Kindness("Доброта"),//5
    Selfeducation("Самовоспитание"),//6
    Feat("Подвиг"),//7
    Conscience("Совесть");//8

    private final String title;

    /**
     * @param title - название направления ОГЭ
     */
    OGEDirection(String title) {
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
