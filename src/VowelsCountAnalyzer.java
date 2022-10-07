/**
 * Реализация интерфейса {@link Analyzer} для вычисления количества гласных в строке
 */
public class VowelsCountAnalyzer implements Analyzer {
    private boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.contains(String.valueOf(c));
    }
    @Override
    public int analyse(String str) {
        int amount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))) {
                amount++;
            }
        }
        return amount;
    }
}
