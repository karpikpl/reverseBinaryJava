package com.reversedBinary;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Reader reader;

        if (args.length != 0) {
            reader = new Reader(args[0]);
        } else {
            reader = new Reader(System.in);
        }

        Solver solver = new Solver(reader);
        System.out.println(solver.solve());
    }
}

