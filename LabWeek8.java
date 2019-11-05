import sun.security.util.Password;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * student name: Malti
 * student number: 200434065
 */
public class LabWeek8 {
    public static void main(String[] args) {
        /**
         * Question 1 - in the space below write a while loop that will display the numbers 1 - 10 on the screen
         */
        System.out.println("Question 1");
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }


        /**
         * Question 2 - in the space below write a while loop that will display the numbers 0 - 10 on the same line, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
        System.out.println("Question 2");
        counter = 0;
        while (counter <= 10) {
            if (counter < 10)
                System.out.printf("%d, ", counter);

            else
                System.out.printf("%d", counter);
            counter = counter + 2;
        }

        /**
         * Question 3 - in the space below write a while loop that will display the numbers 3-33 on the screen, going up by 3's
         * for example 3, 6, 9, ... 33
         */
        System.out.printf("%nQuestion 3 %n");
        counter = 3;
        while (counter <= 33) {
            if (counter < 33)
                System.out.printf("%d, ", counter);

            else
                System.out.printf("%d", counter);
            counter = counter + 3;

        }


        /**
         * Question 4 - in the space below write a while loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
        System.out.printf("%nQuestion 4%n");
        counter = 33;
        while (counter >= 3) {
            if (counter > 3)
                System.out.printf("%d, ", counter);

            else
                System.out.printf("%d", counter);
            counter = counter - 3;

        }


        /**
         * Question 5 - in the space below write a do...while loop that will display the numbers 1-10 on the screen, going up by 1's
         * for example 1, 2, 3, ... 10
         */
        System.out.printf("%nQuestion 5%n");
        counter = 1;
        do {
            if (counter < 10)
                System.out.printf("%d, ", counter);
            else
                System.out.printf("%d", counter);
            counter++;

        } while (counter <= 10);

        /**
         * Question 6 - in the space below write a do...while loop that will display the numbers 0-12 on the screen, going up by 4's
         * for example 0, 4, 8, 12
         */
        System.out.printf("%nQuestion 6%n");
        counter = 0;
        do {
            if (counter < 12)
                System.out.printf("%d, ", counter);
            else
                System.out.printf("%d", counter);
            counter = counter + 4;

        } while (counter <= 12);

        /**
         * Question 7 - in the space below write a for loop that will display the numbers 1 - 10 on the screen
         */
        System.out.printf("%nQuestion 7%n");
        for (int i = 1; i <= 10; i++)
            System.out.println(i);


        /**
         * Question 8 - in the space below write a for loop that will display the numbers 0 - 10 on the screen, going up by 2's
         * for example 0, 2, 4, 6, 8, 10
         */
        System.out.printf("%nQuestion 8%n");
        for (int i = 0; i <= 10; i++)
            if (i < 10)
                System.out.printf("%d, ", i);
            else
                System.out.printf("%d", i);


        /**
         * Question 9 - in the space below write a for loop that will display the numbers 3-33 on the screen, going up by 3's
         * for example 3, 6, 9, ... 33
         */
        System.out.printf("%nQuestion 9%n");
        for (int i = 3; i <= 33; i = i + 3)
            if (i < 33)
                System.out.printf("%d, ", i);
            else
                System.out.printf("%d", i);


        /**
         * Question 10 - in the space below write a for loop that will display the numbers 33-3 on the screen, going down by 3's
         * for example 33, 30, 27, ... , 6, 3
         */
        System.out.printf("%nQuestion 10%n");
        for (int i = 33; i >= 3; i = i - 3)
            if (i > 3)
                System.out.printf("%d, ", i);
            else
                System.out.printf("%d", i);


        /**
         * Question 11 - create a method called "invalidPassword" accepts a String as an argument and returns true if the password is invalid, false otherwise.  The
         * valid password is "happy".
         */
        System.out.printf("%nQuestion 11%n");
        System.out.printf("Enter the valid Password: ");
        Scanner keyboard = new Scanner(System.in);
        String userinput = keyboard.nextLine();

        System.out.printf("%s%n", invalidPassword(userinput));


        /**
         * Question 12 - using a while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user
         * for a password until they put in the correct password
         */
        System.out.printf("%nQuestion 12%n");

        /**while (userinput != "Happy")
         {
         System.out.print("Enter the valid Password: ");
         }   */


        /**
         * Question 13 - using a do .... while loop and the invalidPassword method from question 7, setup a loop that will keep asking the user
         * for a password until they put in the correct password
         */
        System.out.printf("%nQuestion 13%n");
        /**do{
            System.out.printf("Enter the valid Password: ");
        } while(userinput != "Happy");*/


        /**
         * Question 14 - this will be a simple number guessing game.  Have the computer select a random number between 1 and 10.  Continuously
         * ask the user to guess the number.  If the user guesses the correct number, the screen should display "correct, it took you X attempts to guess
         * correctly" (where X is the # of attempts)
         */
        System.out.printf("%nQuestion 14%n");
        SecureRandom randomNumGenertor = new SecureRandom();

        int userGuessCount = 0;
        int compNum = randomNumGenertor.nextInt(10) + 1;
        int userGuess = 0;
        do {
            System.out.print("Enter your guess(1-10): ");
            userGuess = keyboard.nextInt();
            userGuessCount++;

        } while (userGuess != compNum);
        System.out.printf("Correct, it took you %d attempts to guess correctly", userGuessCount);


        /**
         * Question 15 - Write a method called "hasTeen".  The method should accept 3 integers as arguments.  The method should return true
         * if any of the arguments are in the range 13-19, false otherwise.  Use the code below to test your method.
         */
        System.out.printf("%nQuestion 15%n");
        System.out.printf("The method hasTeen(10, 40, 17) returns %s (should be true)%n", hasTeen(10, 40, 17));
        System.out.printf("The method hasTeen(10, 17, 50) returns %s (should be true)%n", hasTeen(10, 17, 50));
        System.out.printf("The method hasTeen(13, 10, 50) returns %s (should be true)%n", hasTeen(13, 10, 50));
        System.out.printf("The method hasTeen(13, 17, 19) returns %s (should be true)%n", hasTeen(13, 17, 19));
        System.out.printf("The method hasTeen(12, 20, 6)  returns %s (should be false)%n", hasTeen(12, 20, 6));


        /**
         * Question 16 - Create a method that will prompt the user to enter 10 numbers.
         * There should be a prompt for each number.  Once the user has entered
         * all 10 numbers, the computer should return the highest number entered
         */
        System.out.printf("%nQuestion 16%n");



    }


    public static String invalidPassword(String password) {

        if (password == "Happy")
            return "True";
        else
            return "False";
    }
        public static String hasTeen(int one,int two,int three) {
            if (one <= 19 && one >= 13)
                return "true";
            else if (two <= 19 && two >= 13)
                return "true";
            else if (three <= 19 && three >= 13)
                return "true";
            else
                return "False";
        }




        }




