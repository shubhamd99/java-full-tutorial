package FormattingNumbers;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Main {
    public static void main(String[] args) {
        // We cannot create instance of NumberFormat class because its an abstract
        // NumberFormat currency = new NumberFormat();

        // Factory method

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result); // ₹ 1,234,567.89

        NumberFormat percentage = NumberFormat.getPercentInstance();
        String result2 = percentage.format(0.1); // 10%
        System.out.println(result2); //
    }
}
