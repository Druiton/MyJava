package mypackage;

import java.util.Scanner;

public class keyboardinput1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Press any button: ");
        String input = vvod.nextLine();
        System.out.println("You pressed: " + input);
    }
}
