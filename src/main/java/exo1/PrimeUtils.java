package exo1;

import java.util.ArrayList;
import java.util.List;

public class PrimeUtils {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false; // Optimisation : exclure les nombres pairs

        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static List<Integer> generatePrimes(int limit) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primes = generatePrimes(limit);
        System.out.println("Nombres premiers : " + primes);
    }
}








/*
Améliorations :
        ✅ Séparation des responsabilités : isPrime() et generatePrimes() sont des méthodes réutilisables.
        ✅ Optimisation de la vérification (évite les tests inutiles en utilisant Math.sqrt()).
        ✅ Code plus lisible et maintenable.

 */