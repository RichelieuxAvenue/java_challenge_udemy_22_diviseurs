public class Diviseurs {
    /*
    Écrivez une méthode appelée printFactors avec un paramètre de type int nommé number.

Si number est inférieur à 1, la méthode doit afficher “Invalid Value”.

La méthode doit afficher tous les diviseurs de ce nombre. Un diviseur d’un nombre est un entier qui divise entièrement ce nombre (c’est-à-dire sans laisser de reste).

Par exemple, 3 est un diviseur de 6 parce que 3 divise entièrement 6 sans laisser de reste. En d’autres termes, 6 / 3 = 2.

EXEMPLES D’ENTRÉES/SORTIES :

	•	printFactors(6); → doit afficher 1 2 3 6
	•	printFactors(32); → doit afficher 1 2 4 8 16 32
	•	printFactors(10); → doit afficher 1 2 5 10
	•	printFactors(-1); → doit afficher "Invalid Value" car number est inférieur à 1

CONSEIL : Utilisez une boucle while ou for.

REMARQUE : Lorsque vous affichez les nombres, chaque nombre peut être sur une ligne séparée. Ils n’ont pas besoin d’être séparés par un espace.
Par exemple, l’affichage pour printFactors(10); peut être :
     */
    public static void printFactors(int nombre){
        if (nombre < 1){
            System.out.println("Invalid Value");
        }
        for (int compteur = 1; compteur <= nombre; compteur++){
            if (nombre % compteur == 0){
                System.out.printf("%d est diviseur de %d%n", compteur, nombre);
            }
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
}
