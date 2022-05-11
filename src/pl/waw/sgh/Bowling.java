package pl.waw.sgh;

public class Bowling {

    public static void main(String[] args) {
        int n = 16135;

        long before = System.currentTimeMillis();
        System.out.println("Sum for n=" + n + ": " + sumBowlsLoop(n));
        long after = System.currentTimeMillis();
        System.out.println("Took: " + (after-before) + "ms");

        before = System.currentTimeMillis();
        System.out.println("Sum for n=" + n + ": " + sumBowlsRecursion(n));
        after = System.currentTimeMillis();
        System.out.println("Took: " + (after-before) + "ms");

        before = System.currentTimeMillis();
        System.out.println("Sum for n=" + n + ": " + sumBowlsSequence(n));
        after = System.currentTimeMillis();
        System.out.println("Took: " + (after-before) + "ms");

    }

    public static int sumBowlsSequence(int n) {
        return (n*(n+1))/2;
    }

    public static int sumBowlsLoop(int n) {
        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumBowlsRecursion(int n) {
        if (n==1) return 1;
        else return sumBowlsRecursion(n-1) + n;
    }
}
