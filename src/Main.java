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

    public static void multiplyBy10(){


        // an array of scores
        int[] numbers = {43, 78, 23, 45};

        // declare new array of the same size
        int[] newNumbers = new int[numbers.length];

        // loop through each element of numbers
        // multiply them by 10
        for(int index =0 ; index < numbers.length;index++){
            newNumbers[index] = numbers[index] *10;
        }

        // print the new array
        for (int num : newNumbers) {
            System.out.println(num);
        }
    }
    // create printNumbers method
    void printNumbers() {
        // print 5
        System.out.println(5);
                // print 100
        System.out.println(100);
    }

    // create a method named findCube()
    void findCube() {
        int number = 5;

        // find the cube of number
        int result = number * number * number;
        System.out.println(result);
    }

    // method that adds two double number
    void addNumbers(double n1, double n2) {
        // add two numbers and print the result
        double result = n1+n2;
        System.out.println(result);
    }

    // create method
    int getProduct(int number1, int number2) {
        // find the product and return it
        int product = number1 * number2;

        return product;
    }

    // create the computeFactorial() method with a parameter
    int computeFactorial(int n) {

        int factorial = 1;

        // run a for loop from 1 to the method parameter
        for (int i = 2 ; i <= n ; i++) {
            factorial = factorial * i;
        }
        // return factorial
        return factorial;
    }

    void shorterString(){

        // get string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        // get length of both strings
        int firstLength = first.length();
        int secondLength = second.length();

        // compare the length of strings
        if (firstLength < secondLength) {
            System.out.println(first);
        }
        else {
            System.out.println(second);
        }

        input.close();
    }

    void lastChar(){

        Scanner input = new Scanner(System.in);

        // get String input
        String text = input.nextLine();

        // find the last character of the string
        // Hint: The last character of the string is at position length - 1
        char last = text.charAt(text.length()-1);
        System.out.println(last);

        input.close();
    }

    void conCatString(){

        // take two string inputs
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        // join strings using concat
        // add a space between two strings
        // Hint: Join first string with a space " " and
        // join the resulting string with second string
        String joinedString = firstName.concat(" ");
        joinedString = joinedString.concat(lastName);

        System.out.println(joinedString);

        input.close();
    }

    void compareString(){

        // take two string inputs
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();

        // compare two strings
        boolean result = first.equals(second);

        // print the result
        System.out.println(result);

        input.close();
    }

    void countVowels(){

        // get string input
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        // convert to lowercase
        text = text.toLowerCase();

        // variable to count vowels
        int count = 0;

        // run a for loop across the text string
        for (int i = 0; i < text.length(); ++i) {

            // check if each character is a vowel
            // Hint: Use this comparison text.charAt(i) == 'a' with each lowercase vowel characters
            // Separate each comparison with the || operator (comparison1 || comparison2 || ...)
            char[] vowels = {'a','e','i','o','u'};

            for (char vowl: vowels){
                if (vowl == text.charAt(i)){
                    ++count;
                    break;
                }
            }


        }

        System.out.println(count);

        input.close();
    }

    void nestedLoop(){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // iterate the outer loop n times
        for (int i = 0; i<n; ++i) {

            // iterate the inner loop 2 times
            for (int j = 0; j<2; ++j) {
                System.out.println("*");
            }
        }

        input.close();
    }

    void printTheLargest(){

        // get input value
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // compare number1 with number2
        // if both numbers are equal, mark number1 as larger
        int larger = (number1 > number2)?number1:number2;
        System.out.println(larger);

        input.close();
    }

    void randomIntGenrator(int minimum, int maximum){
        int randNumber = (int) ((Math.random() * maximum) + minimum);
        System.out.println(randNumber);
    }

    public static void main(String[] args) {

        Main obj = new Main();


        obj.randomIntGenrator(1,100);



    }
}