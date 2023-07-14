package Switch1;

import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Switch1 switch1 = new Switch1();
        Switch1 switch2 = new Switch1();
        Scanner lector = new Scanner(System.in);
        System.out.println("Enter a option:");
        switch1.option = lector.nextInt();//Si el dato es String se le pone en next
        System.out.println(switch1.showOption());

    }
}
