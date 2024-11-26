public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]); // Assuming n > 1
        boolean[] arr = new boolean[N+1];
        arr[0] = false;
        arr [1] = false;
        // Initillazing the array per the algorithm's instructions
        for (int i = 2; i < arr.length; i++) {
            arr[i] = true;
        }
        int p = 2;
        while (p <= Math.sqrt(N)) {
            if (arr[p])
            for(int i = p*p; i < arr.length; i += p)
            arr[i] = false;

            p++;
        }

        System.out.println("Prime numbers up to "+N+":");
        int counter = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i);
                counter++;
            }
        }
        double primePrecentage = 100.0 * (counter / (double)N);
        System.out.println("There are "+counter+" primes between 2 and "+N+" ("+(int)primePrecentage+"% are primes)");
    }
}