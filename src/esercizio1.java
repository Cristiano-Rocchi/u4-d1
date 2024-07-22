public class esercizio1 {
    public static void main(String[] args) {
        System.out.println(moltiplicazione(2, 3));
        System.out.println(esercizio2("ciao", 2));

        
        String[] array = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5"};
        String[] nuovoArray = esercizio3(array, "nuovoElemento");
        for (String elemento : nuovoArray) {
            System.out.println(elemento);
        }
    }

    public static int moltiplicazione(int n1, int n2) {
        return n1 * n2;
    }

    public static String esercizio2(String s1, int n1) {
        return s1 + String.valueOf(n1);
    }

    public static String[] esercizio3(String[] array, String nuovaStringa) {
        if (array.length != 5) {
            throw new IllegalArgumentException("L'array originale deve contenere esattamente 5 elementi.");
        }

        String[] nuovoArray = new String[6];


        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = array[i];
        }


        nuovoArray[2] = nuovaStringa;


        for (int i = 2; i < 5; i++) {
            nuovoArray[i + 1] = array[i];
        }

        return nuovoArray;
    }
}
