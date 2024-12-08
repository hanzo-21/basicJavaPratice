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

    public static void main(String[] args) {
        Main.primeNumberChange4th();
    }
}