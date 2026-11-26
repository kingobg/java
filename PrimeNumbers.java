public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 0 and 500:");

        for (int number = 2; number <= 500; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    static boolean isPrime(int number) {
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
