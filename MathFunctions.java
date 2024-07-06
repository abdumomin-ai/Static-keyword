import java.util.Scanner;

public class MathFunctions {
    static int uchburchakTomonlari(int aTomon, int bTomon, int cTomon) {
        return aTomon + bTomon + cTomon;
    }

    public static void main(String[] args) {
        int uchburchakYuzi = uchburchakTomonlari(3, 7, 8);
        System.out.println(uchburchakYuzi);
    }


}
