public class Main {
    public static void main(String[] args) { // String[] args -> knows it will be an array of text strings

        int[] numbers = new int[10]; // holds 10 elements| int[] -> data type as an arrary | numbers -> variable name |  new int[10] -> allocates array with exactly 10 elements

        numbers[0] = 35;
        numbers[1] = 26;
        numbers[2] = 126;
        numbers[3] = 58;
        numbers[4] = 72;
        numbers[5] = -13;
        numbers[6] = 64;
        numbers[7] = 12;
        numbers[8] = 34;
        numbers[9] = -5;

        System.out.println("My List of Elements:");
        printArrayElements(numbers);

        System.out.println("\n\n|[ASCENDING ORDER]|");

//        System.out.println("\nBefore Bubble Sort:");
//        printArrayElements(numbers);

        bubbleSort(numbers); // calls out "bubbleSort" method from private using "numbers" array variable

        System.out.println("\nAfter Bubble Sort:");
        printArrayElements(numbers); // calls out "printArrayElements" method from private using "numbers" array variable

//        System.out.println("\n\nBefore Selection Sort:");
//        printArrayElements(numbers);

        selectionSort(numbers); // calls out "selectionSort" method from private using "numbers" array variable

        System.out.println("\n\nAfter Selection Sort:");
        printArrayElements(numbers); // calls out "printArrayElements" method from private using "numbers" array variable

        System.out.println("\n\n|[DESCCENDING ORDER]|");

        bubbleSortDescend(numbers); //applies method to "numbers" array

        System.out.println("\nDescending Bubble Sort:");
        printArrayElements(numbers);

        selectionSortDescend(numbers); //applies method to "numbers" array

        System.out.println("\n\nDescending Selection Sort:");
        printArrayElements(numbers);

    }

    // CamelCase -> classes | lower camelCase -> variables and methods/functions

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortDescend(int[] arr)
    {
        for (int lastSortedIndex = arr.length -1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largestIndex])
                {
                    largestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[largestIndex];
            arr[largestIndex] = temp;

        }
    }

    private static void selectionSortDescend(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0; // changed to "smallestIndex" as concpetually we are now comparing and traversing with the smallest element

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }

    // method to print the array/list of elements found above/at the start
    private static void printArrayElements(int[] arr) // private -> can only be called in main class | printArrayElements -> name of method/funciton | int[] arr -> expects an integer array
    {
        for (int j : arr) { // enhanced for-loop ( for (int i = 0, i < name, i++); )
            System.out.print(j + " ");
        }
    }

}