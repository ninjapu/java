

    import java.util.Scanner;

    public class PrimeNumbersInArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of elements in the array: ");
            int size = scanner.nextInt();
            int[] numbers = new int[size];
    
            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            scanner.close();
    
            System.out.println("Prime numbers in the array:");
            for (int num : numbers) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    
        public static boolean isPrime(int num) {
            if (num <= 1) return false; // 0 and 1 are not prime numbers
            if (num == 2) return true; // 2 is a prime number
            if (num % 2 == 0) return false; // Even numbers (except 2) are not prime
    
            // Check odd factors up to the square root of the number
            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) return false; // Divisible by an odd factor
            }
            return true; // If no divisors found, it is prime
        }
    }