// Notes: SEARCH ALGORITHMS
// linear search - looking for each element one by one
// we find a value from the start, and it goes through the whole array just to find the value in a linear manner
// binary search - data must be sorted, split the array in half | divide & conquer
// once sorted, it finds midpoint, find if equals, if not then do comparison lesser or greater than, elminate what's not sufficed
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("|| Welcome to Prime Number-er! ||");
        System.out.println("Enter numbers below (one by one) | Type 'continue' to search:");

        while (true) {
            String input = in.next();
            if (input.equalsIgnoreCase("continue")) {
                break;
            }
            numbers.add(Integer.parseInt(input)); // ive learned this changes string to actual int values
        }

        for (int i = 0; i < numbers.size(); i++) {
            int n = numbers.get(i);
            if (isPrime(n)) {
                System.out.println("Prime number found at index [" + i + "]: " + n);
            }
        }

        System.out.println("\n|| Thank you for using the Prime Number-er! ||");
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

//        if (primeIndex != -1) { == first version but i learned if i could do it w infinite elements,, turning to linked lists
//            System.out.println("Prime Number found at index [" + primeIndex + "] with value: " + numbers[primeIndex]);
//        } else {
//            System.out.println("No prime numbers found.");
//        }

//        System.out.println(linearSearch(numbers, 56));
//        System.out.println(linearSearch(numbers, 67));
//        System.out.println(binarySearch(numbers, 24));
//        System.out.println(binarySearch(numbers, 69));

//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        public static boolean isPrime(int n) {
//        if (n <= 1) return false;
//
//        for (int i = 2; i * i <= n; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//
//    public static int linearSearch(int[] input, int value)
//    {
//        for (int i = 0; i < input.length; i++)
//        {
//            if (input[i] == value)
//            {
//                return i;
//            }
//        }
//
//        return -1;
//    }

//    public static int binarySearch(int[] input, int value)
//    {
//        int start = 0;
//        int end = input.length -1;
//
//        while (start <= end)
//        {
//            int middle = (start + end) / 2;
//
//            if (input[middle] == value)
//            {
//                return middle;
//            } else if (value < input[middle]) { // value might be at left half before midpoint
//
//                end = middle - 1;
//
//            } else if (value > input[middle]) { // value might be at right half after midpoint
//
//                start = middle + 1;
//
//            }
//        }
//
//        return -1;
//    }


}