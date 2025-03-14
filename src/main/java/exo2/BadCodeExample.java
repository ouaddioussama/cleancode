package exo2;


//Kata : Calculer la somme des nombres pairs dans une plage
//Énoncé :
//Écrivez une fonction qui prend en entrée un entier n et calcule la somme de tous
// les nombres pairs de 1 à n (inclus). Si n est inférieur à 1, la fonction doit retourner 0.
//
//Solution avec mauvais code (ne respectant pas les bonnes pratiques) :

public class BadCodeExample {

    public static int sumEvenNumbers(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumEvenNumbers(10)); // Devrait afficher 30
        System.out.println(sumEvenNumbers(1));  // Devrait afficher 0
        System.out.println(sumEvenNumbers(-5)); // Devrait afficher 0
    }
}



/*
Problèmes dans cette solution :
Nom de la classe : Le nom BadCodeExample n'a pas de sens. Un nom plus approprié comme EvenNumberSumCalculator serait préférable.
Conditions inutiles : La condition if (n > 0) peut être améliorée pour ne pas rendre le code redondant. En fait, si n est inférieur à 1, la méthode pourrait directement retourner 0 sans passer par une boucle.
Noms des variables : Le nom de la variable sum est correct, mais il pourrait être encore plus explicite comme evenSum pour mieux décrire ce qu'il représente.
Boucle inefficace : La boucle parcourt tous les nombres de 1 à n, mais on pourrait améliorer la logique pour commencer à partir de 2 et sauter chaque nombre pair, ce qui serait plus efficace.
Manque de gestion des cas limites : Pas de validation explicite pour les valeurs négatives. Il serait préférable d'aborder ces cas de manière plus claire.

 */