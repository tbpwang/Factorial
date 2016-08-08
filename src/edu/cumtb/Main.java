package edu.cumtb;

import java.math.BigInteger;

public class Main  {

    public static void main(String[] args) {
        // write your code here
//        long[] fac = new long[30];
//        for (int i = 0; i < 30; i++) {
//            fac[i] = factorial(i + 1L);
//        }

        BigInteger result = new BigInteger("0");

        for (int i = 1; i <= 30; i++) {
            System.out.println(i + "! = " + getFactorial(i));
            result = result.add(getFactorial(i));
        }
        System.out.println("1!+2!+31+...+30! = " + result);
    }

    static BigInteger getFactorial3(int n) {
        if (n < 0) {
            return new BigInteger("-1");
        } else if (n == 0) {
            return new BigInteger("0");
        }
        //str 2 Biginteger
        BigInteger result = new BigInteger("1");
        for (; n > 0; n--) {
            result = result.multiply(new BigInteger(String.valueOf(n)));
        }
        return result;
    }

    static BigInteger getFactorial2(int f) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= f; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }

    static BigInteger getFactorial(int n) {
        return (n == 0) ? new BigInteger("1") : (getFactorial(n - 1)).multiply(new BigInteger(String.valueOf(n)));
    }

}
