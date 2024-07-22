public class esercizio1 {
    public static void main(String[] args) {
        System.out.println(moltiplicazione(2,3));
        System.out.println(esercizio2("ciao", 2));
    }


    public static  int moltiplicazione(int n1, int n2){
        return n1*n2;
    }
    public static String esercizio2( String s1,int n1){
        return s1+ String.valueOf(n1);
    }

}
