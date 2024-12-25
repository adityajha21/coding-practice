package org.example.string;

import java.math.BigInteger;

public class AddLargeNumbers {
    public static void main(String[] args) {
        String str1 = "385465873546875634875634875634875634784658";
        String str2 = "565479857349857349857349875983475984375984375983475983475983475983475983475983475983479587349587394857394875934875983475983475973498573987593848658347";

        BigInteger b1 = new BigInteger(str1);
        BigInteger b2 = new BigInteger(str2);
        System.out.println(b1.add(b2));
    }
}
