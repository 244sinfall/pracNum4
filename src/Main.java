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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для анализа (только латиница):");
        String stringToAnalyze = scanner.nextLine();
        int vowels = Main.analyzeString(stringToAnalyze, new VowelsCountAnalyzer());
        int consonants = Main.analyzeString(stringToAnalyze, new ConsonantsCountAnalyzer());
        int lambdaStrCount = Main.analyzeString(stringToAnalyze, String::length);
        System.out.printf("В строке %d гласных и %d согласных. Всего в строке %d символов\n", vowels, consonants, lambdaStrCount);
        System.exit(0);
    }
}