package domain;

public enum EssayDirection {
    Loyaltyandbetrayal("«Верность и измена»"),//0
    Indifferenceandresponsiveness("«Равнодушие и отзывчивость»"),//1
    Goalsandmeans("«Цели и средства»"),//2
    Courageandcowardice("«Смелость и трусость»"),//3
    Humanandsociety ("«Человек и общество»");//4

    private final String title;

    /**
     * @param title - название направления сочинения
     */
    EssayDirection(String title) {
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
