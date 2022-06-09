package com.company;

public class BinOps {
    public String sum(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int sum = aInt + bInt;
        String c = Integer.toBinaryString(sum);
        return c;
    }

    public String mult(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);
        int mult = aInt * bInt;
        String c = Integer.toBinaryString(mult);
        return c;
    }
}
