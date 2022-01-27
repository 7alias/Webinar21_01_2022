public enum MonthsEnum {

    JANUARY("Jan", 1)

    ,
    FEBRUARY("Feb", 2);

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    private final String name;
    private final int number;

    MonthsEnum(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
