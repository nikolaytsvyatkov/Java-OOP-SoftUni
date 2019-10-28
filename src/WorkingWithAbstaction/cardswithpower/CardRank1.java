package WorkingWithAbstaction.cardswithpower;

public enum CardRank1 {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int value;

    CardRank1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
