public class Main {
    public static void main(String[] args) {

        //algorithm is harwdware dependent

        //record start timestamp
        System.out.println("Hello World");

        //some complex operation

        //recorrd end timestamp

        //how to measure algorithm - big o notation, how an algorithim decays over time
        // if more elements will it run slower or run forever

        int[] numbers = new int[5];
        numbers[0] = 34;
        numbers[1] = 28;
        numbers[2] = 26;
        numbers[3] = 56;
        numbers[4] = 72;

        //for (int i = 0; i < numbers.length; i++)
        //{
       //     System.out.println(numbers[i]);
        //}

        int index = -1;
        for (int i = 0; i < numbers.length; i++)
        {
            if (numbers[i] == 50)
            {
                index = i;;
                break;
            }
        }

        System.out.println(index);

    }
}