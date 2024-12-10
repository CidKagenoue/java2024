package les2.gcd;

public class Main {

    /**
     * gcd = greatest common divisor (grootste gemene deler)
     * <p>
     * Algoritme van Euclides
     * <p>
     * De ggd van twee gehele getallen is ook de ggd van zowel het kleinste getal
     * als van de rest die overblijft bij deling van het grootste getal door het kleinste.
     */
    public static void main(String[] args) {
        System.out.println(gcd1(20, 12));
        System.out.println(gcd2(20, 12));
        System.out.println(gcd3(20, 12));

        System.out.println(gcd1(15, 20));
        System.out.println(gcd2(15, 20));
        System.out.println(gcd3(15, 20));

        System.out.println(gcd1(6, 9));
        System.out.println(gcd2(6, 9));
        System.out.println(gcd3(6, 9));

        System.out.println(gcd1(6, 12));
        System.out.println(gcd2(6, 12));
        System.out.println(gcd3(6, 12));
    }

    private static int gcd1(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int gcd2(int a, int b) {
        while (a != b) {
            if(a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    private static int gcd3(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd3(b, a % b);
        }
    }
}
