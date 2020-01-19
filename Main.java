package methods;

    import java.util.GregorianCalendar;

    public class Main {

        public static void main(String[] args) {
            byte x = 100;
            short s = 25482;
            char y = 'a';
            int i = 524467;
            long l = 82446544L;
        }

        public int task3(int a, int b, int c, int d) {
            return a * (b + (c / d));
        }

        public boolean task4(int a, int b) {
            return a + b >= 10 && a + b <= 20;
        }

        public void task5(int number) {
            System.out.println(number >= 0 ? "Positive" : "Negative");
        }

        public boolean task6(int val) {
            return val < 0;
        }

        public void task7(String name) {
            System.out.println("Привет" + name);
        }

        public boolean isLeapYear(int year) {
            return (year%100 != 0) || (year%400 == 0); // Gregorian
        }

    }

