package finals.exercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class MyProgramming1Project {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int myChoice = 0;
        showIntroduction();
        kbd.nextLine();
        do {
            showMainMenu();
            myChoice = enterChoice(1, 4);
            switch (myChoice) {
                case 1:
                    mathSolver();
                    break;
                case 2:
                    recordKeeping();
                    break;
                case 3:
                    miscellaneousProcesses();
                    break;
                case 4:
                    System.out.println("Thank you for using my program.");
                    System.out.println("Enjoy the rest of your day.");
            } //end switch
        } while (myChoice != 4);
    } //end main method
    public static void showIntroduction() {
        System.out.println("\n\n\n");
        System.out.println("College of Information and Computing Sciences");
        System.out.println(" Saint Louis University");
        System.out.println(" Baguio City ");
        System.out.println("---------------------------------------------");
        System.out.println("\n");
        System.out.println(" Rhyen Jan O. Natividad ");
        System.out.println(" Future Software Engineer");
        System.out.println("\n");
        System.out.print("Please press a key to see Main Menu...");
    }
    public static void showMainMenu() {
        System.out.println("Main Menu ");
        System.out.println("----------------------------");
        System.out.println("1. Math Routines");
        System.out.println("2. Recording Routines");
        System.out.println("3. Miscellaneous Routines");
        System.out.println("4. Exit");
        System.out.println("------------------------------");
    }
    public static void showMenu1() {
        System.out.println("Math Routine Submenu ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Determine whether an integer is odd or even");
        System.out.println("2. Determine sum of a series");
        System.out.println("3. Determine the factors of a number");
        System.out.println("4. Determine if a number is prime");
        System.out.println("5. Determine the area of a circle");
        System.out.println("6. Determine the area of a square");
        System.out.println("7. Determine the area of a triangle");
        System.out.println("8. Determine the area of a rectangle");
        System.out.println("9. Determine the area of a trapezoid");
        System.out.println("10. Determine the area of a parallelogram");
        System.out.println("11. Determine if an integer is a perfect number");
        System.out.println("12. Generate a multiplication table");
        System.out.println("13. Determine the roots of a quadratic equation");
        System.out.println("14. Generate a Fibonacci Sequence");
        System.out.println("15. Generate a Pascal's Triangle");
        System.out.println("16. Reverse any input");
        System.out.println("17. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static void showMenu2() {
        System.out.println("Recording Routine Submenu");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Accept and sort list of students");
        System.out.println("2. Accept and sort list of Salesmen");
        System.out.println("3. Accept pairs of names and grades and sort list according to name");
        System.out.println("4. Accept pairs of names and grades and sort list according to " +
                "grade");
        System.out.println("5. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static void showMenu3() {
        System.out.println("Miscellaneous Routine Submenu ");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Number Guessing Game");
        System.out.println("2. Bills distribution of an amount of Money");
        System.out.println("3. Interest of Money Invested ");
        System.out.println("4. Income Tax Computation");
        System.out.println("5. Insect Population Growth Rate");
        System.out.println("6. Water Bill computaion.");
        System.out.println("7. Electric Bill computation.");
        System.out.println("8. Mobile Phone Load Balance Computation.");
        System.out.println("9. Rock Paper Scissor game");
        System.out.println("10. Back to Main Menu");
        System.out.println("------------------------------------------------");
    }
    public static int enterChoice(int min, int max) {
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.print("Input the number corresponding to your choice: ");
            choice = kbd.nextInt();
            if (choice < min || choice > max)
                System.out.println("Invalid choice. Please ensure that you enter a number from " +
                        min + " to " + max + ".");
        } while (choice < min || choice > max);
        return (choice);
    }
    public static void mathSolver() {
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu1();
            choice = enterChoice(1, 17);
            switch (choice) {
                case 1:
                    int y;
                    System.out.print("Enter an integer :");
                    y = kbd.nextInt();
                    System.out.println(detOddEven(y));
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 2:
                    int z;
                    System.out.print("Enter an integer :");
                    z = kbd.nextInt();
                    System.out.println("The sum of the series is " + getSumOfSeries(z));
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 3:
                    int x;
                    System.out.print("Enter an integer :");
                    x = kbd.nextInt();
                    getFactors(x);
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 4:
                    // TO DO
                    int v;
                    System.out.print("Enter an integer: ");
                    v = kbd.nextInt();
                    determinePrime(v);
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    kbd.nextLine();
                    break;
                case 5:
                    // TO DO
                    getCicle();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 6:
                    // TO DO
                    MyProgramming1Project square = new MyProgramming1Project();
                    square.getSquare();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 7:
                    // TO DO
                    MyProgramming1Project triangle = new MyProgramming1Project();
                    triangle.getTriangle();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 8:
                    // TO DO
                    MyProgramming1Project rectangle = new MyProgramming1Project();
                    rectangle.getRectangle();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 9:
                    // TO DO
                    MyProgramming1Project trapezoid = new MyProgramming1Project();
                    trapezoid.getTrapezoid();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 10:
                    // TO DO
                    MyProgramming1Project parallelogram = new MyProgramming1Project();
                    parallelogram.getParallelogram();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 11:
                    // TO DO
                    checkperfectNum();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 12:
                    // TO DO
                    multipTable();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 13:
                    // TO DO
                    getRoots();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 14:
                    int t;
                    System.out.print("\nHow many terms do you want? ");
                    t = kbd.nextInt();
                    generateFibonacciSequence(t);
                    System.out.print("Press enter to continue...");

                    break;
                case 15:
                    // TO DO
                    pascalTriangle();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    break;
                case 16:
                    // TO DO
                    reverseNum();
                    System.out.println();
                    System.out.println("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 17:

            } // end of cases
        } while (choice != 17);
    } // end of mathSolver method
    public static void recordKeeping() {
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu2();
            choice = enterChoice(1, 5);
            switch (choice) {
                case 1:
                    acceptAndSortNamesStud();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 2:
                    // TO DO
                    acceptAndSortNamesSalesmen();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 3:
                    // TO DO
                    acceptAndSortNamesAndGradesBasedName();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 4:
                    // TO DO
                    acceptAndSortNamesAndGradesBasedGrades();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
            } // end of cases
        } while (choice != 5);
    } // end of recordKeeping method
    public static void acceptAndSortNamesStud() {
        Scanner kbd = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("How many names will be sorted? ");
        n = Integer.parseInt(kbd.nextLine());
        names = new String[n];
        // Populate array names
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of student " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
        }
        // Sort the names array
        balloonSortArray2(names);
        //Show elements of names array
        showElements(names);
    }
    public static void acceptAndSortNamesSalesmen() {
        Scanner kbd = new Scanner(System.in);
        String[] names;
        int n = 0;
        System.out.print("How many names will be sorted? ");
        n = Integer.parseInt(kbd.nextLine());
        names = new String[n];
        // Populate array names
        for (int z = 0; z < names.length; z++) {
            System.out.print("Enter name of Salesmen " + (z + 1) + ": ");
            names[z] = kbd.nextLine();
        }
        // Sort the names array
        balloonSortArray2(names);
        //Show elements of names array
        showElements(names);
    }
    public static void acceptAndSortNamesAndGradesBasedGrades() {

        Scanner input = new Scanner(System.in);
        int perfectTotalQuizScore = 0, totalQuizScore = 0, examScore = 0, perfectExamScore = 0; // Declare int variables and initialized to zero
        double quizGrade = 0, examGrade = 0; // Declare double variables and initialized to zero
        char letterGrade = 'I'; // Declare char variable and store character 'I' to it
        String studentName = "";
        double finalGrade; // Declare string variable and store a string in it
        System.out.print("Enter number of students: ");

        int numOfStu = input.nextInt();

        String[] names = new String[numOfStu];
        int[] numericGrade = new int[numOfStu];
        for (int i = 0; i < numOfStu; i++) {
            System.out.print("Enter the name: ");
            String name = input.next();
            System.out.print("Enter the perfect total quiz score: "); // Prompts the user to input perfect total quiz score
            perfectTotalQuizScore = input.nextInt(); //  Assigns an integer entered through the kbd to perfectTotalQuizScore

            if (perfectTotalQuizScore <= 0) {
                System.out.println("Invalid perfect score! The perfect score should be " + "greater than zero");

                System.out.println("Sorry! The program needs to close. Run the program " + "again and enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the quiz score of " + studentName + ":"); //Prompts the user to input total quiz score along student name
            totalQuizScore = input.nextInt();

            if (totalQuizScore < 0 || totalQuizScore > perfectTotalQuizScore) {
                System.out.println("Invalid score. The score should not exceed the perfect score " +
                        perfectTotalQuizScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again and "

                        +
                        "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the perfect examination score: "); // Prompts the user to input perfect examination score
            perfectExamScore = input.nextInt(); // Assigns an integer entered through the kbd to perfectExamScore

            if (perfectExamScore <= 0) { //4
                System.out.println("Invalid perfect score! The perfect score should be greater " + "than zero");

                System.out.println("Sorry! The program needs to close. Run the program again and " + "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the examination score of " + studentName + ":"); //Prompts the user to input the examination score along with the student name
            examScore = input.nextInt(); // Assigns an integer entered through the kbd to examScore

            if (examScore > perfectExamScore || examScore < 0) { //6
                System.out.println("Invalid score. The exam score should not exceed the perfect " + "score " + perfectExamScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again " + "and enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the perfect examination score: ");
            perfectExamScore = input.nextInt(); // 3

            if (perfectExamScore <= 0) { //4
                System.out.println("Invalid perfect score! The perfect score should be greater " + "than zero");

                System.out.println("Sorry! The program needs to close. Run the program again and " + "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the examination score of " + studentName + ":");
            examScore = input.nextInt(); // 5

            if (examScore > perfectExamScore || examScore < 0) { //6
                System.out.println("Invalid score. The exam score should not exceed the perfect " + "score " + perfectExamScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again " +
                        "and enter correct values.");

                System.exit(0);
            }
            quizGrade = totalQuizScore / perfectTotalQuizScore * 50 + 50; // formula for quizGrade
            examGrade = examScore / perfectExamScore * 50 + 50; // formula for examGrade

            finalGrade = (quizGrade + examGrade) / 2; // formula for numericGrade
            double grade[] = {
                    finalGrade
            };

            /* System.out.print("Enter the grade: ");
            int grade = input.nextInt(); */

            names[i] = name;

            numericGrade[i] = (int) finalGrade;

            System.out.println("");

        }

        //this is the area that sorts it from least to greatest

        //i is the indexed value of the last number in array

        //if it's 10 numbers big, i is 9

        //loop ends before index 0 because 0 should be in it's place at the end already

        for (int i = numericGrade.length - 1; i > 0; i--) {

            //resets both to 0 to start at the beginning of the array

            //so that you can test the new first number

            int currentMax = numericGrade[0];

            int currentMaxIndex = 0;

            //finds largest number out of all up to back-limit

            //i is back-limit that gets chopped off by one each time

            for (int k = 1; k <= i; k++) {

                if (currentMax < numericGrade[k]) {

                    currentMax = numericGrade[k];

                    currentMaxIndex = k;

                }

            }

            //after largest number is found, assign that number to i

            //i is a high number like 9, then 8, then 7, etc.

            //each time it runs, i-- so each second highest max number

            //gets put infront of the all time highest number

            numericGrade[currentMaxIndex] = numericGrade[i];

            numericGrade[i] = currentMax;

            String tempName = names[currentMaxIndex];

            names[currentMaxIndex] = names[i];

            names[i] = tempName;

        }
        System.out.println("--------Sort grades and names by grades-------\n");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%7s %14s %7s %10s %10s %8s", "NAME", "QUIZ SCORE", "EXAM SCORE", "QUIZ GRADE", "EXAM GRADE", "GRADE");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < numericGrade.length; i++) {
            System.out.println();
            System.out.printf("\n%7s %11s %8s %11s %11s %10s", names[i], totalQuizScore, examScore, quizGrade, examGrade, numericGrade[i]);
            System.out.println();

            System.out.println("----------------------------------------------------------------------------------------------");

        }
    }

    public static void acceptAndSortNamesAndGradesBasedName() {
        Scanner input = new Scanner(System.in);
        int perfectTotalQuizScore = 0, totalQuizScore = 0, examScore = 0, perfectExamScore = 0; // Declare int variables and initialized to zero
        double quizGrade = 0, examGrade = 0; // Declare double variables and initialized to zero
        char letterGrade = 'I'; // Declare char variable and store character 'I' to it
        String studentName = "";
        double finalGrade; // Declare string variable and store a string in it
        System.out.print("Enter number of students: ");

        int numOfStu = input.nextInt();

        String[] names = new String[numOfStu];
        int[] numericGrade = new int[numOfStu];
        for (int i = 0; i < numOfStu; i++) {
            System.out.print("Enter the name: ");
            String name = input.next();
            System.out.print("Enter the perfect total quiz score: "); // Prompts the user to input perfect total quiz score
            perfectTotalQuizScore = input.nextInt(); //  Assigns an integer entered through the kbd to perfectTotalQuizScore

            if (perfectTotalQuizScore <= 0) {
                System.out.println("Invalid perfect score! The perfect score should be " + "greater than zero");

                System.out.println("Sorry! The program needs to close. Run the program " + "again and enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the quiz score of " + studentName + ":"); //Prompts the user to input total quiz score along student name
            totalQuizScore = input.nextInt();

            if (totalQuizScore < 0 || totalQuizScore > perfectTotalQuizScore) {
                System.out.println("Invalid score. The score should not exceed the perfect score " +
                        perfectTotalQuizScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again and "

                        +
                        "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the perfect examination score: "); // Prompts the user to input perfect examination score
            perfectExamScore = input.nextInt(); // Assigns an integer entered through the kbd to perfectExamScore

            if (perfectExamScore <= 0) { //4
                System.out.println("Invalid perfect score! The perfect score should be greater " + "than zero");

                System.out.println("Sorry! The program needs to close. Run the program again and " + "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the examination score of " + studentName + ":"); //Prompts the user to input the examination score along with the student name
            examScore = input.nextInt(); // Assigns an integer entered through the kbd to examScore

            if (examScore > perfectExamScore || examScore < 0) { //6
                System.out.println("Invalid score. The exam score should not exceed the perfect " + "score " + perfectExamScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again " + "and enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the perfect examination score: ");
            perfectExamScore = input.nextInt(); // 3

            if (perfectExamScore <= 0) { //4
                System.out.println("Invalid perfect score! The perfect score should be greater " + "than zero");

                System.out.println("Sorry! The program needs to close. Run the program again and " + "enter correct values.");

                System.exit(0);
            }
            System.out.print("Enter the examination score of " + studentName + ":");
            examScore = input.nextInt(); // 5

            if (examScore > perfectExamScore || examScore < 0) { //6
                System.out.println("Invalid score. The exam score should not exceed the perfect " + "score " + perfectExamScore + " and it should not be less than 0.");

                System.out.println("Sorry! The program needs to close. Run the program again " +
                        "and enter correct values.");

                System.exit(0);
            }
            quizGrade = totalQuizScore / perfectTotalQuizScore * 50 + 50; // formula for quizGrade
            examGrade = examScore / perfectExamScore * 50 + 50; // formula for examGrade

            finalGrade = (quizGrade + examGrade) / 2; // formula for numericGrade
            double grade[] = {
                    finalGrade
            };

            /* System.out.print("Enter the grade: ");
            int grade = input.nextInt(); */

            names[i] = name;

            numericGrade[i] = (int) finalGrade;

            System.out.println("");

        }

        //this is the area that sorts it from least to greatest

        //i is the indexed value of the last number in array

        //if it's 10 numbers big, i is 9

        //loop ends before index 0 because 0 should be in it's place at the end already

        for (int i = numericGrade.length - 1; i > 0; i--) {

            //resets both to 0 to start at the beginning of the array

            //so that you can test the new first number

            int currentMax = numericGrade[0];

            int currentMaxIndex = 0;

            //finds largest number out of all up to back-limit

            //i is back-limit that gets chopped off by one each time

            for (int k = 1; k <= i; k++) {

                if (currentMax < numericGrade[k]) {

                    currentMax = numericGrade[k];

                    currentMaxIndex = k;

                }

            }

            //after largest number is found, assign that number to i

            //i is a high number like 9, then 8, then 7, etc.

            //each time it runs, i-- so each second highest max number

            //gets put infront of the all time highest number

            numericGrade[currentMaxIndex] = numericGrade[i];

            numericGrade[i] = currentMax;

            String tempName = names[currentMaxIndex];

            names[currentMaxIndex] = names[i];

            names[i] = tempName;
            Arrays.sort(names);
            System.out.println();
        }
        System.out.println("--------Sort grades and names by grades-------\n");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%7s %14s %7s %10s %10s %8s", "NAME", "QUIZ SCORE", "EXAM SCORE", "QUIZ GRADE", "EXAM GRADE", "GRADE", "\n");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < numericGrade.length; i++) {
            System.out.println();
            System.out.printf("%7s %11s %8s %11s %11s %10s", names[i], totalQuizScore, examScore, quizGrade, examGrade, numericGrade[i]);
            System.out.println();

            System.out.println("----------------------------------------------------------------------------------------------");

        }

    }

    public static void miscellaneousProcesses() {
        Scanner kbd = new Scanner(System.in);
        int choice = 0;
        do {
            showMenu3();
            choice = enterChoice(1, 10);
            switch (choice) {
                case 1:
                    higherOrLower();
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 2:
                    // TO DO
                    dispenser();
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 3:
                    // TO DO
                    interest();
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 4:
                    // TO DO
                    incomeTax();
                    System.out.println();
                    System.out.print("press enter to continue...");
                    kbd.nextLine();
                    break;
                case 5:

                    insectPopulationGrowthRate();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 6:
                    waterBill();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 7:
                    // TO DO
                    electriBill();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 8:
                    // TO DO
                    loadBalance();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 9:
                    // TO DO
                    jackEnPoyGame();
                    System.out.println("Press enter to continue...");
                    kbd.nextLine();
                    break;
                case 10:
                    // TO DO
            } // end of cases
        } while (choice != 10);
    } // end of miscellaneousProcesses method
    public static String detOddEven(int number) {
        if (number % 2 != 0)
            return (" The number is odd ");
        else
            return (" The number is even ");
    }
    public static double getSumOfSeries(int n) {
        double sum = 0;
        if (n > 1 && n % 2 == 0) {
            for (int ctr = n; ctr > 1; ctr -= 2)
                sum += (1.0 / ctr);
        }
        return (sum);
    } // end of method
    public static void getFactors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i + " ");
            }
        }
    } //end of getFactors method
    public static void determinePrime(int v) {

        int temp;
        boolean isPrime = true;
        for (int i = 2; i <= v / 2; i++) {
            temp = v % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if (isPrime)
            System.out.println(v + " is a Prime Number");
        else
            System.out.println(v + " is not a Prime Number");
    } // end of determinePrime method

    public static void getCicle() {
        Scanner kbd = new Scanner(System.in);
        int radius; // variable declaration
        double circumference; // variable declaration
        double areaOfCircle; // variable declaration
        // Read the radius. Print a prompt message
        System.out.print(" Type the value of radius then press the enter key: ");
        // Assigns an integer entered through the keyboard to radius
        radius = kbd.nextInt();
        // A mathematical expression represents a value that is assigned to the variable
        // circumference
        circumference = 2 * Math.PI * radius;
        // A mathematical expression represents a value that is assigned to the variable
        // areaOfCircle
        areaOfCircle = Math.PI * radius * radius;
        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * Radius of circle is " + radius);
        System.out.println(" * Circumference of circle is " + circumference);
        System.out.println(" * Area of circle is " + areaOfCircle);
        System.out.println(" **********************************************************");
    } // end of getCircle method

    public void getSquare() {
        // Make an object of Scanner that represents the keyboard
        Scanner kbd = new Scanner(System.in);
        // Declaration statements
        int side;
        int perimeter;
        double areaOfSquare;
        // Read the inputs. Print a prompt message
        System.out.print(" Type the value of side then press enter : ");

        // Assigns an integer entered through the keyboard to radius
        side = kbd.nextInt();
        perimeter = (4 * side); // Computes the perimeter
        areaOfSquare = (side * side); // Computes the area of square
        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * The side of square is: " + side + "                                *");
        System.out.println(" * The perimeter of square is: " + perimeter + "                          *");
        System.out.println(" * Area of square is: " + areaOfSquare + "                                 *");
        System.out.println(" ***********************************************************");
    } // end of getSquare method

    public void getTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width of the Triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the Triangle:");
        double height = scanner.nextDouble();

        //Area = (width*height)/2
        double area = (base * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    } // end of getTriangle
    public void getRectangle() {
        Scanner kbd = new Scanner(System.in);
        // Declaration statements
        int length;
        int width;
        int perimeter;
        double areaOfRectangle;
        // Read the inputs. Print a prompt message
        System.out.print(" Type the value of length and width with space between them then press enter : ");

        // Assigns an integer entered through the keyboard to radius
        length = kbd.nextInt();
        width = kbd.nextInt();
        perimeter = 2 * (length + width); // Computes the perimeter
        areaOfRectangle = (length * width); // Computes the area of rectangle
        // The succeeding statements prints strings on the output screen
        System.out.println();
        System.out.println();
        System.out.println(" ***********************************************************");
        System.out.println(" * The length of rectangle is: " + length + "                           *");
        System.out.println(" * The width of rectangle is: " + width + "                            *");
        System.out.println(" * The perimeter of rectangle is: " + perimeter + "                       *");
        System.out.println(" * Area of rectangle is: " + areaOfRectangle + "                              *");
        System.out.println(" ***********************************************************");
    } // end of getTriangle method
    public void getTrapezoid() {
        double trapezoidBase1;
        double trapezoidBase2;
        double trapezoidHeight;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter base1 of trapezoid:");
        trapezoidBase1 = in .nextInt();

        System.out.println("Please enter base2 of trapezoid:");
        trapezoidBase2 = in .nextInt();

        System.out.println("Please enter height of trapezoid:");
        trapezoidHeight = in .nextInt();

        double areaOfTrapezoid = (trapezoidBase1 + trapezoidBase2) * trapezoidHeight / 2;
        System.out.println("Area of trapezoid is: " + areaOfTrapezoid);
    } // end of getTrapezoid
    public void getParallelogram() {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram: ");
        int base = sc.nextInt();
        System.out.println("Enter the height of the parallelogram: ");
        int height = sc.nextInt();
        int area = base * height;

        // display the area of a parallelogram
        System.out.println("Area of the parallelogram = " + area);
    } // end of getParallelogram method
    public static void checkperfectNum() {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer you want to check:");
        n = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Given number is Perfect");
        } else {
            System.out.println("Given number is not Perfect");
        }
    } // end of checkPerfectNum method

    public static void multipTable() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
    public static void getRoots() {
        Scanner kbd = new Scanner(System.in);

        //Declaration statements
        double a, b, c;
        double root1, root2;

        try {
            System.out.println("This program helps you solve for the roots of a Quadratic Equation.");
            System.out.println("You should enter the coefficients of the quadratic equation");
            System.out.print("Enter a: "); //Prompts the user to enter a
            a = Double.parseDouble(kbd.nextLine());
            System.out.print("Enter b: "); //Prompts the user to enter b
            b = Double.parseDouble(kbd.nextLine());
            System.out.print("Enter c: "); //Prompts the user to enter x
            c = Double.parseDouble(kbd.nextLine());

            // calculate the determinant (b2 - 4ac)
            double determinant = b * b - 4 * a * c; //Also known as the discriminant of quadratic equation

            // check if determinant is greater than 0
            if (determinant > 0) {

                // two real and distinct roots
                root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                root2 = (-b - Math.sqrt(determinant)) / (2 * a);

                System.out.println("The roots are the following:");
                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
            }

            // check if determinant is equal to 0
            else if (determinant == 0) {

                // two real and equal roots
                // determinant is equal to 0
                // so -b + 0 == -b
                root1 = root2 = -b / (2 * a);
                System.out.println("The roots are the following:");
                System.out.format("root1 = root2 = %.2f;", root1);
            }

            // if determinant is less than zero
            else {

                // roots are complex number and distinct
                String rootI = "";
                rootI += -b / (2 * a) + " + (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " +
                        (2 * a);
                String root2i = "";
                root2i += -b / (2 * a) + " - (square root of (" + (-1) * (b * b - 4 * a * c) + ") * i) / " +
                        (2 * a);
                System.out.println("The imaginary roots are the following:");
                System.out.println("root 1 =" + rootI);
                System.out.println("root 2 =" + root2i);

            }
        } catch (Exception e) {
            System.out.print("Invalid input. Run the program again! Please input a numerical value this time.");
        }
    }

    public static void pascalTriangle() {
        int no_row, c = 1, blk, i, j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in .nextInt();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.println();
        }
    } // end of pascalTriangle method

    public static void reverseNum() {
        Scanner scan = new Scanner(System.in); // Make an object of scanner that represents scan
        System.out.print("Enter an Integer: "); // Prompts the user to input an integer

        int number = scan.nextInt(); // Prompts the user to input a value of variable number
        int reverse = 0; // Declared variables and initialized to 0
        int remainder = 0; // declared variable remainder and initialized to 0

        System.out.print("The reversed of the entered integer is: ");

        while (number > 0) { // Iterate the condition repeatedly and stops when number is lesser than 0
            remainder = number % 10; // Uses modulo to extract the digit
            number = number / 10; // Divides number by 10
            System.out.print((remainder)); // Prints the remainder
        }
        System.out.println();
    } // end of reverseNum method

    public static void higherOrLower() {
        Scanner keyboard = new Scanner(System.in);
        Random rndNoGen = new Random(); // Random class is a facility for
        // generating random numbers
        int secretNo = rndNoGen.nextInt(100) + 1; // generate a random number
        // that is in the range from 1 to 100.
        System.out.println("I have an integer from 1 to 100.");
        System.out.println("You have 10 chances to guess it.");
        int guessNo = 0;
        int guess;
        boolean gotIt = false;
        do {
            System.out.print("\nGuess #" + (guessNo + 1) + ": ");
            guess = keyboard.nextInt();
            if (guess == secretNo) {
                gotIt = true;
                break; // terminate the loop immediately
            } else {
                if (guessNo == 10) {
                    break; // terminate the loop immediately
                } else {
                    if (guess > secretNo) {
                        System.out.println("Try something lower.");
                    } else {
                        System.out.println("Try something higher.");
                    }
                    guessNo++;
                }
            }
        } while (guessNo < 10);
        if (gotIt) {
            System.out.println("\nCongratulations!!!");
            System.out.println("Got it in " + guessNo + " trial(s)!");
        } else {
            System.out.println("\nSorry. No more guesses left.");
            System.out.println("The number is " + secretNo + ".");
            System.out.println("Better luck next time.");
        }
        System.out.println("\nThanks for playing!!!");
        System.out.println("Have a nice day :)!");
    } // end of higherOrLower method
    public static void dispenser() {
        Scanner kbd = new Scanner(System.in); // Make an object of Scanner that represents the kbd
        System.out.print("Enter the amount to be withdrawn, whole number only: "); // Reads the input. Print a prompt message
        int cash = Integer.parseInt(kbd.nextLine()); // Assigns an integer entered through the keyboard to cash
        System.out.println();
        int thousand = cash / 1000; // Check how many P1000 is needed for the amount
        int fiveHundred = (cash % 1000) / 500; // Check how many P500 is needed for the amount
        int hundred = ((cash % 1000) % 500) / 100; // Checks how many P100 is need for the amount
        int totalPesoBills = (thousand + fiveHundred + hundred); // Calculate the sum of thousand, fiveHundred and hundred
        double thousandAmount = thousand * 1000; // Multiplied thousand to 1000
        double fiveHundredAmount = fiveHundred * 500; // Multiplied fiveHundred to 500
        double hundredAmount = hundred * 100; // Multiplied hundred to 100
        double totalAmount = (thousandAmount + fiveHundredAmount + hundredAmount); // Calculate the sum of the three amounts
        DecimalFormat df = new DecimalFormat(".00"); // Format numbers using decimal formats

        // Output statements
        System.out.println();
        System.out.println("PESO BILLS     QUANTITY DISPENSED     AMOUNT");
        System.out.println("===========    ===================    =======");
        System.out.println("P1000                          " + thousand + "      " + df.format(thousandAmount));
        System.out.println("P500                           " + fiveHundred + "      " + df.format(fiveHundredAmount));
        System.out.println("P100                           " + hundred + "      " + df.format(hundredAmount));
        System.out.println("----------     ------------------    --------");
        System.out.println("TOTAL NUMBER OF BILLS:         " + totalPesoBills + "      " + df.format(totalAmount));

    } // end of dispenser method

    public static void interest() {
        Scanner keyboard = new Scanner(System.in);
        float annualRate;
        float quarterlyRate;
        double principal;
        double interest;
        double finalAmount;
        byte quarter;
        int year;

        annualRate = 0.05f; // Question 1
        System.out.print("Enter the year: ");
        year = keyboard.nextInt(); // Question 2
        System.out.print("Enter the initial principal: ");
        principal = keyboard.nextDouble(); // Question 3
        System.out.println();
        System.out.printf("%S%.2f%n", "Principal = ", 10000.00); // Question 4
        System.out.printf("%s%.2f%c%n", "Annual Interest Rate = ", annualRate * 100, '%');
        System.out.printf("%-6s%-8s%-16s%-30s%n", "Year", "Quarter", "Interest Earned", "Amount at the end of quarter");

        quarterlyRate = annualRate / 4;
        quarter = 1;

        interest = principal * quarterlyRate; // Q6
        finalAmount = principal + interest;
        System.out.printf("%-6d%-8d%-16.2f%-30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte)(quarter + 1); //Q7
        interest = principal * quarterlyRate; // Q8
        finalAmount = principal + interest;
        System.out.printf("%-6d%-8d%-16.2f%-30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte)(quarter + 1);
        // Q9
        interest = principal * quarterlyRate; // Question10
        finalAmount = principal + interest; // Question 11
        System.out.printf("%-6d%-8d%-16.2f%-30.2f%n", year, quarter, interest, finalAmount);
        principal = finalAmount;
        quarter = (byte)(quarter + 1);
        // Question 13
        interest = principal * quarterlyRate; // Question 14
        finalAmount = principal + interest; // Question 15
        System.out.printf("%-6d%-8d%-16.2f%-30.2f%n", year, quarter, interest, finalAmount);
    } // end of interest method
    public static void incomeTax() {
        Scanner keyboard = new Scanner(System.in);
        //Declaration statements
        double taxableIncome; // Declared double variable in taxableIncome
        double taxDue = 0.0; // Declared double taxDue and initialized 0
        byte bracket = 0; // Declared byte bracket variable and initialized to 0

        try { // The one that does trial and error if ever the user did not input a numerical value
            System.out.println("Income Tax Computation");
            System.out.print("Enter the taxable income: "); // Prompts the user to enter a taxable income
            taxableIncome = keyboard.nextDouble();
            if (taxableIncome <= 250000.00) //Not over 250000
                bracket = 1;
            if (taxableIncome > 250000.00 && taxableIncome <= 400000.00) // Over 250,000 but not over 400, 000
                bracket = 2;
            if (taxableIncome > 400000.00 && taxableIncome <= 800000.00) //Over 400,000 but not over 2,000,000
                bracket = 3;

            if (taxableIncome > 800000.00 && taxableIncome <= 2000000) //Over 800,000 but not over 2,000,000
                bracket = 4;
            if (taxableIncome > 2000000 && taxableIncome <= 8000000) //Over 2,000000 but not over 8,000,000
                bracket = 5;
            if (taxableIncome > 8000000) // Over 8,000,000
                bracket = 6;
            switch (bracket) {
                case 1:

                    taxDue = 0; // 0%
                    break;
                case 2:
                    taxDue = (taxableIncome - 250000) * 0.20; // 20% of the excess over 250,000
                    break;
                case 3:
                    taxDue = 30000.00 + (taxableIncome - 400000.00) * 0.25; //30,000 +25% of the excess of 400,000
                    break;
                case 4:
                    taxDue = 130000.00 + (taxableIncome - 800000.00) * 0.30; //130,000 + 30% of the excess of 2,000,000
                    break;
                case 5:
                    taxDue = 490000.00 + (taxableIncome - 2000000) * 0.32; //490,000 + 32% of the excess of 2,000,000
                    break;
                case 6:
                    taxDue = 2410000.00 + (taxableIncome - 8000000) * 0.35; // 2,410,000 + 35% of the excess over 8,000,000

                default:
            } // end of switch-case
            System.out.printf("%s %.2f%n", "Tax Due = ", taxDue);
        } catch (InputMismatchException e) { // Catches an exceptional errors
            System.out.println("That is not a valid value! Must be a numerical value! run the program again and enter a valid value");
        }
    } // end of incomeTax method

    public static void insectPopulationGrowthRate() {
        Scanner kbd = new Scanner(System.in);
        int fSize, iSize;
        double rateOfGrowth;
        System.out.println("Kindly enter the following:");
        System.out.print(" Initial population ... ");
        iSize = kbd.nextInt();
        System.out.print(" Current population..... ");
        fSize = kbd.nextInt();
        rateOfGrowth = (fSize - iSize) * 100.0 / iSize;
        System.out.print("\nThe rate of growth is " + rateOfGrowth + "%");
        System.out.println(" because (" + fSize + " - " + iSize + ") * 100 / " + iSize + " is " +
                rateOfGrowth + "%");
    } // end of insectPopulationGrowthRate method
    public static void waterBill() {
        int presentReading = 0, previousReading = 0;
        Scanner kbd = new Scanner(System.in);
        String consumer = ""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int nCMUsed = 0; // to hold number of cubic meters of water used

        int minCMResidential = 12; // to hold cut-off for minimum Bill for residential consumers
        double minBillResidential = 180.00; // minimum bill for <= 12 Cubic Meters used

        float rateResidential = 30.00F; // cost of 1 Cubic Meter above
        int minCMCommercial = 30; // cost of 1 Cubic Meter above Bill for commercial consumers

        double minBillCommercial = 600.00; // minimum bill for <= 20Cubic Meters used
        float rateCommercial = 50.00F; //cost of 1 Cubic Meter above the min.
        //consumption for commercial consumers
        double amountDue = 0.0; // to hold the amount due
        boolean done;
        done = false;

        System.out.print("Enter the consumer's name: ");
        consumer = kbd.nextLine();

        do {
            try {
                System.out.print("Enter the meter reading last month: ");
                previousReading = Integer.parseInt(kbd.nextLine());

                if (previousReading < 0)
                    System.out.println("The meter reading cannot me negative.");
                done = true;

            } catch (Exception e) {
                System.out.print("Invalid input. Please input a numerical value.");
            }
        } while (!done || previousReading < 0);

        do {
            try {
                System.out.println("Enter the meter current reading for this month:  ");
                presentReading = Integer.parseInt(kbd.nextLine());
                if (previousReading > presentReading) {
                    System.out.println("The meter reading cannot be lesser than previous reading");
                    done = true;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please input a numerical value.");

            }

        } while (!done || previousReading > presentReading);

        do {
            System.out.print("Enter the type of consumer: ");
            cType = kbd.next().charAt(0);
            if (cType != 'c' && cType != 'r') {
                System.out.println("Invalid input! Enter the type of consumer again: ");
            }
        } while (cType != 'c' && cType != 'r');

        nCMUsed = presentReading - previousReading;
        if (cType == 'r') {
            if (nCMUsed <= 12) {
                amountDue = 180.00;
                System.out.println("amount due: " + amountDue);
            } else {
                amountDue = 180.00 + (nCMUsed - 12) * 30.00;
                System.out.println("amount due: " + amountDue);
            }
        } else if (cType == 'c') {
            if (nCMUsed <= 30) {
                amountDue = 600.00;
                System.out.println("amount due: " + amountDue);
            } else {
                amountDue = 600.00 + (nCMUsed - 30) * 50.00;
                System.out.println("amount due: " + amountDue);
            }

        }

        System.out.println("\n\n\t\t\tBILL");
        System.out.println("  ---------------------");
        System.out.println("  Subscriber: " + consumer);
        System.out.println("  Type: " + cType);
        System.out.println("  Previous meter reading: " + previousReading + "cubic meter");
        System.out.println("  Current meter reading: " + presentReading + "cubic meter");
        System.out.println("  Consumption: " + nCMUsed);
        System.out.println("  Amount Due:  " + amountDue + " PHP");
    } // end of waterBill method

    public static void electriBill() {
        int presentReading = 0, previousReading = 0;
        Scanner kbd = new Scanner(System.in);
        String consumer = ""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int nCMUsed = 0; // to hold number of KWH of electricity used

        int minCMResidential = 12; // to hold cut-off for minimum Bill for residential consumers
        double minBillResidential = 180.00; // minimum bill for <= 12 Cubic Meters used

        float rateResidential = 30.00F; // cost of 1 KWH above
        int minCMCommercial = 30; // cost of 1 KWH above Bill for commercial consumers

        double minBillCommercial = 600.00; // minimum bill for <= 20KWH used
        float rateCommercial = 50.00F; //cost of 1 KWH above the min.
        //consumption for commercial consumers
        double amountDue = 0.0; // to hold the amount due
        boolean done;
        done = false;

        System.out.print("Enter the consumer's name: ");
        consumer = kbd.nextLine();

        do {
            try {
                System.out.print("Enter the meter reading last month: ");
                previousReading = Integer.parseInt(kbd.nextLine());

                if (previousReading < 0)
                    System.out.println("The meter reading cannot me negative.");
                done = true;

            } catch (Exception e) {
                System.out.print("Invalid input. Please input a numerical value.");
            }
        } while (!done || previousReading < 0);

        do {
            try {
                System.out.println("Enter the meter current reading for this month:  ");
                presentReading = Integer.parseInt(kbd.nextLine());
                if (previousReading > presentReading) {
                    System.out.println("The meter reading cannot be lesser than previous reading");
                    done = true;
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please input a numerical value.");

            }

        } while (!done || previousReading > presentReading);

        do {
            System.out.print("Enter the type of consumer: ");
            cType = kbd.next().charAt(0);
            if (cType != 'c' && cType != 'r') {
                System.out.println("Invalid input! Enter the type of consumer again: ");
            }
        } while (cType != 'c' && cType != 'r');

        nCMUsed = presentReading - previousReading;
        if (cType == 'r') {
            if (nCMUsed <= 12) {
                amountDue = 180.00;
                System.out.println("amount due: " + amountDue);
            } else {
                amountDue = 180.00 + (nCMUsed - 12) * 30.00;
                System.out.println("amount due: " + amountDue);
            }
        } else if (cType == 'c') {
            if (nCMUsed <= 30) {
                amountDue = 600.00;
                System.out.println("amount due: " + amountDue);
            } else {
                amountDue = 600.00 + (nCMUsed - 30) * 50.00;
                System.out.println("amount due: " + amountDue);
            }

        }

        System.out.println("\n\n\t\t\tBILL");
        System.out.println("  ---------------------");
        System.out.println("  Subscriber: " + consumer);
        System.out.println("  Type: " + cType);
        System.out.println("  Previous meter reading: " + previousReading + "KWH");
        System.out.println("  Current meter reading: " + presentReading + "KWH");
        System.out.println("  Consumption: " + nCMUsed);
        System.out.println("  Amount Due:  " + amountDue + " PHP");
    }
    public static void loadBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your phone load : ");
        float load = sc.nextFloat();
        System.out.println("Enter cost per text message : ");
        float cost_text = sc.nextFloat();
        System.out.println("Enter cost per call per minute : ");
        float cost_call = sc.nextFloat();
        System.out.println("Enter number of text messages : ");
        int total_text = sc.nextInt();
        System.out.println("enter number of call minutes");
        int total_minutes = sc.nextInt();

        float cost_of_text = total_text * cost_text; // calculate totla text cost
        float cost_of_call = total_minutes * cost_call; // calculate total call cost

        float total_cost = cost_of_call + cost_of_text; // total cost

        System.out.println("Remaining balance : " + (load - total_cost)); // printing remaining balance
    }

    public static void jackEnPoyGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ROCK PAPER SCISSOR GAME");
        System.out.println("Player 1 input");
        String input1 = sc.nextLine();
        System.out.println("Player 2 input");
        String input2 = sc.nextLine();
        if (((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("paper"))) || ((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("rock")))) {
            System.out.println("Paper wins");
        } else if (((input1.equalsIgnoreCase("rock")) && (input2.equalsIgnoreCase("scissor"))) || ((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("rock")))) {
            System.out.println("Rock wins");
        } else if (((input1.equalsIgnoreCase("paper")) && (input2.equalsIgnoreCase("scissor"))) || ((input1.equalsIgnoreCase("scissor")) && (input2.equalsIgnoreCase("paper")))) {
            System.out.println("Scissor wins");
        } else if (input1.equalsIgnoreCase(input2)) {
            System.out.println("Its a tie");
        }
    }

    public static void generateFibonacciSequence(int nTerms) {
        int first = 1, second = 1;
        int temp;
        int count = nTerms;
        System.out.print("Terms: ");
        if (nTerms == 1)
            System.out.println(first);
        if (nTerms == 2)
            System.out.println(first + " , " + second);
        if (nTerms > 2) {
            System.out.print(first + " , " + second);
            count = count - 2; // remaining terms to print
            while (count > 0) {
                temp = first;
                first = second;
                second = temp + second;
                System.out.print(" , " + second);
                count--;
            } // end of while
            System.out.println();
        } // end of if nTerms > 2
    } // end of generateFibonacciSequence method

    /**
     * Displays the elements of an array
     **/
    public static void showElements(String[] array) {
        for (int x = 0; x < array.length; x++)
            System.out.println(array[x]);
    }

    /**
     * Sorts a given array of int following the ascending order
     */
    public static void balloonSortArray1(int[] given) {
        for (int x = 0; x < given.length - 1; x++) {
            for (int y = x + 1; y < given.length; y++) {
                if (given[x] > given[y]) {
                    int temp = given[x];
                    given[x] = given[y];
                    given[y] = temp;
                } // end of if
            } // end of second for
        } // end of first for
    } // end of method
    /**
     * Sorts a given array of String following lexicographic ordering (i.e. alphabetical ordering)
     */
    public static void balloonSortArray2(String[] given) {
        for (int x = 0; x < given.length - 1; x++) {
            for (int y = x + 1; y < given.length; y++) {
                if (given[x].compareTo(given[y]) > 0) {
                    String temp = given[x];
                    given[x] = given[y];
                    given[y] = temp;
                } // end of if
            } // end of second for
        } // end of first for
    } // end of method
    /**
     * Returns true if searchKey is in a given array of int.
     */
    public static boolean linearSearch1(int[] array, int searchKey) {
        boolean r = false;
        for (int index = 0; index < array.length && r == false; index++) {
            if (array[index] == searchKey)
                r = true;
        }
        return r;
    }
    /**
     * Returns true if searchKey is in a given array of int.
     */
    public static boolean linearSearch2(int[] array, int searchKey) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchKey)
                return true;
        }
        return false;
    }
    /**
     * Returns true if searchKey is in a given array of String.
     */
    public static boolean linearSearch3(String[] array, String searchKey) {
        boolean r = false;
        for (int index = 0; index < array.length && r == false; index++) {
            if (array[index].equalsIgnoreCase(searchKey))
                r = true;
        }
        return r;
    }
    /**
     * Returns true if searchKey is in a given array of String.
     */
    public static boolean linearSearch4(String[] array, String searchKey) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].equalsIgnoreCase(searchKey))
                return true;
        }
        return false;
    }
    /**
     * Returns the index of the first cell of an array containing a searchKey if the searchKey is
     in the array, else returns -1.
     */
    public static int linearSearch5(int[] array, int searchKey) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == searchKey)
                return index;
        }
        return -1;
    }
    public static int[] copyIntegerArray(int[] array1) {
        int[] copied = new int[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = array1[index];
        }
        return copied;
    } // end of copyIntegerArray method
    public static String[] copyStringArray(String[] array1) {
        String[] copied = new String[array1.length];
        for (int index = 0; index < array1.length; index++) {
            copied[index] = new String(array1[index]);
        }
        return copied;
    } // copy of copyStringArray method
    //The following methods apply the Selection Sort algorithm.
    /**
     * Returns a sorted version of a given array of int following the ascending order
     */
    public static int[] sortIntegerArray(int[] given) {
        int minIndex = 0;
        int[] sorted = copyIntegerArray(given);
        int temp = 0;
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[minIndex] > sorted[y])
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortIntegerArray
    /**
     * Returns a sorted version of a given array of Strings following lexicographic ordering
     */
    public static String[] sortStringArray(String[] given) {
        int minIndex = 0;
        String[] sorted = copyStringArray(given);
        String temp = "";
        for (int x = 0; x < sorted.length - 1; x++) {
            minIndex = x;
            for (int y = x + 1; y < sorted.length; y++)
                if (sorted[y].compareToIgnoreCase(sorted[minIndex]) < 0)
                    minIndex = y;
            if (minIndex != x) {
                temp = sorted[x];
                sorted[x] = sorted[minIndex];
                sorted[minIndex] = temp;
            }
        }
        return sorted;
    } // end of sortStringArray
    /**
     * This method implements the Binary Search algorithm.
     * Assuming that grades is a sorted array following an increasing order, this methods
     * returns true if key is in the array.
     */
    public static boolean bSearch(int[] grades, int key) {
        boolean r = false;
        int lowLimit = 0;
        int upLimit = grades.length - 1;
        int mid = (lowLimit + upLimit) / 2;
        while (lowLimit < upLimit && !r) {
            mid = (lowLimit + upLimit) / 2;
            if (grades[mid] == key)
                r = true;
            else if (grades[mid] < key)
                lowLimit = mid + 1;
            else
                upLimit = mid - 1;
        }
        return r;
    }
} // end class
