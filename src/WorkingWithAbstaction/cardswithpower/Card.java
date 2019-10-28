package WorkingWithAbstaction.cardswithpower;

public class Card {
    private CardRank type1;
    private CardRank1 power1;

    public Card(String type,String power) {
        this.type1 = CardRank.valueOf(type);
        this.power1 = CardRank1.valueOf(power);
    }
    public int getPower() {
        return type1.getValue() + power1.getValue();
    }
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",this.type1, this.power1, getPower());
    }
}
