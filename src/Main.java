import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String word = scanner.nextLine();
            Week week;
            try {
                week = Week.valueOf(word.toUpperCase());
                if (week == Week.MONDAY) {
                    System.out.println(Week.MONDAY + ": Бул кун теория сабагы!");
                } else if (week == Week.TUESDAY) {
                    System.out.println(Week.TUESDAY + ": Бул кун Technical English & практика сабагы!");
                } else if (week == Week.WEDNESDAY) {
                    System.out.println(Week.WEDNESDAY + ": Бул кун теория сабагы!");
                } else if (week == Week.THURSDAY) {
                    System.out.println(Week.THURSDAY + ": Бул кун практика сабагы!");
                } else if (week == Week.FRIDAY) {
                    System.out.println(Week.FRIDAY + ": Бул кун теория сабагы!");
                } else if (week == Week.SATURDAY) {
                    System.out.println(Week.SATURDAY + ": Бул кун практика сабагы!");
                } else if (week == Week.SUNDAY) {
                    System.out.println(Week.SUNDAY + ": Бул кун дем алыш!");
                }
                System.out.println("====== Токтотуу учун 0 ду===== \n===== Улантуу учун башка сан жазыныз! =====");
                Week.methodExit(scanner.nextInt());
            } catch (IllegalArgumentException a) {
                System.out.println("Туура эмес жаздыныз!!!");
            }
        }
    }
}