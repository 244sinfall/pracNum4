/*
Задание выполнил студент ЗКИ21-16Б
Филин Дмитрий Алексеевич
 */


import java.util.Scanner;

/**
 * В варианте указано, какой интерфейс и какие классы, его имплементирующие, необходимо реализовать.
 * Функцию, переопределяющую поведение метода интерфейса, необходимо оформить в виде лямбда-функции.
 * 8) Необходимо описать интерфейс, содержащий одну функцию
 * int analyse(String str);
 * Данный интерфейс производит анализ строки по интересующему критерию.
 * Необходимо реализовать два класса для этого интерфейса. Первый класс должен возвращать
 * количество гласных букв в строке, а второй − возвращать количество согласных букв в строке.
 * Необходимо, чтобы приложение запросило у пользователя строку и выдало результаты вычисления
 * для обоих классов. В строке должны быть только символы латинского алфавита, символов кириллицы быть не должно.
 */
public class Main {
    public static int analyzeString(String str, Analyzer analyzer) {
        return analyzer.analyse(str);
    }
    public static void main(String[] args) {
        Analyzer ConsonantsLambda = (str) -> {
            String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
            int amount = 0;
            for(int i = 0; i < str.length(); i++) {
                if(cons.contains(String.valueOf(str.charAt(i)))) {
                    amount++;
                }
            }
            return amount;
        };
        Analyzer VowelsLambda = (str) -> {
            String vowels = "aeiouAEIOU";
            int amount = 0;
            for(int i = 0; i < str.length(); i++) {
                if(vowels.contains(String.valueOf(str.charAt(i)))) {
                    amount++;
                }
            }
            return amount;
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для анализа (только латиница):");
        String stringToAnalyze = scanner.nextLine();
        int vowels = Main.analyzeString(stringToAnalyze, VowelsLambda);
        int consonants = Main.analyzeString(stringToAnalyze, ConsonantsLambda);
        int lambdaStrCount = Main.analyzeString(stringToAnalyze, String::length);
        System.out.printf("В строке %d гласных и %d согласных. Всего в строке %d символов\n", vowels, consonants, lambdaStrCount);
        System.exit(0);
    }
}