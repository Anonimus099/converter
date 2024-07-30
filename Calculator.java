import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;
        float RUBToUSD = 0.012f, USDToRub = 86.6286f, enterSum, res;

//      ЗДЕСЬ МЫ ВВОДИМ СУММУ КОТОРУЮ БУДЕМ КОНВЕРТИРОВАТЬ
        System.out.println("\nДобро пожаловать в конвертатор валют :)");
        System.out.println("Введите сумму");
        System.out.print(": ");
        enterSum = scanner.nextInt();

//      ЗДЕСЬ МЫ ВВОДИМ ВАЛЮТУ КОТОРУЮ БУДЕМ КОНВЕРТИРОВАТЬ
        System.out.println("Введите тип конвертации(USD или RUB)");
        System.out.print(": ");
        value = scanner.next();
        if (value.equals("USD")) {
            res = enterSum * USDToRub;
            System.out.println(enterSum + " по курсу USD to RUB - 86,6286 = " + res + "₽");
        }else if (value.equals("RUB")) {
            res = enterSum * RUBToUSD;
            System.out.println(enterSum + " по курсу RUB to USD - 0,012 = " + res + "$");
        }else {
            System.out.println("Вы ввели некорректную валюту\nИспользуйте 'USD' либо 'RUB'");
        }



    }
}