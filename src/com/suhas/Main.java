package com.suhas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkEvenAndOdd();
        isPrime();
        greatestOfThree(5,2,10);
        sumOfNumbers();
//        FIBONACCI
        fibonacci();
        lessThanNthTerm();
        armStrongNumber(153);
        divisibleBy();
        areaSquare();
        areaRectangle();
        triangleForm();
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

//    Number divisible by 2,3,5 and 9
    public static void divisibleBy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to check if the number is divisible by 2,3,5 and 9 \nenter a number: ");
        long number = sc.nextLong();

        boolean result =  ((number%2==0 && number%3==0) && (number%5==0 && number%9==0));
        System.out.println(result);

    }

//    Area of square
    public static void areaSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a length of sides: ");
        long number = sc.nextLong();
        long area = number * number;
        System.out.println("The area of square is: " +area);
    }

    //    Area of rectangle
    public static void areaRectangle() {
        Scanner getWidth = new Scanner(System.in);
        Scanner getHeight = new Scanner(System.in);
        System.out.println("Program to find out the area of Rectangle \nenter a width of rectangle: ");
        long width = getWidth.nextLong();
        System.out.println("enter a length of rectangle: ");
        long length = getHeight.nextLong();
        long area = width * length;
        System.out.println("The area of square is: " +area);
    }

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

        if(((A+B) > C) && ((A+C) > B) && ((B+C) > A)) {
            System.out.println("Forms a Triangle");
        } else {
            System.out.println("Does not form a Triangle");
        }
    }
}







