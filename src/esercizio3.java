import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        areaRettangolo();





    }
    public static void rettangolo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo lato");
        Double base = Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci secondo lato");
        Double altezza = Double.parseDouble(scanner.nextLine());
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

    public static void areaRettangolo(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci primo lato");
        double lato1= Double.parseDouble(scanner.nextLine());
        System.out.println(";inserisci secondo lato");
        double lato2= Double.parseDouble(scanner.nextLine());
        System.out.println("inserisci terzo lato");
        double lato3= Double.parseDouble(scanner.nextLine());
        System.out.println("l'area del rettangolo è: "+ calcolaAreaRettangolo(lato1,lato2,lato3));


    }

    public static double calcolaAreaRettangolo(double lato1,double lato2,double lato3){
          double s = (lato1 + lato2 + lato3) / 2;

        return Math.sqrt(s * (s - lato1) * (s - lato2) * (s - lato3));
    }

}
