package exo1;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 50;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {  // on peut s'arreter à sqrt de i
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        System.out.println("Nombres premiers : " + primes);
    }

}










//Problèmes :
//Vérification inefficace de la primalité (on peut s'arrêter à √n).
//Mauvaise séparation des responsabilités (tout est dans main).
//Pas de réutilisation possible du test de primalité.