import java.util.Comparator;

public class App {
    public static void main(String[] args) {
//        try {
//            for (int i = 0; i < 200; i++) {
//                new Month(1, "Cold");
//            }
//        } catch (RuntimeException rt) {
//        }
        MonthsEnum jan = MonthsEnum.JANUARY;
        System.out.println(jan.getName());
        for (MonthsEnum months: MonthsEnum.values()){
            System.out.println(months.getName());
            System.out.println(months.name());
        }
        new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return 0;
            }

        };


    }
}
