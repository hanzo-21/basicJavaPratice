// Replace ___ with our code below
import java.util.Scanner;

class Main {

    public  static  void primeNumberChange4th(){

        // create integer array
        int[] primeNumber = {2, 3, 5, 7};

        // get integer input
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // assign number to the fourth element of primeNumber
        primeNumber[3] = number;

        // print array elements
        for (int x =0 ; x< primeNumber.length ; x++) {
            System.out.println(primeNumber[x]);
        }

        input.close();
    }

    public static void findAverageOfArray(){

        // create object of Scanner
        Scanner input = new Scanner(System.in);

        // create double array of size 5
        double[] numbers = new double[5];

        // get input value for the array
        for (int index = 0; index < numbers.length; ++index) {
            numbers[index] = input.nextDouble();
        }

        double sum = 0.0;

        // add all array elements
        for (int index = 0 ; index < numbers.length;index++) {
            // find the sum
            sum = sum + numbers[index];
        }

        // find the average
        double average = sum/ numbers.length;
        System.out.println(average);

        input.close();
    }

    public static void findAverageForEachLoop(){

        double[] numbers = {4.2, 5.5, 2.0, 8.2, 9.6};

        double total = 0;

        // find the sum of all elements
        for (double num : numbers) {
            total = total + num;
        }

        // find the average
        double average = total/ numbers.length;

        // print the average
        System.out.println(average);
    }

    public static void smallestInArray(){

        // an array of numbers
        int[] numbers = { 55, 64, 75, 80, 65 };

        // assign the first value of the array to the smallest variable
        int smallest = numbers[0];

        // iterate each element of the array
        // compare each element with the smallest
        for(int num : numbers){
            if(smallest > num){
                smallest = num;
            }
        }

        System.out.println(smallest);
    }

    public static void main(String[] args) {
        Main.smallestInArray();
    }
}