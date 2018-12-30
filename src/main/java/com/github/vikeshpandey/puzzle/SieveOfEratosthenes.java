package com.github.vikeshpandey.puzzle;

public class SieveOfEratosthenes {
    private static boolean[] sieveOfEratosthenes(int max) {
        boolean[] flags = new boolean[max];
        setAllEntriesToTrue(flags);
        int prime = 2;
        while (prime <= Math.sqrt(max)) {
            crossOff(flags, prime);
            prime = getNextPrime(flags, prime);
        }
        return flags;
    }

    private static int getNextPrime(final boolean[] flags,
                                    final int currentPrime) {
        int nextPrime = currentPrime + 1;
        while (nextPrime < flags.length && !flags[nextPrime]) {
            nextPrime++;
        }
        return nextPrime;
    }

    private static void crossOff(final boolean[] flags, final int prime) {
        for (int i = prime * prime; i < flags.length; i = i + prime) {
            flags[i] = false;
        }
    }

    private static void setAllEntriesToTrue(final boolean[] flags) {
        for (int i = 0; i < flags.length; i++) {
            flags[i] = true;
        }
    }

    public static void main(String[] args) {
        boolean[] booleans = sieveOfEratosthenes(99);
        for (int i = 0; i < booleans.length; i++) {
            System.out.println(booleans[i]);
        }
    }
}
