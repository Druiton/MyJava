package mypackage;

public class keyboardinput2 {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        System.out.println("Нажмите на любую клавишу, а затем на ENTER: ");
        ch = (char)
        System.in.read();
        System.out.println("Вы нажали на клавишу: " + ch);
    }

}
