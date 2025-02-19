package com.berruhanedar._1_week;

public class _08_2_System {
        // If I use System.exit():
        // 1- The JVM stops
        // 2- All running threads are terminated
        // 3- The program's process is removed from the operating system

    public static void processCloseJvmStop() {
        System.out.println("Program started . System.exit(0)");
        System.exit(0);
        System.out.println("This line works? No"); // This line will never be executed
    }

    public static void processContinueJvmContinue() {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Program started . Break");
                System.out.println("Exiting only from the loop");
                break;
            }
            System.out.println(i + ". iteration");
        }
        System.out.println("Does this line execute?");
    }

    public static void main(String[] args) {
        // processCloseJvmStop();
        processContinueJvmContinue();
    }
}
