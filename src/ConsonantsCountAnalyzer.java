/**
 * Реализация интерфейса {@link Analyzer} для вычисления количества согласных в строке
 */
public class ConsonantsCountAnalyzer implements Analyzer {
    private boolean isConsonant(char c) {
        String cons = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        return cons.contains(String.valueOf(c));
    }
    @Override
    public int analyse(String str) {
        int amount = 0;
        for(int i = 0; i < str.length(); i++) {
            if(isConsonant(str.charAt(i))) {
                amount++;
            }
        }
        return amount;
    }
}
