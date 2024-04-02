package org.craftsMansTDD;

public class StringCalculator {
    public int addStringNumbers(String numbers) {
        int sum = 0;
        // Split the string based on the following special characters
        String[] numsArray = numbers.split("[,;/\\n//]");
        // Iterate through numsArray array
        for (String num : numsArray) {
            try {
                int number = Integer.parseInt(num);
                if (number > 0) {
                    sum += number;
                }

            } catch (NumberFormatException ignored) {
                // Ignore non-numeric parts
            }
        }
        return sum;

    }
}
