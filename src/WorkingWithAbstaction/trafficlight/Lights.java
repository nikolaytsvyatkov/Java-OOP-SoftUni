package WorkingWithAbstaction.trafficlight;

public enum Lights {
        RED(1),
        GREEN(2),
        YELLOW(3);
        private int value;

    Lights(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
