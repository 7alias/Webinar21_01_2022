public class Month {

    private static Month[] months = new Month[12];
    private static int totalMonths = 0;
    private final String name;

    private final int number;
    private final String description;

public Month[] createInstances(){{
    months[0] = new Month(1, "");
} return months;}

    public Month(int number, String description) {
        if (totalMonths <= 11) {
            name = switch (number) {
                case 1 -> "Jan";
                default -> "December";
            };

            this.number = number;

            this.description = description;
            months[totalMonths++] = this;
        } else {
            throw new RuntimeException();
        }
    }
}
