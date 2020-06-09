import java.util.Scanner;
public class HzNa {
    public static void num (){
        
         Scanner sc = new Scanner (System.in);
         String str = sc.nextLine ();
         Scanner scanner = new Scanner (str);

        try {
          Op.num1 = ( scanner.next () );
          Op.op = ( scanner.next () );
          Op.num2 = ( scanner.next () );

         } catch (java.util.NoSuchElementException e) {
             System.out.println ("Пример \n 5 - 7");
         }
         switch  (Op.num1){
             case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "I", "II", "III", "IV", "V","VI", "VII", "VIII","IX","X":
                 break;
             default:
                 System.out.println ("num1 - ERROR");
                 break;
         }
         switch (Op.num2){
             case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "I", "II", "III", "IV", "V","VI", "VII", "VIII","IX","X":
                 break;
             default:
                 System.out.println ("num2 - ERROR");
                 break;
         }
            switch (Op.op){
                case "+", "-", "*", "/":
                    break;
                default:
                    System.out.println ("operator - ERROR");
                    break;
            }

    }
}
