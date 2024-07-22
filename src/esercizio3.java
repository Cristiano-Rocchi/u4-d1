import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo lato");
        Double base = scanner.nextDouble();
        System.out.println("inserisci secondo lato");
        Double altezza = scanner.nextDouble();
        System.out.println("il perimetro del rettangolo è: " + rettangolo(base,altezza));


    }
    public static double rettangolo(double par1, double par2){
return (par1 + par2)*2;

    }
}
