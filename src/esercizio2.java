import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci prima stinga");
        String primaStringa = scanner.nextLine();

        System.out.println("inserisci seconda stringa");
        String secondaStringa = scanner.nextLine();
        System.out.println("inserisci terza stringa");
        String terzaStringa = scanner.nextLine();
        System.out.println("il risultato è: " + primaStringa +" " + secondaStringa +" "+ terzaStringa);
        System.out.println("il risultato inverso è: " +terzaStringa  +" " + secondaStringa +" "+primaStringa );


    }
}
