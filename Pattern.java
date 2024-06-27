import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PATTERN type: ");
        int type = sc.nextInt();

        if (type == 1) {
            /*
        1. Print the pattern
            * * * * *
            * * * * *
            * * * * *
            * * * * *

         */
            for (int i = 1; i <= 4; i++){
                for (int j = 1; j <= 5; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        else if (type == 2) {
            /*
        2. Print the pattern
            * * * * *
            *       *
            *       *
            * * * * *

         */
            for (int i = 1; i <= 4; i++){
                for (int j = 1; j <= 5; j++){
                    if (i == 1 || j == 1 || i == 4 || j == 5) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        else if (type == 3) {
            /*
        3. Print the pattern
            *
            * *
            * * *
            * * * *

         */
            for (int i = 1; i <= 4; i++){
                for (int j = 1; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else if (type == 4) {
                        /*
        4. Print the pattern
            * * * *
            * * *
            * *
            *

         */
            for (int i = 4; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        else if (type == 5) {
                        /*
        5. Print the pattern
                   *
                 * *
               * * *
             * * * *

         */
            for (int i = 1; i <= 4; i++) {

                for (int space = 1; space <= 4 - i; space++) {
                    System.out.print("  ");
                }

                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        }
        else if (type == 6) {
                        /*
        6. Print the pattern
           1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5

         */
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        else {
            System.out.println("Invalid type!");
        }
    }
}