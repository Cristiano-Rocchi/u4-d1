import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        pariDispari();





    }
    public static void rettangolo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo lato");
        Double base = scanner.nextDouble();
        System.out.println("inserisci secondo lato");
        Double altezza = scanner.nextDouble();
        System.out.println("il perimetro del rettangolo è: " + calcolaPerimetro(base,altezza));

    }
    public static double calcolaPerimetro(double par1, double par2){
return (par1 + par2)*2;

    }

    public static void pariDispari(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero");
        int numero= scanner.nextInt();
        if (calcolaPariDispari(numero)==0){
            System.out.println("il numero è pari");
        }
        else{
            System.out.println("il numero è dispari");
        }
    }
    public static int calcolaPariDispari (int numero){
        return numero%2;
    }
}
