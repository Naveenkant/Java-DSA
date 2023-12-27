
package cloud_vandana;
import java.util.*;
public class RomanToInteger {


    private static final Map<Character, Integer> romanNumerals = new HashMap<>();

    static {
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);
    }

    public static int romanToInteger(String roman) {
        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentValue = romanNumerals.get(roman.charAt(i));

            if (i < roman.length() - 1 && romanNumerals.get(roman.charAt(i + 1)) > currentValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 
        String romanNumeral = "IX";
        int result = romanToInteger(romanNumeral);
        System.out.println("Roman numeral " + romanNumeral + " is equal to " + result);
    }
}
