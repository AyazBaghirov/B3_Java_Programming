package day18_loops;

public class BranchingExample {
    public static void main(String[] args) {
        // break
        // continue

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                continue;

            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                continue; // Once you reach this 'continue', go to the ENXT iteration.

            }
            System.out.print(" i = " + i);

        }
    }}

