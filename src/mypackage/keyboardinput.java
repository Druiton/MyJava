package mypackage;

import java.util.Scanner;

public class Vvodsklaviatyri {
    public static void main(String[] args){
        Scanner text = new Scanner(System.in);
        System.out.println("Íàæìèòå íà ëþáóþ êëàâèøó, à çàòåì íà ENTER: ");
        String vvod = text.nextLine();
        System.out.println("Âû íàæàëè íà êëàâèøó: " + vvod);

    }
}
