package MyPreparation.numberprograms.crackingcode;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrimeNumber1(21));
        System.out.println(isPrimeNumber2(21));
    }

    public static boolean isPrimeNumber1(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber2(int n){
        for(int i = 2; i<= Math.sqrt((double) n);i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }



}
