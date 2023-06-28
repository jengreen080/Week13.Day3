public enum Coin {
    FIVE(5),
    TEN(10),
    TWENTY(20),
    FIFTY(50),
    ONE_POUND(100),
    TWO_POUND(200);


    private int value;

    public int getValue() {
        return value;
    }

    Coin(int value) {
        this.value = value;



    }
}
