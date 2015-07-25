package com.reversedBinary;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Solver {

    private final Reader reader;

    public Solver(Reader reader) {
        this.reader = reader;
    }

    public String solve() {
        int input = reader.readInt();

        int result = calculate(input);

        return Integer.toString(result);
    }

    public static int calculate(int toReverse) {
        String reversedString = Integer.toBinaryString(toReverse);
        StringBuilder builder = new StringBuilder(reversedString.length());

        for (int i = reversedString.length() - 1; i >= 0; i--) {
            builder.append(reversedString.charAt(i));
        }

       return Integer.parseInt(builder.toString(), 2);
    }
}
