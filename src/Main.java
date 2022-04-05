import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.println("\nВведите данные в фортмате: число ,арифмитическая операция, число. Все данные строго через пробел");
            System.out.println("Калькулятор поддерживает как римские цыфры ,так и арабские от 0 до 10 и  I до X включительно");
            System.out.println("_______________________________________________________________________________________________");
            System.out.print("Ввод: ");

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] inputSplit = str.split(" ");
            if (inputSplit.length != 3) {
                System.err.println("Вы ввели некоректное выражение");
            }

            String a = inputSplit[0];
            String operate = inputSplit[1];
            String b = inputSplit[2];

            if (Valid.validArabic(a) && Valid.validArabic(b) && operate.length() == 1) {
                System.out.println("Результат: " + Calculate.calc(Integer.parseInt(a), Integer.parseInt(b), operate.charAt(0)));
            } else if (Valid.validRome(a) && Valid.validRome(b) && operate.length() == 1) {
                System.out.println("Результат = " + Conversion.arabicToRome(Calculate.calc(Conversion.romeToArabic(a), +
                        Conversion.romeToArabic(b), operate.charAt(0))));
            } else {
                System.err.println("Не допустимые значения");
            }
        }
    }
