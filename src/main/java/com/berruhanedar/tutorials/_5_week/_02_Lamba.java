package com.berruhanedar.tutorials._5_week;


@FunctionalInterface
interface MyFunctionalInterface{
    void showMessage(String message);
}

public class _02_Lamba {
    public static void main(String[] args) {
        MyFunctionalInterface messagePrinter = (temp)-> System.out.println("Message: " + temp);
        messagePrinter.showMessage("Hello Lambda!");
    }

}
