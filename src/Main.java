import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        somme(scanner);
        division(scanner);
        volume(scanner);
        scanner.close();


    }

    public static void somme(Scanner scanner) {
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }
    public static void division(Scanner scanner) {
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int div = premierEntier/deuxiemeEntier;
        System.out.println("La  division de " + premierEntier + " avec  celui du " + deuxiemeEntier +
                "est egale a " + div);
    }

    public static void  volume(Scanner sc) {
        System.out.println("entrer la longeur ");
        int longeur =sc.nextInt();
        System.out.println("entrer la hauteur");
        int hauteur  =sc.nextInt();
        System.out.println("Entrer la largeur ");
        int largeur = sc.nextInt();
        int volume = longeur * hauteur*largeur ;
        System.out.println("Le volume du pavé droit est: " + volume);
    }
}
