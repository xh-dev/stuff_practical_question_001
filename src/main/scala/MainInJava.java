public class MainInJava {
    private static double calc(int n) {
        return calc(n, 0.0);
    }

    private static double calc(int n, double cur) {
        if (n < 2) {
            throw new RuntimeException("Input not valid");
        }

        final double nDouble = Integer.valueOf(n).doubleValue();
        final int k = n - 2;
        final double kDouble = Integer.valueOf(k).doubleValue();


        // when n === 2, the x value always equals 0.5
        final double x = 0.5;
        return cur + (kDouble / (nDouble * (nDouble - kDouble))) + x;

    }

    public static void main(String[] args) {
        System.out.println(calc(2, 0));
        System.out.println(calc(3, 0));
        System.out.println(calc(4, 0));
        System.out.println(calc(5, 0));
        System.out.println(calc(6, 0));
        System.out.println(calc(7, 0));
        System.out.println(calc(8, 0));
        System.out.println(calc(9, 0));
    }
}
