package com.reversedBinary;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by pkarpala on 7/25/2015.
 */
public class Reader {

    private final InputStreamReader streamReader;
    private final Scanner scanner;

    public Reader(InputStream inputStream) {
        streamReader = new InputStreamReader(inputStream);
        scanner = new Scanner(streamReader);
    }

    public Reader(String inputString) {
        this(new ByteArrayInputStream(inputString.getBytes(StandardCharsets.UTF_8)));
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public String readLine() {
        return scanner.nextLine();
    }
}
