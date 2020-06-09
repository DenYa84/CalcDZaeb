/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt();
        //строка для поиска
        String searchMe = (scanner.next());
        double b = scanner.nextDouble();
        if (a > 0 && a < 11 && b < 11 && b > 0) {
        } else
        { System.out.println("ERROR");
            return;}

        //количество символов в строке
        int max = searchMe.length();
        //символ, который нужно найти в строке

        //переключатель найдено/не найдено
        for (int i = 0; i < max; i++) {
            // если символ на позиции i в строке равен искомому символу
        //    char op = '-';
            if (searchMe.charAt(i) == '-') {
                double z = a - b;
                System.out.println(z);
            }
       //     char op1 = '+';
            if (searchMe.charAt(i) == '+') {
                double z = a + b;
                System.out.println(z);
            }
        //    char op2 = '*';
            if (searchMe.charAt(i) == '*') {
                double z = a * b;
                System.out.println(z);
            }
       //     char op3 = '/';
            if (searchMe.charAt(i) == '/') {
                double z = a / b;
                System.out.println(z);
            }


        }
    }
}*/
