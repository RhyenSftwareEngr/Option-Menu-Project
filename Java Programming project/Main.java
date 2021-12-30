package finals.exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int myChoice = 0;

        MyProgramming1Project callToMain = new MyProgramming1Project();
        callToMain.showIntroduction();
        kbd.nextLine();
        do {
            callToMain.showMainMenu();
            myChoice = callToMain.enterChoice(1, 4);
            switch (myChoice) {
                case 1:
                    callToMain.mathSolver();
                    break;
                case 2:
                    callToMain.recordKeeping();
                    break;
                case 3:
                    callToMain.miscellaneousProcesses();
                    break;
                case 4:
                    System.out.println("Thank you for using my program.");
                    System.out.println("Enjoy the rest of your day.");
            } //end switch
        } while (myChoice != 4);
    } //end main method
}
