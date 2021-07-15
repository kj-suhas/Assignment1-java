package com.suhas;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkEvenAndOdd();
        isPrime();
        greatestOfThree(5,2,10);
        sumOfNumbers();
////        FIBONACCI
        fibonacci();
        lessThanNthTerm();
        armStrongNumber(153);
        divisibleBy();
        areaSquare();
        areaRectangle();
        triangleForm();
        weekDays();
        leapYear();
        avgFive(1,2,3,4,5);
        secondGreatest(1,2,3,4,5);
        hcfAndLcm();
        isOwelOrConsonant();
        isAlphabet();
        printAlphabets();
        mulTable();
        pattern();
    }

    //-------------------------------------------------------------------------
    public static void checkEvenAndOdd() {
        boolean checkAgain = true;
        while (checkAgain) {
            Scanner sc = new Scanner(System.in);
            Scanner choice = new Scanner(System.in);
            System.out.println("Program to check even and odd number \nEnter a number: ");
            long number = sc.nextLong();
            if (number % 2 == 0) {
                System.out.println("Even");
                System.out.println("Want to play again? Y or N");
                String userChoice = choice.nextLine();
                checkAgain = userChoice.equals("Y");

            } else {
                System.out.println("Odd");
                System.out.println("Want to play again? Y or N");
                String userChoice = choice.nextLine();
                checkAgain = userChoice.equals("Y");
            }
        }

    }
    //-------------------------------------------------------------------------
    public static void isPrime() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Program to check if the number is prime or not \nenter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        boolean isPrime = number >= 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else System.out.println("not prime");
    }

    //-------------------------------------------------------------------------
    public static void greatestOfThree(int one, int two, int three) {
        int[] numbers = {one, two, three};
        int greatest = 0;
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number > greatest) {
                greatest = number;
            } else smallest = number;
        }
        System.out.println("Program to produce smallest and greatest number out of 3 numbers \nsmallest: " + smallest + "\ngreatest: " + greatest);
    }
    //-------------------------------------------------------------------------
    public static void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to produce upto Nth number \nenter a number: ");
        long number = sc.nextLong();
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println("The total sum is: " + sum);

    }
    //-------------------------------------------------------------------------
    //    Fibonnaci series upto N and Nth term
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to produce Fibonacci series upto Nth term and to print last of that number \nenter a number: ");
        long number = sc.nextLong();
        int n1 = 0;
        int n2 = 1;
        int nextTerm;
        int nTerm = n1;
        for (int i = 1; i <= number; i++) {

            System.out.println(n1);
            nTerm = n1;
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }

        System.out.println("The Nth term is: " + nTerm);
    }
    //-------------------------------------------------------------------------
    //    Fibonacci series up to less than Nth term, the only change needed was to take off the = sign from the for loop
    public static void lessThanNthTerm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to produce Fibonacci series upto less than the number entered  \nenter a number: ");
        long number = sc.nextLong();
        int n1 = 0;
        int n2 = 1;
        int nextTerm;
        for (int i = 1; i < number; i++) {
            System.out.println(n1);
            nextTerm = n1 + n2;
            n1 = n2;
            n2 = nextTerm;
        }
    }
    //-------------------------------------------------------------------------
    public static void armStrongNumber(int n) {
        System.out.println("Program to check for Armstrong number");
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum) {
            System.out.println("Armstrong number");
        } else System.out.println("Not an Armstrong number");
    }

    //-------------------------------------------------------------------------
    //    Number divisible by 2,3,5 and 9
    public static void divisibleBy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if the number is divisible by 2,3,5 and 9 \nenter a number: ");
        long number = sc.nextLong();

        boolean result = ((number % 2 == 0 && number % 3 == 0) && (number % 5 == 0 && number % 9 == 0));
        System.out.println(result);

    }

    //-------------------------------------------------------------------------
    //    Area of square
    public static void areaSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of sides: ");
        long number = sc.nextLong();
        long area = number * number;
        System.out.println("The area of square is: " + area);
    }

    //-------------------------------------------------------------------------
    //    Area of rectangle
    public static void areaRectangle() {
        Scanner getWidth = new Scanner(System.in);
        Scanner getHeight = new Scanner(System.in);
        System.out.println("Program to find out the area of Rectangle \nenter a width of rectangle: ");
        long width = getWidth.nextLong();
        System.out.println("enter a length of rectangle: ");
        long length = getHeight.nextLong();
        long area = width * length;
        System.out.println("The area of square is: " + area);
    }


    //-------------------------------------------------------------------------
    //    Check to see if triangle is formed
    public static void triangleForm() {
        Scanner getSideA = new Scanner(System.in);
        Scanner getSideB = new Scanner(System.in);
        Scanner getSideC = new Scanner(System.in);

        System.out.println("Check to see if the triangle can be formed from the given sides \nenter A side of triangle: ");
        long A = getSideA.nextLong();
        System.out.println("enter B side of triangle: ");
        long B = getSideB.nextLong();
        System.out.println("enter C side of triangle: ");
        long C = getSideC.nextLong();

        if (((A + B) > C) && ((A + C) > B) && ((B + C) > A)) {
            System.out.println("Forms a Triangle");
        } else {
            System.out.println("Does not form a Triangle");
        }
    }

    //-------------------------------------------------------------------------
    public static void weekDays() {
        Scanner sc = new Scanner(System.in);
        boolean correct = true;
        while (correct) {
            System.out.println("Program to print week days \nPlease enter a number 0-6!");
            int num = sc.nextInt();
            if (num < 0 || num > 6) {
                System.out.println("not correct");

            } else {
                correct = false;
                switch (num) {
                    case 0:
                        System.out.println("Sunday");
                        break;
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                }
            }
        }
    }


    //-------------------------------------------------------------------------
    public static void leapYear() {
        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Program to check leap year \nEnter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

    //-------------------------------------------------------------------------
    public static void avgFive(int one, int two, int three, int four, int five) {
        System.out.println("Program to produce average of given numbers \nAverage of given numbers is: " + ((one + two + three + four + five) / 5));
    }

    //-------------------------------------------------------------------------
    public static void secondGreatest(int one, int two, int three, int four, int five) {
        int[] numbersArray = {one, two, three, four, five};
        int largest = numbersArray[0];
        int secondLargest = numbersArray[0];

        for (int j : numbersArray) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }
        System.out.println("\nProgram to find the second largest number in an array \nSecond largest number is:" + secondLargest);

    }


    //-------------------------------------------------------------------------
    public static void hcfAndLcm() {
        int temp1, temp2, num1, num2, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();
        scanner.close();

        temp1 = num1;
        temp2 = num2;

        while (temp2 != 0) {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1 * num2) / hcf;

        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);

    }

    //-------------------------------------------------------------------------
    public static void isOwelOrConsonant() {
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.print("Program to check for owels and consonant \nEnter an Alphabet : ");
        ch = scan.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U') {
            System.out.print("This is a Vowel");
        } else {
            System.out.print("This is a Consonant");
        }
    }


    //-------------------------------------------------------------------------
    public static void isAlphabet() {
        char ch;
        Scanner scan = new Scanner(System.in);

        System.out.print("Program to check for an Alphabet \nEnter an Alphabet : ");
        ch = scan.next().charAt(0);

        String output = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
                ? ch + " is an alphabet."
                : ch + " is not an alphabet.";

        System.out.println(output);

    }

    //-------------------------------------------------------------------------
    public static void printAlphabets() {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print alphabets \nEnter \"U\" or \"L\": ");
        char ch = Character.toUpperCase(sc.next().charAt(0));
        if (ch == 'U') {
            for (char upperAlphabets : alphabets) {
                System.out.println(upperAlphabets);
            }
        } else if (ch == 'L') {
            for (char lowerAlphabets : alphabets) {
                System.out.println(Character.toLowerCase(lowerAlphabets));
            }
        } else {
            System.out.println("Give a correct value!");
        }
    }

    //-------------------------------------------------------------------------
    public static void mulTable() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Multiplication table \nEnter a Integer number: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println("Table of " + i + ": ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    //-------------------------------------------------------------------------
    public static void pattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number pattern \nEnter an Integer: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int n = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }

    }
}








