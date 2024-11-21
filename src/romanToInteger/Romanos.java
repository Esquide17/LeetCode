package romanToInteger;

import java.util.HashMap;

class Romans {
    public int romanToInt(String s) {

        int result = 0;

        HashMap<String, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put("I", 1);
        romanNumbers.put("V", 5);
        romanNumbers.put("X", 10);
        romanNumbers.put("L", 50);
        romanNumbers.put("C", 100);
        romanNumbers.put("D", 500);
        romanNumbers.put("M", 1000);

        for (int i = 0; i < s.length(); i++) {

            int currentValue = romanNumbers.get(String.valueOf(s.charAt(i)));

            if (i < s.length() - 1) {

                int nextValue = romanNumbers.get(String.valueOf(s.charAt(i + 1)));

                if (currentValue < nextValue) {

                    result -= currentValue;
                } else {

                    result += currentValue;
                }
            } else {

                result += currentValue;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Romans romans = new Romans();
        String input = "LVIII";
        System.out.println(romans.romanToInt(input));
    }
}
