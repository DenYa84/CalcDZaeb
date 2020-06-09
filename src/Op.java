public class Op {
    static String num1;
    static String num2;
    static String op;

    public static void numAr() {

        switch (num1) {
            case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> {
                switch (num2) {
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> Operation.Arab ();
                    default -> System.out.println ("Только Римские или только Арабские цифры");
                }

            }
            default -> numRom ();
        }

    }

    public static void numRom() {
        switch (num1) {
            case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> {
                switch (num2) {
                    case "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" -> Operation.Rom ();
                    default -> System.out.println ("Только Римские или только Арабские цифры");

                }

            }
        }
    }
}


