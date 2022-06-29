 import java.math.BigDecimal;
import java.math.RoundingMode;
 import java.util.Arrays;
 import java.util.Scanner;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;

 public class Main {
    public static void main(String[] args) {
        int i = 10;
        //System.out.println("Hello world!");
        System.out.println(i / 3);
        System.out.println((double)i / 3);

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson);

        System.out.println("\nMath random");
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 100));
        System.out.println((int)(Math.random() * 100) + 100);

        /*
        System.out.println("\nScanner");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any word: ");
        String word = sc.next(); // waiting for user input
        System.out.println("You have entered this word: " + word);
        System.out.print("Enter any integer number: ");
        int x = sc.nextInt(); // waiting for user input
        System.out.println("You have entered this number: " + x);
         */

        //String.intern()

        System.out.println("\nThis is a \"String\" using escape \tsequences");
        //what does \r \f \\ do

        System.out.println("\nRegular expressions"); //more at www.regexone.com
        String gmailPattern = "[a-zA-Z-\\-d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String sampleText = "This is a sample text with random content " + "plus this some-email@gmail.com";
        Matcher m = p.matcher(sampleText);
        m.find();
        String gmailAddress = m.group();
        System.out.println(gmailAddress);
        String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));

        System.out.println("\nFor loop");
        for (int b = 0; b < 5; b++) { // is the same as initializing   int b = 0;   for (; b < 5; )  b++;
            // comma can be used as well for multi iterations:     for (int i = 0, j = 10; i < j; i++, j--)
            System.out.println("counter: " + b);
        }

        System.out.println("\nForeach loop");
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int number : arr) {
            sum += number;
            System.out.println("Number: " + number);
        }
        System.out.println("Sum: " + sum);

        //break and continue statements
        //labels (better goto)
        //NewLineForDigit + PyramidInConsole + PrintMatrixToConsole
        // pass by value
        // pass by reference

        // homework 10 - Methods in Java

        // stream API ???

        // when to use ENUM

        // different types of classes

        // difference between interface and class
        // 13 - Object-oriented programming - 004 Interfaces

    }
}