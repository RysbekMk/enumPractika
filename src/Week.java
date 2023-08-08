import java.io.IOException;

public enum Week {
    MONDAY("Дуйщомбу"),
    TUESDAY("Шейшемби"),
    WEDNESDAY("Шаршемби"),
    THURSDAY("Бейшемби"),
    FRIDAY("Жума"),
    SATURDAY("Ишемби"),
    SUNDAY("Жекшемби");

    private final String kyrgyzName;

     Week(String kyrgyzName) {
        this.kyrgyzName = kyrgyzName;
    }


    @Override
    public String toString() {
        return kyrgyzName;
    }
    public static void methodExit(int san){
         String soz;
             if (san==0) {
                 throw new MyException("ПРОГРАММА ТОКТОДУ!!!!");
             } else{
                 System.out.println("Улантабыз =>");
         }
    }
}
