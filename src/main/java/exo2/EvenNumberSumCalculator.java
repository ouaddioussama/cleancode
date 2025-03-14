package exo2;

public class EvenNumberSumCalculator {

    /**
     * Calcule la somme des nombres pairs de 1 à n.
     *
     * @param n l'entier jusqu'auquel nous devons sommer les nombres pairs.
     * @return la somme des nombres pairs de 1 à n, ou 0 si n est inférieur à 1.
     */
    public static int sumEvenNumbers(int n) {
        if (n < 1) {
            return 0;  // Retourner 0 si n est inférieur à 1
        }

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {  // Commencer à partir de 2 et ajouter 2 à chaque itération
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(10));  // Devrait afficher 30
        System.out.println(sumEvenNumbers(1));   // Devrait afficher 0
        System.out.println(sumEvenNumbers(-5));  // Devrait afficher 0
    }
}
